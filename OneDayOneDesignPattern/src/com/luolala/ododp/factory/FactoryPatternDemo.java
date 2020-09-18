package com.luolala.ododp.factory;

public class FactoryPatternDemo {
	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		Shape shape1 = shapeFactory.getShape("CIRCLE");
		shape1.draw();
		Shape shape2 = shapeFactory.getShape("RECTANGLE");
		shape2.draw();
	}
}
