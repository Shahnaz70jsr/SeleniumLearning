package javaCollectionSet;
import java.util.HashSet;

import java.util.Set;
public class HashSet2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Set<String>insect = new HashSet<String>();
	insect.add("Beetle");
	insect.add("Ladybird beetle");
	insect.add("Bee");
	insect.add("Butter fly");
	insect.add("Honybee");
	System.out.println(insect);
	System.out.println(insect.size());
	System.out.println(insect.contains("Ladybird beetle"));
	insect.add("Longhorn fly");
	for (String eachinsect : insect) {
		System.out.println(eachinsect);	
	}
	insect.clear();
	System.out.println(insect.isEmpty());
	}
}
