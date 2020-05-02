package com.core.tests;

import java.util.Scanner;

public class RobotClass {
private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		int x = scan.nextInt();
		int y = scan.nextInt();
		int dx = scan.nextInt();
		int dy = scan.nextInt();
		
		Robot firstRobot = new Robot();
	    firstRobot.printCurrentCoordinates();
	    
	    Robot secondRobot = new Robot(x, y);
	    secondRobot.printCurrentCoordinates();
	    System.out.println(":::2:::"+secondRobot.x+":Ends::");
	    
	    for (int i = 1; i < 3; i++) {
	        secondRobot.moveX(dx);
	        secondRobot.printLastMove();
	        secondRobot.printCurrentCoordinates();
	        secondRobot.moveY(dy);
	        secondRobot.printLastMove();

	        dx += i * i;
	        dy -= i * i;
	    }		
	}
}	

class Robot{ 
	int currentX = 0;  
	int currentY = 5;  
	int previousX;   
	int previousY; 
	int last = 0; 
//	boolean temp = false; 
	int x = 0;  
	int y = 0;
	
	public Robot(){    } 
	public Robot(int x, int y){ 
		previousX = currentX;  
		previousY = currentY; 
		currentX = x;  
		currentY = y;   
//		temp =  true;   
	}  
	
	public void printCurrentCoordinates(){    
		System.out.println(currentX + " " + currentY); 
		x = currentX;  
		y = currentY;  
		System.out.println("x:::"+x);
	}  
	
	public void moveX(int x){   
		previousX = currentX;   
		currentX = currentX + x;   
		last = 1;   
	} 
	
	public void printLastMove(){   
		if(last == 1){      
			System.out.println("x" + " " + (currentX - previousX));
		}  else if(last == 2){ 
			System.out.println("y" + " " + (currentY - previousY));    
		}  
	}
	
	public void moveY(int y){   
		previousY = currentY;    
		currentY = currentY + y;    
		last = 2;
	}   
	
//	public void printLastCoordinates(){   
//		if(temp ){    
//			System.out.println(x + " " + y);
//		}    
//	} 
	
	 
	
	
	
	
	
	
	
	
}