package com.rodrigorar.structural;

import com.rodrigorar.structural.private_class_data.Circle;

public class PrivateClassDataPattern {
	public static void main(String[] args) {
		// Circle 1
		System.out.println("Creating circle 1");
		Circle circle1 = new Circle(0, 0, 2);
		circle1.draw();
		// Circle 2
		System.out.println("\nCreating circle 2");
		Circle circle2 = new Circle(5, 5, 1);
		circle2.draw();
		// Circle 3
		System.out.println("\nCreating circle 3");
		Circle circle3 = new Circle(0, 0, 4);
		circle3.draw();
	}
}
