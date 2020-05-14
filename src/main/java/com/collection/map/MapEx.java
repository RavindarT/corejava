package com.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapEx {

	public static void main(String[] args) {
		
		Map hashMap = new HashMap();
		hashMap.put(null, "1");
		
		System.out.println( hashMap.entrySet().iterator());
		
	}
	
}
