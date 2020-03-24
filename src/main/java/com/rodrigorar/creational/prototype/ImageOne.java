package com.rodrigorar.creational.prototype;

import java.util.UUID;

class ImageOne extends Image<ImageTwo> {

	ImageOne(UUID id, String name, String description) {
		super(id, name, description);
	}

	ImageOne(Image image) {
		super(image);
	}

	@Override
	public Image clone() {
		return new ImageOne(this);
	}
}
