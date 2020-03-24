package com.rodrigorar.creational.prototype;

import java.util.UUID;

class ImageTwo extends Image {

	ImageTwo(UUID id, String name, String description) {
		super(id, name, description);
	}

	ImageTwo(Image image) {
		super(image);
	}

	@Override
	public Image clone() {
		return new ImageTwo(this);
	}
}
