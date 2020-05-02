package com.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class FindBiggest {

	   public static String featuredProduct(List<String> products) {
		    // Write your code here

		    products = new ArrayList();
		    products.add("redShirt");
		    products.add("greenPants");
		    products.add("redShirt");
		    products.add("orangeShoes");
		    products.add("blackPants");
		    products.add("blackPants");

		    Collections.sort(products);
		    String temp = "";
		    Map map = new HashMap();
		    int cnt = 0;
		    for(int i = 0; i < products.size(); i++){
		        if(!temp.equals(products.get(i))){
		            cnt = 1;
		            map.put(products.get(i), cnt);
		            temp = products.get(i);
		        } else{
		        	
		            map.put(products.get(i), ++ cnt );
		        }
		    }
		    System.out.println(map.entrySet());
		   Iterator iter = map.entrySet().iterator();
		   String str = "";
		   int maxvalue = 0;
		  while(iter.hasNext()) {
			  Map.Entry   entry =  (Entry) iter.next();
			  System.out.println(entry);
			  System.out.println(entry.getValue());
			  if(maxvalue < Integer.parseInt(  entry.getValue().toString() ) ) {
				  str = (String) entry.getKey();
				  maxvalue = Integer.parseInt(  entry.getValue().toString() ) ;
			  }
			 
			  
		  }

		    return str;


		    }
	   
	   public static void main(String a[]) {
		   
		 System.out.println(  featuredProduct(new ArrayList()));
		   
	   }

}
