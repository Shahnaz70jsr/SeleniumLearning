package javaCollectionSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import org.apache.poi.poifs.crypt.temp.AesZipFileZipEntrySource;
public class LinkedHashSet1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Set<Integer>obj = new	LinkedHashSet<Integer>();
	obj.add(124);
	obj.add(101);
	obj.add(125);
	obj.add(721);
	System.out.println(obj);
	System.out.println(obj.size());
	System.out.println(obj.contains(124));
	System.out.println(obj.isEmpty());
	obj.add(120);
	obj.remove(721);
	System.out.println(obj.size());
	for (Integer eachobj : obj) {
		System.out.println(eachobj);
	}
	obj.clear();
	System.out.println(obj.isEmpty());
	}}
	
	




