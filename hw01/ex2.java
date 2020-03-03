package hw1;

public class ex2 {

	public static void main(String[] args) {
		int[] values = new int[args.length];
		int k = 0;
		
		if(args.length< 1) System.out.println("Please enter more arguments!");
		
		for(String i: args) {
			values[k] = Integer.parseInt(i);
			k++;
		}
		
		System.out.println("Sum of args is: " + sumOfArgs(values));
		System.out.println("Difference of args is: " + subtractionOfArgs(values));
		System.out.println("Product of args is: " + multiplicationOfArgs(values));
		System.out.println("Quotient of args is: " + divisionOfArgs(values));
	}

	public static float divisionOfArgs(int...x) {
		float result = x[0];
		for(int i: x) {
			result /= i;
		}
		return result;
	}

	public static long multiplicationOfArgs(int...x ) {
		long result = 1;
		for(int i: x) {
			result *= i;
		}
		return result;
	}

	public static long subtractionOfArgs(int...x) {
		long result = x[0];
		for(int i: x) {
			result -= i;
		}
		result += x[0];
		return result;
	}

	public static long sumOfArgs(int...x) {
		long result = x[0];
		
		for(int i: x) {
			result += i;
		}
		return result;
	}
}
