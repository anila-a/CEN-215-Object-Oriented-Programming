/* Write a program that reads a file with numbers and letters. 
In the read file, replace all the numbers with # sign. Write the modified data into another file */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReplaceText {
	public static void main(String[] args) {
		String str = readfile("with_numbers.txt");
		String newstr = str.replaceAll("\\d+", "#");
		writefile(newstr, "newfile.txt");
	}

	private static String writefile(String str, String string) {
		try {
			PrintWriter pw = new PrintWriter(new File(string));
		} catch(FileNotFoundException e) {
			System.err.println("File does not exist or cannot read.");
		}
		return null;
	}	

	private static String readfile(String string) {
		String str = "";
		try {
			Scanner in = new Scanner(new File(string));
			while(in.hasNextLine()) {
				str += in.nextLine() + "\n";
			}
			} catch(FileNotFoundException e) {
				System.err.println("File does not exist or cannot read.");
			}
			return null;
		}
	
}

