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

public class books {
	@Override
	public String toString() {
		return "books [ISBN=" + ISBN + ", name=" + name + ", author=" + author + ", publisher=" + publisher + ", price="
				+ price + "]";
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public books(String iSBN, String name, String author, String publisher, double price) {
		super();
		ISBN = iSBN;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
	}
	String ISBN, name, author, publisher;
	double price;

}
