
public class Circle extends Shape {	
	public Circle(String k, float x, float y) {
		super(k, x, y);
	}
	
	public void display() {
		System.out.print("This is Circle. ");
		System.out.println("X: "+positionX+" Y: "+positionY);
	}	
}
