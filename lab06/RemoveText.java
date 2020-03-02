/* Write a program that removes all the
occurrences of a specified string from a text file. */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ex3 {	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		String str = readfile("src//lab6//Lincoln.txt", s);
		writefile(str, "src//output.txt");
	}


	private static void writefile(String str, String string) {
		try {
			PrintWriter pw = new PrintWriter(new File(string));
			pw.print(str);
			pw.close();
		} catch (FileNotFoundException e) {
			System.err.println("No write rights on file/folder!");
		}
	}

	private static String readfile(String string, String s) {
		String str = "";
		int i = 0;
		try {
			Scanner in = new Scanner(new File(string));
			while(in.hasNext()) {
					String c = in.next();;
					if(c.equals(s));
					else {
						str += c + " ";
						i++;}
				if(i > 15) {
					str += "\n";
					i = 0;
				}
			}
		}catch (FileNotFoundException e) {
			System.out.println("File does not exist or cannot be read!");
		}
		return str;
	}
}
