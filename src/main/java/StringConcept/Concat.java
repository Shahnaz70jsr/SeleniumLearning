package StringConcept;

public class Concat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "String Concept";
		String text1 = "String Concept1";
		//Concat()- if you want to Concat (join more than one Strings) two String
				System.out.println(text.concat(text1)); 
				//If you want to concat different datatype variable, we use + 
				String text2 = "20";
				String text3 ="30";
				int a = 10;
				int b = 20;
				System.out.println(text2 + a);
				System.out.println(a+b);
				System.out.println("****************");
				String text4 = "haney bee";
				String text5 = "is";
				String text6 = "an";
				String text7 = "usefull";
				String text8 = "insect";
				String text9 = "It has";
				int text10 =6;
				String text11="legs";
				String text12 = "dont destroy that insect";
				System.out.println(text4+"  " .concat(text5+"  ".concat(text6+"  ".concat(text7+"  ".concat(text8+" . ".concat(text9+"  ".concat(text10+"  ".concat(text11+" . ".concat(text12+"  ")))))))));
				
				
	
	
	
	
	
	
	}

}
