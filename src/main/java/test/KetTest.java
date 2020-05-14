package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

public class KetTest {

	public static  void main(String a[]) {
		
		Map< Integer, String> map=new HashMap<Integer, String>();

		map.put(101, "Hemendra");
		map.put(99, "Andrew");
		map.put(103, "Anish");
		map.put(18, "Mohan");
		map.put(11, "Christine");
		map.put(109, "Rebeca");
		map.put(111, "David");
		map.put(19, "Rahim");
		map.put(10, "Krishna");


		List<Integer> list = new ArrayList<>();
		list.stream();
		
		Set set = new HashSet();
		set.stream();
//		DS and Algo Section
//		Core Java Section
//		Spring and Spring Boot Section
//
//		Around 20 minutes for each section:

		/*

		Question: Given a list: eat, hello, loleh, ate] Group Anagrams Together
		output: {eat, ate}, {hello, loleh}
		    
		    List<String> words=new ArrayList<String>();
		    
		    words.add("Rat");
		    words.add("Car");
		    words.add("Below");
		    words.add("Tast");
		    words.add("Cried");
		    words.add("Study");
		    words.add("Thing");
		    words.add("Chin");
		    words.add("Grab");
		    words.add("Act");
		    words.add("Robed");
		    words.add("Vase");
		    words.add("Glean");
		    words.add("Desserts");
		    words.add("Tar");
		    words.add("Arc");
		    words.add("Elbow");
		    words.add("State");
		    words.add("Cider");
		    words.add("Dusty");
		    words.add("Night");
		    words.add("Inch");
		    words.add("Brag");
		    words.add("Cat");
		    words.add("Bored");
		    words.add("Save");
		    words.add("Angel");
		    words.add("Streseed");
		    
		*/

		/*

		Question: Merge Two  sorted Arrays,
		Input: arr1[] = { 1, 3, 4, 5}, arr2[] = {2, 4, 6, 8}
		Output: arr3[] = {1, 2, 3, 4, 5, 6, 8}

		*/

//		DS and Algo and Problem Solving (Binary Search Trees, Matrix)
//
//		/////////////////////////////
//
//		Core Java Section(9/10)
//
//		What is an Object class in Java?
//
//		What is difference between Array and ArrayList?
//
//		Which classes in collection implements Serilizeable and Cloneable interfaces?
//
//		Return Type:
//
//		Predicate:
//		Consumer:
//		Function:
//		Supplier:

		/////////////////////////////

		/*

		Question:

		Given a Map with the key and value pairs:

		Map< Integer, String> map=new HashMap<Integer, String>();

		map.put(101, "Hemendra");
		map.put(99, "Andrew");
		map.put(103, "Anish");
		map.put(18, "Mohan");
		map.put(11, "Christine");
		map.put(109, "Rebeca");
		map.put(111, "David");
		map.put(19, "Rahim");
		map.put(10, "Krishna");

		Required to sort the map:

		1. On the basis of keys:

		///->[10=Krishna, 11=Christine, 18=Mohan, 19=Rahim, 99=Andrew, 101=Hemendra, 103=Anish, 109=Rebeca, 111=David]

		2. On the basis of values:

		///->[99=Andrew, 103=Anish, 11=Christine, 111=David, 101=Hemendra, 10=Krishna, 18=Mohan, 19=Rahim, 109=Rebeca]

		System.out.println(map.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toList()));

		*/
		
		
	}
	
}
