package lab5;

public class CreateAliens {

	public static void main(String[] args) {
		Alien[] alien = {
				new Martian(3, "yellow", "blue", 4, 5, "green"),
				new Martian(6, "blue", "pink", 2, 3, "black"),
				new Jupiterian(1, "red", "green", 6, 3, "purple")
		};
		
		for(Alien i: alien) {
			if(i instanceof Martian) {
				System.out.println("Martian: " + ((Martian) i).toString());
			}
		}
		for(Alien i: alien) {
			if(i instanceof Jupiterian) {
				System.out.println("Jupiterian: " + ((Jupiterian) i).toString());
			}
		}
	}
}
