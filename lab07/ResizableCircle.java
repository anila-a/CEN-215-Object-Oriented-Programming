
public class ResizableCircle extends Circle2 implements Resizable {

	public ResizableCircle(double rad) {
		super(rad);
	}
	
	public void resize(double x) {
		this.rad = x;
	}
	
}
