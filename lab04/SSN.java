package lab4_assignment;

public class SSN {
	// public boolean checkSSN(String ssn) {
		// if(ssn.length() == 11) {
			// char[] cstr = ssn.toCharArray(); // Convert string to char 
			// for(int i = 0; i < cstr.length; i++) {
				// if(i == 3 || i == 6) {
					// if(cstr[i] != '-') return false;
				// } else {
					// if(cstr[i]<'0'||cstr[i]>'9')
						// return false;
				// }
			// }
			// return true;
		// }
		// return false;
	// }
	public boolean checkSSN(String ssn) {
		//return ssn.matches("\\d\\d\\d-\\d\\d-\\d\\d\\d\\d");
		return ssn.matches("\\d{3}-\\d{2}-\\d{4}");
	}
	
}
