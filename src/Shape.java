
public abstract class Shape {
	protected String kind;
	protected float positionX;
	protected float positionY;

	public Shape(String k, float x, float y) {
		kind = k;
		positionX = x;
		positionY = y;
	}
	
	public abstract void display();
}
