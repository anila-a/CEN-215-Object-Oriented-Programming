/* Write a program that reads the student file. After reading it, you should 
show the information of student as follows: */


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Students {

	public static void main(String[] args) {
		Student[] s = new Student[10];
		readfile(s, "students.txt");
		writefile(s, "src//studentdisplay.txt");
	}

	private static void writefile(Student[] s, String string) {
		String str = String.format("%-15s", "ID") + String.format("%-15s", "Name") + String.format("%-15s", "Surname") +
				String.format("%-15s", "Literature") + String.format("%-15s", "Math") + String.format("%-15s", "Art") + 
				String.format("%-15s", "Science") + String.format("%-15s", "Average") + "\n";
		try {
			PrintWriter pw = new PrintWriter(new File(string));
			pw.print(str);
			for(int i = 0; i < s.length; i++) {
				pw.print(s[i] + "\n");
			}
			pw.close();
		} catch (FileNotFoundException e) {
			System.err.println("No write rights on file/folder!");
		}
	}

	private static void readfile(Student[] s, String string) {
		String c, name = "", id = "";
		int i = 0, t = 0;
		double g1 = 0, g2 = 0, g3 = 0, g4 = 0;
		try {
			Scanner in = new Scanner(new File(string));
			while(in.hasNext()) {
				c = in.next();
				if(c.matches("\\w*_\\w*")) {
					name = c;	
					}
				else if(c.matches("\\d*")) {
					id = c;	}
				else if(c.equals("Literature")) {
					c = in.next();
					g1 = Double.parseDouble(c);
				}
				else if(c.equals("Math")) {
					c = in.next();
					g2 = Integer.parseInt(c);
				}
				else if(c.equals("Art")) {
					c = in.next();
					g3 = Integer.parseInt(c);
				}
				else if(c.equals("Science")) {
					c = in.next();
					g4 = Integer.parseInt(c);
					i++;
				}
				if(t != i) {
					s[t] = new Student(name, id, g1, g2, g3, g4);
				t++;}
			}
		}catch (FileNotFoundException e) {
			System.out.println("File does not exist or cannot be read!");
		}
	}

}

