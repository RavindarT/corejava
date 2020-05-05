package com.drawingShapes;

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
