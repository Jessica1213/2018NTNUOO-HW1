import java.io.*;
public class mainpage {
	public static void main(String[] args) throws IOException 
	{
		ShapeDataBase dataBase = new ShapeDataBase();
		dataBase.BuildAllShapes();
	    System.out.println("There are "+ dataBase.getSize() + " shapes in the Database.");
	    dataBase.allcollections.Display();
	    for(int i=0; i<dataBase.getSize(); ++i) 
	    {
	    	dataBase.getAllShapes()[i].Display();
	    }
		
	}
}
