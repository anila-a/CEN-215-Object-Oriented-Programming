/* Sum the numbers taken as a command line arguments. */

package lab2_assignment;

public class sum {

	public static void main(String[] args) {
		int sum = 0;
		if(args.length > 0) {
			System.out.print("The sum of ");
			for(String i:args) {
				System.out.print(i + ", ");
				sum += Integer.parseInt(i);
			}
			System.out.println(" is " + sum);
		} else System.out.println("No arguments.");

	}

}

