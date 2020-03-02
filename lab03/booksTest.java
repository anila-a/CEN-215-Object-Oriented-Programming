/* Create Book class with the following fields:
ISBN, Name, Author, Publisher, Price
Write the respective constructors, getters and setters for the class.
Create another class with the main method; create an array of Book objects.
Write methods that:
Sort and print
a. by ISBN
b. by Name
c. by Author
d. by Publisher
e. by Price
Search a book according to their fields (ISBN, Name, Author,
Publisher). */

package lab3_assignments;

public class booksTest {
	public static void main(String[] args) {
		books[] bks = {
				new books("12345", "War and Peace", "Tolstoy", "Pegi", 65),
				new books("67890", "Chronicles in Stone", "Kadare", "Onufri", 7),
				new books("34566", "I huaji", "Alber Kamy", "Albas", 5),
				new books("34545", "Metamorfoza", "Franc Kafka", "Epoka", 85),
				new books("45643", "Harry Potter", "J.K.Rowling", "Bota e re", 69)
			};
			for(books i:bks) {
				System.out.print(i);
	 		}
			System.out.println("====Sort by names====");
			sortBy(bks, "Name");
			for(books i: bks) {
				System.out.println(i);
			}
			System.out.println("====Sort by author====");
			sortBy(bks, "Author");
			for(books i: bks) {
				System.out.println(i);
			}
			System.out.println("====Sort by ISBN====");
			sortBy(bks, "ISBN");
			for(books i: bks) {
				System.out.println(i);
			}
			System.out.println("====Sort by publisher====");
			sortBy(bks, "Publisher");
			for(books i: bks) {
				System.out.println(i);
			}
			System.out.println("====Sort by price====");
			sortBy(bks, "Price");
			for(books i: bks) {
				System.out.println(i);
			}
	}
	
	private static void sortBy(books[] bks, String cond) {
		books temp; boolean b = false;
		for(int i = 0; i < bks.length-1; i++) {
			for(int j = i+i; j < bks.length; j++) {
				if(cond == "ISBN") {
					b = bks[i].getISBN().compareTo(bks[j].getISBN()) > 0;
				}
				else if(cond == "Name") {
					b = bks[i].getName().compareTo(bks[j].getName()) > 0;
				}
				else if(cond == "Price") {
					b = bks[i].getPrice() < bks[j].getPrice();
				}
				else if(cond == "Author") {
					b = bks[i].getAuthor().compareTo(bks[j].getAuthor()) > 0;
				}
				else if(cond == "Publisher") {
					b = bks[i].getPublisher().compareTo(bks[j].getPublisher()) > 0;
				}
				if(b) {
					temp = bks[i];
					bks[i] = bks[j];
					bks[j] = temp;
				}
			}
		}
	}
}
