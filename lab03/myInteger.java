/* Design a class named MyInteger. The class contains:
An int data field named value that stores the int value represented by this object.
A constructor that creates a MyInteger object for the specified int value.
A get method that returns the int value.
Methods isEven(), isOdd(), and isPrime() that return true if the value is even, odd, or prime, respectively.
Static methods isEven(int), isOdd(int), and isPrime(int) that return true if the specified value is even, odd, or prime, respectively.
Static methods isEven(MyInteger), isOdd(MyInteger), and isPrime(MyInteger) that return true if the specified value is
even, odd, or prime, respectively.
Methods equals(int) and equals(MyInteger) that return true if the value in the object is equal to the specified value.
A static method parseInt(char[]) that converts an array of numeric characters to an int value.
A static method parseInt(String) that converts a string into an int value. Draw the UML diagram for the class. Implement the
class. 

Write a client program that tests all methods in the class. */

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
