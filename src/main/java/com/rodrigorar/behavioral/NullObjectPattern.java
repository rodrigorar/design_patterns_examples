package com.rodrigorar.behavioral;

import com.rodrigorar.behavioral.null_object.Shape;
import com.rodrigorar.behavioral.null_object.ShapeFactory;

public class NullObjectPattern {
	public static void main(String[] args) {
		Shape squareShape = ShapeFactory.build(Shape.Type.SQUARE);
		squareShape.print();
		Shape circleShape = ShapeFactory.build(Shape.Type.CIRCLE);
		circleShape.print();
		Shape nullShape = ShapeFactory.build(Shape.Type.NULL);
		nullShape.print();
	}
}
