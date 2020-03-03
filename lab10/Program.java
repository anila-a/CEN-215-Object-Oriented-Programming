import java.util.ArrayList;
import java.util.Scanner;

import model.Admin;
import model.MyDate;
import model.Person;
import model.User;
import model.RW.RWUser;

public class Program {

	public static void main(String[] args) {
		RWUser rwu=new RWUser();
		int countErr=0;
		while(true) {
			Scanner in=new Scanner(System.in);
			System.out.println("Enter Username");
			String user=in.next();
			System.out.println("Enter Password");
			String pass=in.next();
			User us=rwu.checkLogin(user, pass);
			if(us!=null) {
				if(us instanceof Admin) {
					//Veprimet e Adminit
					veproAdmin(rwu,(Admin)us);
				} else {
					//Veprimet e Personit
					System.out.println(us.getId()+" - "+ us.getUser()+""
							+ " -> "+(Person) us);
					changeUser((Person)us,rwu);
				}
								
			} else {
				System.out.println("Your Credentials are wrong, try again!!");
				if(countErr++==3) break;
			}
		}

	}

	private static void veproAdmin(RWUser rwu, Admin us) {
		System.out.println("Welcome "+us.getName()+" from "+us.getOrganization());
		boolean t=true;
		while(t) {
		System.out.println("Please choose an action to do:"
				+ "\n1. View Users"
				+ "\n2. Add Users"
				+ "\n3. Delete Users by Id"
				+ "\n4. Edit User by Id"
				+ "\n5. Logout");
		Scanner in = new Scanner(System.in);
		switch(in.next()) {
		case "1": viewUsers(rwu.getUsers()); break;
		case "2": System.out.println("Enter User Data as follows"
				+ "\nUsername, Password, name, address and birthday (dd/mm/yyyy) with spaces");
				rwu.add(new Person(in.next(),in.next(),
						in.next(),in.next(),new MyDate(in.next())));
				break;
		case "3": System.out.println("Enter Id of person to remove");
					User x=rwu.getPersonById(in.nextInt());
					if(x!=null) {rwu.delete(x); 
					System.out.println("The person is deleted successfully");
					} else System.out.println("The person does not exists");
					break;
		case "4": System.out.println("Enter Id of person to edit");
					User x1=rwu.getPersonById(in.nextInt());
					if(x1!=null) {
						changeUser((Person)x1,rwu);
					} else {
						System.out.println("The person does not exists");
					}
					break;
		case "5": t=false;break;
		default: System.out.println("No valid Option");
		}
		}
	}

	private static void viewUsers(ArrayList<User> users) {
		if(users.size()==0) System.out.println("No Persons found");
		else
		for(User i:users)
			if(i instanceof Person)
				System.out.println(i.getId()+" - "+ i.getUser()+""
						+ " -> "+(Person) i);
	}

	private static void changeUser(Person x1, RWUser rwu) {
		System.out.println("What do you want to change:"
				+ "\n1. Name"
				+ "\n2. address"
				+ "\n3. Password"
				+ "\n4. Birthday");
		Scanner in=new Scanner(System.in);
		switch(in.next()) {
		case "1": System.out.println("Enter new name: ");
					x1.setName(in.next());	break;
		case "2": System.out.println("Enter new Address: ");
					x1.setAddress(in.next());	break;
		case "3": System.out.println("Enter new Password: ");
					x1.setPass(in.next());	break;
		case "4": System.out.println("Enter new Birthday (dd-mm-yyyy): ");
					x1.setBd(new MyDate(in.next()));	break;
		default: System.out.println("No valid option");
		}
		rwu.update();
	}

}
