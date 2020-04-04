package com.rodrigorar.structural.flyweight;

public class Image {
	// Instrinsic state
	private final String name;

	Image(String name) {
		this.name = name;
	}

	// extrinsic state
	public void draw(int x, int y) {
		System.out.println("Drawing image with center at X: " + x + " Y: " + y);
	}
}
