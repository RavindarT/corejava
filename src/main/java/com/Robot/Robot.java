package com.Robot;

public class Robot {

	
	int currentX = 0;  
	int currentY = 5;  
	int previousX;   
	int previousY; 
	int last = 0; 
	int temp = 0; 
	int h = 0;  
	int j = 0;
	
	Robot(){    } 
	Robot(int x, int y){ 
		previousX = currentX;  
		previousY = currentY; 
		currentX = x;  
		currentY = y;   
		temp = 1;   
	}  
	
	public void moveX(int dx){   
		previousX = currentX;   
		currentX = currentX + dx;   
		last = 1;   
	}    
	
	public void moveY(int dy){   
		previousY = currentY;    
		currentY = currentY + dy;    
		last = 2;
	}   
	
	public void printCurrentCoordinates(){    
		System.out.println(currentX + " " + currentY); 
		h = currentX;  
		j = currentY;  
	}  
	
	public void printLastCoordinates(){   
		if(temp == 1){    
			System.out.println(h + " " + j);
		}    
	} 
	
	public void printLastMove(){   
		if(last == 1){      
			System.out.println("x" + " " + (currentX - previousX));
		}  else if(last == 2){ 
			System.out.println("y" + " " + (currentY - previousY));    
		}  
	}
	
}
