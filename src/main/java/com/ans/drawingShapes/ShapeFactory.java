package com.ans.drawingShapes;

public class ShapeFactory {
	
	public Shape createObject(String type){
		Shape s = null;
		switch(type){ 
			case "Square":
				s = new Square();
				//s.drawShape(); 
				break; 
			case "Circle": 
				s  = new Circle(); 
				//s.drawShape(); 
				break; 
			case "Rectangle":
				 s = new Rectangle(); 
				//s.drawShape();
				break; 
			default: 
				System.out.println("Drawing "+type+" is not supported");
				s = new Undefined();
		}
		return s;
	}
}
