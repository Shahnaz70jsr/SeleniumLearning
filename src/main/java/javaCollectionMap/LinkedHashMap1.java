package javaCollectionMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
public class LinkedHashMap1 {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer>Result = new LinkedHashMap<String, Integer>();
	Result.put("Agronomy",98);
	Result.put("Horticulture",90);
	Result.put("Plant Pathology",95);
	Result.put("Genetics", 100);
	Result.put("Arometic Chemistry",85);
	System.out.println(Result);
	System.out.println(Result.size());
	System.out.println(Result.containsKey("Agronomy"));
	for(Entry<String,Integer>eachResult: Result.entrySet()) {
	System.out.println(eachResult.getKey()+" "+eachResult.getValue());
     }
	Result.clear();
	System.out.println(Result.isEmpty());
	}	
}

		
	
	
	
		
	
	


