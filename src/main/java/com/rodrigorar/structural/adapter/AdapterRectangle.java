package com.rodrigorar.structural.adapter;

public class AdapterRectangle implements Shape {
	private LegacyRectangle rectangle;

	public AdapterRectangle() {
		this.rectangle = new LegacyRectangle();
	}

	@Override
	public void display(int x1, int y1, int x2, int y2) {
		System.out.println("Adapter Rectangle");
		System.out.println("X1: " + x1);
		System.out.println("Y1: " + y1);
		System.out.println("X2: " + x2);
		System.out.println("Y2: " + y2);

		final int width = x2-x1;
		final int height = y1-y2;

		this.rectangle.display(x1, y1, width, height);
	}
}
