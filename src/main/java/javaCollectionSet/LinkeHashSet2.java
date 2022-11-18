package javaCollectionSet;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
public class LinkeHashSet2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> sub = new LinkedHashSet<String>();
		sub.add("Agronomy");
		sub.add("Horticulture");
		sub.add("Entomology");
		sub.add("Genetics");
		sub.add("Plantpathology");
		System.out.println(sub);
		//System.out.println(sub.size());
		System.out.println(sub.contains("Horticulture"));
		sub.add("Soil science");
		for (String eachsub : sub) {
			System.out.println(eachsub.toString());
		}
		sub.clear();
		System.out.println(sub.isEmpty());
	}
}
