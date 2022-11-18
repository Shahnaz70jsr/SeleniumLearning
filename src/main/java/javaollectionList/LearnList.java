package javaollectionList;
import java.util.ArrayList;
import java.util.List;
public class LearnList {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Interfac<datatype>id or name = new ArrayList<Data type>();
	    //To creat Object
		List<Integer> id = new ArrayList<Integer>();
		// here List=Interface, Integer = Data type, List= Interface.ArrayList= Implementation class of Interface.
		id.add(10);
		id.add(20);
		id.add(30);
		id.add(40);
		id.add(50);
		System.out.println(id);
		//within the boundary that means from 10 to 50
		System.out.println(id.contains(20));
		// Out of boundary
		System.out.println(id.contains(60));
		//length of Array/Size of Array
		System.out.println(id.size());
		//id.remove(in index number 0, or1, or2, or3, or4); here 0=10, 1=20, 2=30,3=40,4=50
		id.remove(0);
		System.out.println(id);
		//for(DataType eachCollections : Collection){statement (eachCollections);
		 for (Integer eachId : id) {
		System.out.println(eachId);
		
		}
	}
}

