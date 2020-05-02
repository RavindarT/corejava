package com.core.tests;

public class DrawingShapes {
	public static void main(String a[]) {
		
	}
}

abstract class Shape {
	abstract  void drawShape();
}
class Circle extends Shape{
	public void drawShape() { 
		System.out.println("Drawing a Circle");
	} 
}
class Square extends Shape {
	public void drawShape() { 
		System.out.println("Drawing a Square"); 
	} 
} 
class Rectangle extends Shape { 
	public void drawShape() { 
		System.out.println("Drawing a Rectangle"); 
	}
}
class ShapeFactory {
	public void drawShape(String type){
		switch(type){ 
			case "Square":
				Square square = new Square();
				square.drawShape(); 
				break; 
			case "Circle": 
				Circle circle = new Circle(); 
				circle.drawShape(); 
				break; 
			case "Rectangle":
				Rectangle rectangle = new Rectangle(); 
				rectangle.drawShape();
				break; 
			default: 
				System.out.println("Drawing "+type+" is not supported");
		}
	}
}

interface ShapeObject {
	public void draw();
}

class Circles implements ShapeObject {

	@Override
	public void draw() {
		System.out.println("Circle");
		
	}
	
}

class Ovul implements ShapeObject {

	@Override
	public void draw() {
		System.out.println("Ovul");
		
	}
	
}
class NotSupported implements ShapeObject {

	@Override
	public void draw() {
		System.out.println("NotSupported");
		
	}
	
}

class ShapeFactory1 {
	
	public void createShape(String str) {
		ShapeObject shapeObj = null;
		switch(str) {
		
		case "circle" :
			 shapeObj = new Circles();
		
		default :
		
			 shapeObj = new NotSupported();
		}
		
		shapeObj.draw();
	}
	
}

