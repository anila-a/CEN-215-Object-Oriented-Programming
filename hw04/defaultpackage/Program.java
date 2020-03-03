package defaultpackage;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import model.Admin;
import model.User;
import model.Normal;
import model.RW.RWUser;

public class Program {
	
	 public static void main(String[] args) {
		 RWUser rwu = new RWUser();
		 boolean c = true;
		 while(c) {
			displayATM();
			System.out.println("Enter a choice: ");
			Scanner in = new Scanner(System.in);
			switch(in.nextInt()) {
			case 1: enter(rwu); 
					break;
			case 2: createAccount(rwu); 
					break; 
			case 3: c = false;
					break;
			default: System.out.println("Choose the right action!");
			}
		 }
	}
    
     private static void createAccount(RWUser rwu) {
    	Scanner in = new Scanner(System.in);
		System.out.println("Create User Account: ");
		System.out.println("Please enter account ID: ");
		
		boolean c = true;
		String id = "";
		while(c) {
			id = in.next();
		    if(id.matches("\\d{8}")) { 
		    	if(rwu.getUserbyID(id)!=null) 
		    		System.out.println("Choose another ID!");
		    	else
		    		c = false;
		    }
		    else System.out.println("ID must contain 8 digits!");
		}
		System.out.println("Please enter PIN: ");
		String PIN = in.next();
		System.out.println("Please enter Name: ");
		String name = in.next();
		System.out.println("Please enter Surname: ");
		String surname = in.next();
		System.out.println("Please enter Balance: ");
		
		double balance = 0;
		boolean t = true;
		while(t) {
			try{
				balance = in.nextDouble();
				t = false;
			} catch (InputMismatchException ex) {
				System.out.println("Invalid balance! Try again:");
				in.next();
			}
		}
		rwu.add(new Normal(id, PIN, name, surname, balance));
	}

	public static void displayATM() {
    	 System.out.println("ATM");
    	 System.out.println("---------------------");
    	 System.out.println("1. Enter");
    	 System.out.println("2. Create Account");
    	 System.out.println("3. Exit");
    	 System.out.println("---------------------");
     }
     
     public static void enter(RWUser rwu) {
    	 Scanner in = new Scanner(System.in);
    	 while(true) {
    		 
    		System.out.println("Enter Account ID");
	        String userId = in.next();
	        System.out.println("Enter pin");
	        String PIN = in.next();
	        
	        User us = rwu.checkLogIn(userId, PIN);
	        
	        if(us!=null) {
	        	if(us instanceof Admin) {
	        		Adm(rwu,(Admin)us);
	        	}else {
	        		Us(rwu,(Normal)us);
	        	}
	        }else System.out.println("The credentials you entered are wrong!!");
	     }
     }

	private static void Us(RWUser rwu, Normal us) {
		boolean c = true;
		while(c) {
			System.out.println("ATM - " + us.getName() + " " + us.getSurname());
			System.out.println("------------------");
			System.out.println( "1. Edit Account\n"
			                   +"2. Withdraw\n"
			                   +"3. Deposit\n"
			                   +"4. Transfer\n"
			                   +"5. View Transaction History\n"
			                   +"6. Exit");
			System.out.println("------------------");
			System.out.println("Please choose the action to do");
			Scanner in = new Scanner(System.in);
			double value;
			double previousBalance;
			switch(in.nextInt()) {
			case 1: rwu.editUser(us.getUserID()); 
					break;
			case 2: System.out.println("Enter amount to withdraw: ");
			        value = in.nextDouble();
			        previousBalance = us.getBalance();
			        us.withdraw(value);
			        rwu.writeTransactions(us, previousBalance, value, "Withdraw");
			        break; 
			case 3: System.out.println("Enter amount to deposit: ");
	                value = in.nextDouble();
	                previousBalance = us.getBalance();
	                us.deposit(value);
	                rwu.writeTransactions(us, previousBalance, value, "Deposit");
	                break;			        
			case 4: System.out.println("Enter amount to transfer: ");
	                value = in.nextDouble();
	                previousBalance = us.getBalance();
	                us.withdraw(value);
	                System.out.println("Enter accountID to whom you want to transfer");
	                String id = in.next();
	                Normal target = rwu.getUserbyID(id);
	                double targetBalance = target.getBalance();
	                target.deposit(value);
	                rwu.writeTransactions(target, targetBalance, value, "Transfer +"); 
	                rwu.writeTransactions(us, previousBalance, value, "Transfer -");
	                break;
			case 5: rwu.viewTransactionHistory(us);
			        break;
			case 6: c=false;break;
				default: System.out.println("Enter the right action!!");
			}
		}
	}

	private static void Adm(RWUser rwu, Admin us) {
		boolean c = true;
		while(c) {
			System.out.println("ATM - " + us.getName() + " "+ us.getSurname());
			System.out.println("------------------");
			System.out.println("1. Add Account");
			System.out.println("2. Edit Account");
			System.out.println("3. Search user");
			System.out.println("4. Remove user");
			System.out.println("5. List of users");
			System.out.println("6. Exit");
			System.out.println("------------------");
			System.out.println("Please choose the action to do");
			Scanner in = new Scanner(System.in);
			switch(in.nextInt()) {
			case 1: createAccount(rwu); 
					break;
			case 2: System.out.println("Enter accountID to edit: "); 
			        rwu.editUser(in.next());  
			        break;
			case 3: searchUsers(rwu);
			        break;			        
			case 4: System.out.println("Remove user by entering account ID:");
		            rwu.delete(rwu.getUserbyID(in.next())); 
		            break;
			case 5: System.out.println("---List of users---");
			        ListOfUsers((rwu.getUsers())); 
			        break;
			case 6: c = false;
					break;
				default: System.out.println("Try again!");
			}
		}
	}
	
	private static void searchUsers(RWUser rwu) {
		boolean t = true;
		Scanner in = new Scanner(System.in);
        while(t) {
	        System.out.println("------------------");
	        System.out.println("-Search by:");
	        System.out.println("1. Name ");
	        System.out.println("2. Surname ");
	        System.out.println("3. Account Number ");
	        System.out.println("4. Back "); 
	        
	        Normal user;
        	switch(in.nextInt()) {
        	case 1: System.out.println("Enter name to search user: ");
        	        user = rwu.searchUserbyName(in.next());
        	           if(user!=null) 
        	        	     System.out.println(user.getUserID() + " - " + user.getName()
        	        	                        + " - " + user.getSurname() + " -> " + user);
        	           else
        	            	System.err.println("User does not exist!");
        	        break;
        	case 2: System.out.println("Enter surname to search user: ");
	                    user = rwu.searchUserbySurname(in.next());
	                    if(user!=null) 
	        	             System.out.println(user.getUserID() + " - " + user.getName()
	        	                                + " - " + user.getSurname() + " -> " + user);
	                    else
	        	             System.err.println("User does not exist!");
	                break;
        	case 3: System.out.println("Enter ID to search user: ");
	                user = rwu.getUserbyID(in.next());
	                    if(user!=null) 
	        	             System.out.println(user.getUserID() + " - " + user.getName()
	        	                                + " - " + user.getSurname() + " -> " + user);
	                    else
	        	             System.err.println("User does not exist!");
	                    break;
        	case 4: t = false; 
        			break;
        	       default: System.out.println("Try again!");
        	}
        }
	}

	private static void ListOfUsers(ArrayList<User> users) {
		for(User i: users) {
			if(i instanceof Normal) {
				System.out.println(i.getUserID() + " - " + i.getName() + " - " + i.getSurname() + " -> " + (Normal)i);
			}
		}
	}
}
