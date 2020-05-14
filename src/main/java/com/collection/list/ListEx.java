package com.collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ListEx {
	public static void main(String[] args) {
		List list = new ArrayList();//Cloneable Serializable
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(1);
		
		System.out.println(list.size());
		List vector = new Vector();//Cloneable Serializable capacity
		vector.add(1);
		vector.add(1);
		vector.add(1);
		vector.add(1);
		vector.add(1);
		vector.add(1);
		vector.add(1);
		vector.add(1);
		vector.add(1);
		vector.add(1);
		vector.add(1);
		System.out.println(((Vector)vector).capacity());
		
	}
}
