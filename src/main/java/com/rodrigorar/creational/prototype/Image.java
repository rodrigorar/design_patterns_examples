package com.rodrigorar.creational.prototype;

import java.util.UUID;

public abstract class Image<T extends Image> {
	private final UUID id;
	private final String name;
	private final String description;

	Image(UUID id, String name, String description) {
		this.id = id;
		this.name = name;
		this.description = description;
	}

	Image(Image image) {
		this.id = image.getId();
		this.name = image.getName();
		this.description = image.getName();
	}

	public final UUID getId() {
		return id;
	}

	public final String getName() {
		return name;
	}

	public final String getDescription() {
		return description;
	}
	public abstract Image clone();
}
