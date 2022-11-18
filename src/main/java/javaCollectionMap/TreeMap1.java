package javaCollectionMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
public class TreeMap1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Map<Integer, Integer>Roll = new TreeMap<Integer, Integer>();
	Roll.put(10, 11);
	Roll.put(12, 13);
	Roll.put(14, 15);
	Roll.put(16, 17);
	Roll.put(18, 19);
	for(Entry<Integer, Integer>eachRoll:Roll.entrySet() ) {
   System.out.println(eachRoll.getKey()+ "  "+ eachRoll.getValue());
	}
	System.out.println(Roll.size());
	System.out.println(Roll.containsKey(14));
	Roll.remove(14);
	System.out.println(Roll.size());
	Roll.clear();
	System.out.println(Roll.isEmpty());
	}
	}