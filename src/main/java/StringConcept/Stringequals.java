package StringConcept;

public class Stringequals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "String Concept";
		String text1 = "String Concept1";
		System.out.println(text);
		System.out.println(text1);
		//Find the memory location/address of this text/text1 variable	
		System.identityHashCode(text);
		System.identityHashCode(text1);
		System.out.println(System.identityHashCode(text));
		System.out.println(System.identityHashCode(text1));
		//String Class Method//equals function compare the value of two different variable(text & text1)		
		text.equals(text);
		text1.equals(text1);
		System.out.println(text.equals(text));
		System.out.println(text1.equals(text1));
		System.out.println("@@@@@@@@@@@@@");
	
	}

}
