package model;

public class Admin extends User implements Checker {
	private String name, organization;

	public Admin(String user, String pass, String name, String organization) {
		super(user, pass);
		this.name = name;
		this.organization = organization;
	}

	public String getName() {
		return name;
	}

	public String getOrganization() {
		return organization;
	}

	@Override
	public boolean checkUser(String user, String pass) {
		return user.equals(this.getUser())&&pass.equals(this.getPass());
	}
	
}
