package com.core.test;

public class Shapes {
	public static void main(String a[]) {
		Shape shape = new Buildfactory().buildFactory("Circle");
		shape.drawShape("Circle");
		shape = new Buildfactory().buildFactory("Circasdale");
		shape.drawShape("Circlasde");
	}
}

interface Shape {
	public void drawShape(String str);
}

class Circle implements Shape {
	public void drawShape(String str) {
		System.out.println("Draw "+str);
	}
}

class Triangle implements Shape {
	public void drawShape(String str) {
		System.out.println("Draw "+str);
	}
}
class NotSupported implements Shape {
	public void drawShape(String str) {
		System.out.println("Not Supported "+str);
	}
}
class Buildfactory {
	
	Shape buildFactory (String shape) {
		
		switch(shape) {
			case "circle":
			case "Circle":
				Shape circle = new Circle();
				System.out.println("Gotjere");
				return circle;
			case "Triangle" :
				Shape triangle = new Triangle();
				return triangle;
			default :
				Shape notSupported = new NotSupported();
				return notSupported;
		}
		
		
	}
	
}