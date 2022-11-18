package loopsConcept;

import java.util.Iterator;

public class ForEachLoop1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//For (DataType eachCollections : Collection){
		//Statement (eachCollections);
		//To create object
		String[] color = new String[5];
		// Create object
		color[0] = "Red";
		color[1] = "White";
		color[2] = "Blue";
		color[3] = "Black";
		color[4] = "Green";
	//Syntext; for (DataType eachcollections:Collection)
	//for(String eachcolor : color);
	//print all values.
	//System.out.println(color);
	//for(int i = 0;i<color.length;i++)
	//System.out.println(color[i]);
		//For (DataType eachCollections : Collection){
		//Statement (eachCollections);}
		//Syntax: (datatype String)
		//For (String eachName : names){System.out.println(eachName);
	
		for (String eachcolor:color) {
	    System.out.println(eachcolor);
		
	}

	}
}


