package com.core.test;

public class Robot {

	int currentX = 0;
	int currentY = 5;
	int previousX = 0;
	int previousY = 0;
	int x =0;
	int y = 0;
	int last = 0;
	
	boolean tmp = false;
	
	Robot(int x, int y){
		previousX = currentX;
		previousY = currentY;
		currentX = x;
		currentY  = y;
		tmp = true;
	}
	
	public void moveX(int x) {
		previousX = currentX;
		currentX = currentX + x;
		last = 1;
	}
	
	public void moveY(int x) {
		last = 2;
		previousY = currentY;
		currentY = currentY + x;
	}
	
	public void printCurrentCoordinates() {
		System.out.println(currentX+" "+currentY);
		x = currentX;
		y = currentY;
	}
	
	public void printLastCoordinates() {
		if(tmp) {
			System.out.println(x+" "+y);
		}
	}
	
	public void printLastMove() {
		if( last == 1 ) {
			System.out.println("x "+ (currentX - previousX));
		}
		if( last == 2 ) {
			System.out.println("y "+ (currentX - previousX));
		}
	}
	
}
