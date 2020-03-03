package hw2;

import java.util.Scanner;

public class ATMTester {

	public static void main(String[] args) {
		ATM[] acc = new ATM[10];
		for(int i = 0; i < 10; i++)
			acc[i] = new ATM(i, 100.0);
		int c;
		System.out.println("Enter an id: ");
		Scanner in = new Scanner(System.in);
		int id = in.nextInt();
		
		if(id < 1 || id > 10)
			incorrectId(id);
		while(true) {
			System.out.println("Main menu");
			System.out.println("1: check balance");
			System.out.println("2: withdraw");
			System.out.println("3: deposit");
			System.out.println("4: exit");
			
			System.out.println("Enter a choice: ");
			c = in.nextInt();
			if(c == 4) {
				System.out.println("Enter an id: ");
				id = in.nextInt();
				
				if(id < 1 || id > 10)
					incorrectId(id);
			}
			choose(id, c, acc);
		}
	}
	
	private static void choose(int id, int c, ATM[] acc) {
		Scanner in = new Scanner(System.in);
		if(c == 1) 
			System.out.println("The balance is " + acc[c].balance());
		else if(c == 2) 
			System.out.println("Enter the amount to withdraw: " + acc[c].withdraw(in.nextDouble()));
		else if(c == 3) 
			System.out.println("Enter the amount to deposit: " + acc[c].deposit(in.nextDouble()));
		else
			break;
	}
	
	private static int incorrectId(int id) {
		Scanner in = new Scanner(System.in);
		while(id < 1 || id > 10) {
			System.out.println("Please enter a valid id: ");
			id = in.nextInt();
			System.out.println();
		}
		return id;
	}

}
