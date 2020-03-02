package lab4_assignment;

public class Password {
	public boolean checkPass(String pass) {
		return pass.matches("[a-zA-z0-9]{8,}");
	}
}
