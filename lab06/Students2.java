/* Write a program that reads the student file. After reading it, you should 
show the information of student as follows: */

public class Students2 {

	private String name = "";
	private String Id = "";
	private double gl = 0, gm = 0, ga = 0, gs = 0;
	public Student(String name, String id, double gl, double gm, double ga, double gs) {
		super();
		this.name = name;
		Id = id;
		this.gl = gl;
		this.gm = gm;
		this.ga = ga;
		this.gs = gs;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public double getGl() {
		return gl;
	}
	public void setGl(double gl) {
		this.gl = gl;
	}
	public double getGm() {
		return gm;
	}
	public void setGm(double gm) {
		this.gm = gm;
	}
	public double getGa() {
		return ga;
	}
	public void setGa(double ga) {
		this.ga = ga;
	}
	public double getGs() {
		return gs;
	}
	public void setGs(double gs) {
		this.gs = gs;
	}
	
	public double getAve() {
		return (double)(gl+gm+ga+gs)/4.0;
	}
	@Override
	public String toString() {
		String[] c = name.split("_");
		return String.format("%-15s", Id) + String.format("%-15s", c[0]) + String.format("%-15s", c[1]) + String.format("%-15.0f", gl) + 
			String.format("%-15.0f", gm) + String.format("%-15.0f", ga) + String.format("%-15.0f", gs) + String.format("%-15.2f", getAve());

	}
	
}

