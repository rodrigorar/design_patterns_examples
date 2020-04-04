package com.rodrigorar.structural;

import com.rodrigorar.structural.flyweight.FactoryImage;
import com.rodrigorar.structural.flyweight.Image;

public class FlyweightPattern {
	public static void main(String[] args) {
		FactoryImage factory = new FactoryImage();

		// Image 1
		Image image1 = factory.build("image-1");
		image1.draw(0, 0);
		image1.draw(10, 25);
		// Image 2
		Image image2 = factory.build("image-2");
		image2.draw(10, 10);
		// Image 1 Again
		Image image1Again = factory.build("image-1");
		image1Again.draw(100, 100);
	}
}
