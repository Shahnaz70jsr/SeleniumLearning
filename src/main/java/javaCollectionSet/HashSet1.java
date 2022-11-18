	
package javaCollectionSet;
	import java.util.HashSet;
	import java.util.Set;
	import loopsConcept.ForLoop;
	public class HashSet1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Set<Integer> obj = new HashSet<Integer>();
	obj.add(124);
	obj.add(101);
	obj.add(125);
	obj.add(721);
	System.out.println(obj);
	System.out.println(obj.size());
	System.out.println(obj.contains(124));
	System.out.println(obj.add(800));
    for (Integer eachobj : obj) {
	System.out.println(eachobj);
	obj.remove(101);
	System.out.println(obj.size());
	System.out.println(obj.isEmpty());
	obj.clear();
	System.out.println(obj.isEmpty());

}
	
}	
	}


