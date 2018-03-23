
public class Triangle extends Shape {
	public Triangle(String k, float x, float y) {
		super(k, x, y);
	}
	
	public void display() {
		System.out.print("This is Triangle. ");
		System.out.println("X: "+positionX+" Y: "+positionY);
	}
}
