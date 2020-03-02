/* Define a custom exception called HexFormatException. Implement the hexToDecimal method to
throw a HexFormatException if the string is not a hex string. */

public class HexFormatException extends Exception {
	private String hex;
	public HexFormatException(String hex) {
		super("The " + hex + " is not in hexadecimal format.");
		this.hex = hex;
	}
	public String getHex() {
		return hex;
	}

}
