
import java.io.*;
import java.util.ArrayList;

public class ShapeDataBase {
	private ArrayList<Shape> allShapes = new ArrayList<Shape>();
	private Collection allcollections = new Collection();

	public void buildAllShapes() throws IOException {    
		FileReader FileStream = new FileReader("shapes.txt"); 
        BufferedReader br = new BufferedReader(FileStream);
        String data;
        do {
        	data = br.readLine();
          	if(data == null)
        		break;         
        	String[] str = data.split("[,;\\s]+");
        	char k = str[0].charAt(0);
        	int x = Integer.parseInt(str[1]);
        	int y = Integer.parseInt(str[2]);
        	
        	switch(k) {
        	case 'c':
        		allShapes.add(new Circle(str[0] , x, y));
		      	break;
        	case 's':
        		allShapes.add(new Square(str[0] , x, y));
		      	break;
        	case 't':
        		allShapes.add(new Triangle(str[0] , x, y));
		      	break;
		    default:
		    	System.out.println("Category cannot be found.");
		    }
		    allcollections.addType(str[0]);
		 } while(true);   
		 br.close();    
    }

	public void display() {
		System.out.println("There are "+ allShapes.size() + " shapes in the Database.");
	    allcollections.display();
	    System.out.println();
	    
	    System.out.println("The details of the database.");
	    for(Shape shape : allShapes) {
	    	shape.display();
	    }
	}
}
