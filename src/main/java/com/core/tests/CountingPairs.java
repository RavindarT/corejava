package com.core.tests;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class CountingPairs {
	public static void main(String a[]) {
		List i = new ArrayList();
		i.add(1);
		i.add(2);
		i.add(3);
		
		System.out.println(countPairs3(i, 1));
	}
	
	  private static class Pair {
		  public int x;
		  public int y;
		  public Pair(int x, int y) {
			  this.x = x;
			  this.y = y;
		  } 
		  public String toString() {
			  return "(" + x + "," + y + ")"; 
		  } 
	  }
	  
	  public static int countPairs(List<Integer> numbers, int k) {
		  HashSet<Integer> hLow = new HashSet<>(); 
		  HashSet<Integer> hHigh = new HashSet<>();
		  List<Pair> ret = new ArrayList<>();
		  for (int i : numbers) { 
			  hLow.add(i); 
			  hHigh.add(i + k); 
		  } 
		  for (int i : hHigh) {
			  if (hLow.contains(i)) {
				  ret.add(new Pair(i - k, i));
			  } 
		  } 
		  return ret.size();
	  } 
	  /**
	   * 
	   */
	  
	  private static class Pairs{     
		  public int a, b;     
		  public Pairs(int a, int b)         {
			  this.a = a;            
			  this.b = b;       
		  }  
		  
		  public String toString()         {   
			  return "(" + a + "," + b + ")";    
		  } 
	  }
	  
	  public static int countPairs1(List<Integer> numbers, int k) {  
		  HashSet<Integer> actual = new HashSet<>(); 
		  HashSet<Integer> afterAdd = new HashSet<>();  
		  List<Pairs> pairs = new ArrayList<>();   
		  for(int i:numbers)        {      
			  actual.add(i);        
			  afterAdd.add(i+k);   
		  }       
		  for(int i: afterAdd)        { 
			  if(actual.contains(i))            { 
				  pairs.add(new Pairs(i-k,i));  
			  }
		  }
		  return pairs.size();  
	  } 
	  
	  /**
	   * 
	   */
	  
	  public static int countPairs2(List<Integer> numbers, int k) { 
		  // Write your code here       
		  HashSet<Integer> initial = new HashSet<>();   
		  HashSet<Integer> after = new HashSet<>(); 
		  int count = 0;      
		  for (int i : numbers) {   
			  initial.add(i);      
			  after.add(i + k); 
		  }   
		  for (int i : after) {
			  if (initial.contains(i))    {
				  count++;   
			  }				  
		  }
			   
		  return count;    
	  }
	  
	  public static int countPairs3(List<Integer> numbers, int k) { 
		  List<Integer> a = new ArrayList();
		  List<Integer> b = new ArrayList();
		  int count = 0;
		  for(int i : numbers) {
			  a.add(i);
			  b.add(i + k);
		  }
		  
		  
		  System.out.println(a);
		  System.out.println(b);
		  
		  for(int i : b) {
			  if(a.contains(i)) {
				  System.out.println(i);
				  count ++;
			  }
		  }
		  
		  return count;
		  
	  }
	  

}
