package hw2;

public class AccountTester {

	public static void main(String[] args) {
		Account amount = new Account(1122, 20000.0, 0.045);
		amount.withdraw(2500.0); // withdraw $2,500
		amount.deposit(3000.0); // deposit $3,000
		System.out.println("Balance: " + amount.balance);
		System.out.println("Monthly Interest: " + amount.getMonthlyInterest(amount.getMonthlyInterestRate()));
		System.out.println("Date: " + amount.getDateCreated());
	}

}
