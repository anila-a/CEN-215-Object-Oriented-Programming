package lab5;

public class MyDate {
	private int d;
	private int m;
	private int y;
	
	public MyDate(int d, int m, int y) {
		this.d = d;
		this.m = m;
		this.y = y;
	}
	
	public MyDate(String date) {
		String[] arr = date.split("[/-]");
		this.d = Integer.parseInt(arr[0]);
		this.m = Integer.parseInt(arr[1]);
		this.y = Integer.parseInt(arr[2]);
	}
	
	public String toString() {
		return d + "/" + m + "/" + y; 
	}
}
