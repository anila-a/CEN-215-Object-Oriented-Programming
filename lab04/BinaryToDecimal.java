package lab4_assignment;

public class BinaryToDecimal {
	String str;
	
	public BinaryToDecimal(String str) {
		this.str = str;
	}
	public String getStr() {
		return str;
	}
	public int BinaryToDecimalConversion() {
		int s = Integer.parseInt(this.str, 2);
		return s;
	}
}

