package lab5;
import java.util.Scanner;

public class Tester {
	public static void main(String[] args) {
		Person[] prs = {
			new Student("Fane", "sophomore"),
			new Staff("Denisa", "A125", 500, new MyDate("14-11-2019"), "IT"),
			new Employee("Endri", "A126", 700, new MyDate("10/5/2010")),
			new Faculty("Bjorn", "E036", 900, new MyDate(5,9,2018), 16, "B.Sc"),
			new Person("Kejdi", "Shijak", "01234564", "kdomi18@epoka.edu.al")
		};
		
		Scanner in = new Scanner(System.in);
		search(in.next(), prs);
	}
	
	private static void search(String next, Person[] prs) {
		boolean t = false;
		for(Person i: prs) {
			if(i.getName().contentEquals(next)) {
				System.out.println(i + ((i.getAddress() != null) ?
						" | Address: " + i.getAddress(): "") +
						((i.getPhone() != null) ? " | Person: " + i.getPhone(): "") + 
						((i.getEmail) != null) ? " | Email: " + i.getEmail(): "")
						+ ((i instanceof Employee) ?
								"\n | Office: " + ((Employee) i).getOffice()
								+ " | Salary: " + ((Employee) i).getSalary()
								+ " | Date Hired: " + ((Employee) i).getDate(): "")
						+ ((i instanceof Student) ? "\n | Status: " + ((Student) i).getStatus()
						+ ((i instanceof Staff) ? "\n | Title: " + ((Staff) i).getTitle(): "")
						+ ((i instanceof Faculty) ? "\n | Hours: " + ((Faculty) i).getHours()
								+ " | Rank: " + ((Faculty) i).getRank(): ""));
				t = true; break;
			}
			if(!t) System.out.println("Person not found!");
		}
	}
}
