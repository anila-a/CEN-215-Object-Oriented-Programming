package lab2_assignment;

public class ex4 {

	public static void main(String[] args) {
		double celcius = 10.0;
		double fahrenheit = 50.0;
		
		System.out.println("Celcius\tFahrenheit");
		for(int i = 0; i < 5; i++) {
			System.out.println(celcius + "\t" + celciusToFahrenheit(celcius));
			celcius += 5;
		}
		
		System.out.println();
		
		System.out.println("Fahrenheit\tCelcius");
		for(int i = 0; i < 5; i++) {
			System.out.println(fahrenheit + "\t\t" + fahrenheitToCelcius(fahrenheit));
			fahrenheit += 5;
		}
	}
	
	public static double celciusToFahrenheit(double celcius) {
		return (9.0 / 5) * celcius + 32;
	}
	
	public static double fahrenheitToCelcius(double fahrenheit) {
		return (5.0 / 9) * (fahrenheit - 32);
	}
	
}
