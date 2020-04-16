package com.rodrigorar.behavioral.null_object;

public class ShapeFactory {

	public static Shape build(Shape.Type type) {
		final Shape result;
		switch(type) {
			case SQUARE:
				result = new Square();
				break;
			case CIRCLE:
				result = new Circle();
				break;
			case NULL:
				result = new NullShape();
				break;
			default:
				throw new IllegalArgumentException("Unknown shape type");
		}
		return result;
	}
}
