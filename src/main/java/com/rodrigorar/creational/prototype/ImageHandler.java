package com.rodrigorar.creational.prototype;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class ImageHandler {
	public enum ClassType {
		IMAGE_ONE,
		IMAGE_TWO
	}

	private Map<ClassType, Image> registry;

	private ImageHandler() {
		this.registry = new HashMap<>();
	}

	private void doPopulate() {
		registry.put(
				ClassType.IMAGE_ONE,
				new ImageOne(
						UUID.randomUUID(),
						"image-1",
						"image-1-description"));
		registry.put(
				ClassType.IMAGE_TWO,
				new ImageTwo(
						UUID.randomUUID(),
						"image-2",
						"image-2-description"));
	}

	public static ImageHandler populate() {
		final ImageHandler handler = new ImageHandler();
		handler.doPopulate();
		return handler;
	}

	public Image get(ClassType classType) {
		return registry.get(classType);
	}
}
