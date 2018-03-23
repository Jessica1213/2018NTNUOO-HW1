import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		ShapeDataBase dataBase = new ShapeDataBase();
		dataBase.buildAllShapes();
	    dataBase.display();
	}
}
