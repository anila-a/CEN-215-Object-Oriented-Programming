/* Define a custom exception called HexFormatException. Implement the hexToDecimal method to
throw a HexFormatException if the string is not a hex string. */

import java.util.Scanner;

public class ex2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a hexadecimal number: ");
		String str = in.next();
		try {
			System.out.println("The converted number of " + str + " is " + hexToDecimal(str));
		} catch(HexFormatException e) {
			System.err.println(e.getMessage());
		}
	}

	private static int hexToDecimal(String str) throws HexFormatException {
		int sum = 0;
		if(str.matches("^[\\da-fA-F]+$")) {
			//veprimet e transformimit
			for(int i = 0; i < str.length(); i++) {
				if(str.charAt(i) >= '0' && str.charAt(i) - '0' < 10) {
					sum += (str.charAt(i) - '0') * power(16, str.length() - i - 1);
				} else if (str.charAt(i) >= 'a' && str.charAt(i) - 'f' < 6) {
					sum += ((str.charAt(i) - 'a') + 10) * power(16, str.length() - i - 1);
				}
				else if (str.charAt(i) >= 'A' && str.charAt(i) - 'F' < 6) {
					sum += ((str.charAt(i) - 'a') + 10) * power(16, str.length() - i - 1);
				}
			}
		} else {
			throw new HexFormatException(str);
		}
		return sum;	
	}

	private static int power(int i, int j) {
		int p = 1;
		for(; j > 0; j--) p *= i;
		
		return p;
	}		
}
