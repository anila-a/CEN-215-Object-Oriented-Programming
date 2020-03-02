/* Write a program to create a file named Ex5.txt if it does not exist. Write 100 integers created
randomly into the file using text I/O. Integers are separated by spaces in the file. 
Read the data back from the file and display the sorted data. */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteReadData {
	public static void main(String[] args) {
		int[] arr = new int[100];
		populate(arr);
		writefile("Ex5.txt", arr);
		readfile("Ex5.txt");	
	}

	private static void readfile(String string) {
		try {
			Scanner in = new Scanner(new File(string));
			while(in.hasNext()) {
				System.out.print(in.next() + " | ");
			}
			in.close();
		} catch(FileNotFoundException e) {
			System.err.println("File does not exist or cannot read.");
		}	
	}

	private static void writefile(String string, int[] arr) {
		try {
			PrintWriter pw = new PrintWriter(new File("Ex5.txt"));
			for(int i: arr) pw.println(i);
			pw.close();
		} catch(FileNotFoundException e) {
			System.err.println("No write rights on file/folder.");
		}	
	}

	private static void populate(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 1001);
		}	
	}
}
