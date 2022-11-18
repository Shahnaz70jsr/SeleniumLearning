package StringConcept;
public class StringConcept1 {
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
		//compares memory address/location of String variable
		System.out.println(text==text1);
		// Length()- return count of String
		System.out.println(text.length());
		System.out.println(text1.length());
		//Concat()- if you want to Concat (join more than one Strings) two String
		System.out.println(text.concat(text1)); 
		//If you want to concat different datatype variable, we use + 
		String num = "20";
		String num1 ="30";
		int a = 10;
		int b = 20;
		System.out.println(num + a);
		System.out.println(a+b);
		System.out.println("****************");
		//trim()- want to remove white space from both side of a String use- trim()
		String text2 = "    Life is very complex    ";
		System.out.println(text2);
		System.out.println(text2.length());
		System.out.println(text2.trim());
		//After use Trim
		System.out.println(text2.trim().length());
		//toLowerCase()- convert all of the String as LowerCase()
		String text3 = "String Concept";
		System.out.println(text3.toLowerCase());
		//toUpperCase()- convert all of the String as UpperCase()
		String text4 = "String Concept";
		System.out.println(text4.toUpperCase());
		//contains() -given String is available in entire String or not - return true/false
		String text5 = "String Concept";
		System.out.println(text5.contains("mpa"));//mpa is not present at string Concept.(false)
		System.out.println(text5.contains("tex"));//text is not present at String Copncept.(false)
		System.out.println(text5.contains("tring"));//tring is present at String Concept.(true)
	
	}
}

