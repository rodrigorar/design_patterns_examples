package com.rodrigorar.structural;

import com.rodrigorar.structural.adapter.AdapterRectangle;
import com.rodrigorar.structural.adapter.Shape;

public class AdapterPattern {
	public static void main(String[] args) {
		Shape rectangle = new AdapterRectangle();
		rectangle.display(1, 3, 3, 1);
		rectangle.display(4, 4, 6, 2);
		rectangle.display(3, 5, 5, 3);
	}
}
