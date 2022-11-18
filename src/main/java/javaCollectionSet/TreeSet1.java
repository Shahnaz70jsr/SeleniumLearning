package javaCollectionSet;
import java.util.Set;
import java.util.TreeSet;
import loopsConcept.ForLoop;
public class TreeSet1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Set<Integer>obj = new TreeSet<Integer>();
	obj.add(456);
	obj.add(101112);
	obj.add(789);
	obj.add(123);
	obj.add(000);
	System.out.println(obj);
	System.out.println(obj.size());
	obj.add(122);
	System.out.println(obj);
	obj.remove(123);
	System.out.println(obj);
	obj.add(123);
	System.out.println(obj);
	obj.remove(122);
	System.out.println(obj);
	System.out.println(obj.contains(123));
	for (Integer eachobj : obj) {
		System.out.println(eachobj);
	}	
	obj.clear();
	System.out.println(obj.isEmpty());
	}
}