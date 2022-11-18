package javaollectionList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.io.FileSystemUtils;

public class LearnList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// To creat object of Kist
		List<String>insectname = new ArrayList<String>();
		//string means combination of character.string=Data Type, insectname=id
	insectname.add("Bettle");
	insectname.add("Lady bird Bettle");
	insectname.add("Bee");
	insectname.add("Butterfly");
	insectname.add("Bug");
	System.out.println(insectname);
	for(String eachinsectname:insectname){
	System.out.println(eachinsectname);
	}}	}


