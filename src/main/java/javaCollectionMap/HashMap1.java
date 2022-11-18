package javaCollectionMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import org.apache.commons.collections4.map.HashedMap;
public class HashMap1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String>name = new HashMap<String, String>();
		name.put("FirstName", "Last Name");
		name.put("Kamal", "Sohel");
		name.put("Anannay", "Shadh");
		name.put("Shahanaz", "Begum");
	System.out.println(name);
	System.out.println(name.containsValue("sohel"));
	System.out.println(name.containsKey("Kamal"));
	System.out.println(name.size());
	for(Entry<String, String>eachName: name.entrySet()) {
	System.out.println(eachName.getKey()+ " "+ eachName.getValue());
	}
	name.remove("shahanaz");
	System.out.println(name.size());
	name.clear();
	System.out.println(name.isEmpty());
	
	}}
