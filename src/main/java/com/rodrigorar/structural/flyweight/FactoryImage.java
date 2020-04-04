package com.rodrigorar.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FactoryImage {
	private final Map<String, Image> imageCache;

	public FactoryImage() {
		this.imageCache = new HashMap<>();
	}

	public Image build(String imageName) {
		final Image result;
		if (this.imageCache.containsKey(imageName)) {
			System.out.println("Getting existing image " + imageName);
			result = this.imageCache.get(imageName);
		} else {
			System.out.println("Create a new image with name: " + imageName);
			result = new Image(imageName);
			this.imageCache.put(imageName, result);
		}
		return result;
	}
}
