package com.thread;

public class ThreadTest {

	public static void main(String[] args) {
		 String str = new String("Test");
		Tem tem = new Tem("asd");
		 
		 Thread t = new Thread(){
	          public void run() {
	             
	              try{
	                  System.out.println("Does it work?");
	                  Thread.sleep(3000);
	                  System.out.println("Nope, it doesnt...again."+tem.str);
	              } catch(InterruptedException v){System.out.println(v);}
	          }
	      };
	      
	      t.start();
	}
	
}

class Tem {
	
	String str;

	public Tem(String str) {
		super();
		this.str = str;
	}
	
	
}
