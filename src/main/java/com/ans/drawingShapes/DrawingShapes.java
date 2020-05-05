package com.ans.drawingShapes;

public class DrawingShapes {
	public static void main(String a[]) {
		ShapeFactory s = new ShapeFactory();
		Shape shapes = s.createObject("Cirscle");
		shapes.drawShape();
	}
}
