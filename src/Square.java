
public class Square extends Shape {	
	public Square(String k, float x, float y) {
		super(k, x, y);
	}
	
	public void display() {
		System.out.print("This is Square. ");
		System.out.println("X: "+positionX+" Y: "+positionY);
	}
}
