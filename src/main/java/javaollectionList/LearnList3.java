package javaollectionList;
import java.util.ArrayList;
import java.util.List;
public class LearnList3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			List<String> Green = new ArrayList<String>();
			Green.add("shadh");
			Green.add("sohel");
			Green.add("Naz");
			for (String eachGreen :Green ) {
			System.out.println(eachGreen);}
			System.out.println(Green);
			Green.add("NAZ");
			System.out.println(Green);
			System.out.println(Green.size());
			System.out.println(Green.get(2));
			System.out.println(Green.get(1));
			Green.clear();
			Green.isEmpty();
			Green.add("Shadh");
			System.out.println( Green.isEmpty());
			
			
			
			
			
			
			
			
			
			
			

	
	
	
	
	}

}
