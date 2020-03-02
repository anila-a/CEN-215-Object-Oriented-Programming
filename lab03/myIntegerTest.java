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

public class myIntegerTest {
	public static void main(String[] args) {
		myInteger int1 = new myInteger(13);
		myInteger int2 = new myInteger(6);
		myInteger int3 = new myInteger(34);
		
		System.out.println("Checking if the number is even:");
		System.out.println(int1.getInt() + " is " + int1.isEven());
		System.out.println(int2.getInt() + " is " + int2.isEven());
		System.out.println(int3.getInt() + " is " + int3.isEven());
		
		System.out.println("Checking if the number is odd:");
		System.out.println(int1.getInt() + " is " + int1.isOdd());
		System.out.println(int2.getInt() + " is " + int2.isOdd());
		System.out.println(int3.getInt() + " is " + int3.isOdd());
		
		System.out.println("Checking for primality:");
		System.out.println(int1.getInt() + " is " + int1.isPrime());
		System.out.println(int2.getInt() + " is " + int2.isPrime());
		System.out.println(int3.getInt() + " is " + int3.isPrime());

		System.out.println(int1.getInt() + " equals " + int2.getInt() + " " + int1.equals(int2));
		System.out.println(myInteger.parseInt(new char[] {'1', '2', '3'}));
		System.out.println(myInteger.parseInt("789"));
	}
}
