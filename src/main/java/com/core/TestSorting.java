package com.core;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TestSorting {

	public static void main(String a[]) {
		
		SortedSet<Candidate> b = new TreeSet<Candidate>(Comparator.comparing(Candidate::getId));
		b.add(new Candidate(2, "2", null));
		b.add(new Candidate(1, "1", null));
		
		
		System.out.println(b);
		
		b.forEach( temp -> {
			System.out.println(temp.id+":@:"+temp.name);
		});
		
		SortedSet<Candidate> c = new TreeSet<Candidate>(Comparator.comparing(Candidate::getExpiryDate1 , (s1, s2) -> {
            return (null != s2) ? s2.compareTo(s1) : ( (s1 == null ) ? 0 : -1 );
        } ));
		c.addAll(b);
		
		c.forEach( temp -> {
			System.out.println(temp.id+":$$:"+temp.name);
		});
		
		
//		  Integer x = 5;
//	      
//	      System.out.println(x.compareTo(3));
//	      System.out.println(x.compareTo(5));
//	      System.out.println(x.compareTo(8));      
		
	}
	
}
