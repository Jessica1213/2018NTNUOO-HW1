import java.util.ArrayList;
import java.util.Collections;

public class Collection 
{ 
	private static ArrayList<String> allTypes = new ArrayList<>();
	
	public Collection() {}
	public void addType(String t) 
	{
		if(!allTypes.contains(t)) {
			allTypes.add(t);
		}
	}
	
	public void sort() 
	{
		Collections.sort(allTypes);
	}
	
	public void Display() 
	{
		System.out.println("Show all Shape Type:");
		for(String t: allTypes) 
		{
			System.out.println(t);
		}
	}
}
