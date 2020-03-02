package lab3_assignments;

public class myInteger {
	static int value;
	
	myInteger() {}
	myInteger(int value) {
		this.value = value;
	}
	
	public static int getInt() {
		return value;
	}
	
	public static boolean isEven() {
		if(value%2 == 0)
			return true;
		return false;
	}
	
	public static boolean isOdd() {
		if(value%2 == 1)
			return true;
		return false;
	}
	
	public static boolean isPrime() {
		if(value <= 1)
			return false;
		for(int i = 2; i < value; i++) {
			if(value%i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isEven(int myInteger) {
		if(myInteger%2 == 0)
			return true;
		return false;
	}
	
	public static boolean isOdd(int myInteger) {
		if(myInteger%2 == 1)
			return true;
		return false;
	}
	
	public static boolean isPrime(int myInteger) {
		if(myInteger <= 1)
			return false;
		for(int i = 2; i < myInteger; i++) {
			if(myInteger%i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean equals(myInteger valueT) {
		if(valueT.value == value) 
			return true;
		return false;
	}
	
	public static boolean equals(int testValue) {
		if(testValue == value) 
			return true;
		return false;
	}
	
	public static int parseInt(char[] values) {
		int sum = 0;
		for(char i: values) {
			sum += Character.getNumericValue(i);
		}
		return sum;
	}
	
	public static int parseInt(String value) {
		return Integer.parseInt(value);
	}
}
