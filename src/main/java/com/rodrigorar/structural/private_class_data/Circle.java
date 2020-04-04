package com.rodrigorar.structural.private_class_data;

public class Circle {
	private final CircleData data;

	public Circle(int x, int y, int radius) {
		this.data = new CircleData(x, y, radius);
	}

	public void draw() {
		System.out.println("Drawing circle with center at ("
				+ data.getX() + ","
				+ data.getY() + ") and radius "
				+ data.getRadius());
	}
}
