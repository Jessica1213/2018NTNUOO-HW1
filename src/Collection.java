
import java.util.ArrayList;
import java.util.Collections;

public class Collection { 
	private ArrayList<String> allTypes = new ArrayList<String>();
	
	public void addType(String t) {
		if(!allTypes.contains(t)) {
			allTypes.add(t);
		}
	}
	
	public void sort() {
		Collections.sort(allTypes);
	}
	
	public void display() {
		System.out.println("Show all Shape Types:");
		for(String t: allTypes) {
			System.out.println(t);
		}
	}
}
