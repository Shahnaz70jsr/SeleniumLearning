package javaCollectionSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
public class TreeSet2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Set<Integer> obj = new LinkedHashSet<Integer>();
	Set<String>colour = new  TreeSet<String>();
	colour.add("Red");
	colour.add("White");
	colour.add("Blue");
	colour.add("Green");
	colour.add("Sky");
	System.out.println(colour);
	System.out.println(colour.size());
	colour.remove("Sky");
	System.out.println(colour);
	colour.add("Yellow");
	System.out.println(colour);
	System.out.println(colour.contains("Red"));
	for (String eachcolour : colour) {
		System.out.println(eachcolour);
		}
	colour.clear();
	colour.isEmpty();
	System.out.println(colour.isEmpty());
	
	}	
}



