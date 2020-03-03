package model;

public class Admin extends User implements Checker{
	private String bankName;

	public Admin(String userID, String PIN, String name, String surname, String bankName) {
		super(userID, PIN, name, surname);
		this.bankName = bankName;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	@Override
	public String toString() {
		return "Admin [bankName=" + bankName + ", getBankName()=" + getBankName() + "]";
	}
	
	@Override
	public boolean checkUser(String userID, String PIN) {
		return userID.equals(this.getUserID()) && PIN.equals(this.getPIN());	
	}
	
}
