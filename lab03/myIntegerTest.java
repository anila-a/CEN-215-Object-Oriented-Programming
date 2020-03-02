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
