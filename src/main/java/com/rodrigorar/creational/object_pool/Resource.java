package com.rodrigorar.creational.object_pool;

import java.util.UUID;

public class Resource {
	private final UUID id;
	private boolean isOccupied;

	public Resource(UUID id) {
		this.id = id;
		this.isOccupied = false;
	}

	public UUID getId() {
		return id;
	}

	public boolean isOccupied() {
		return isOccupied;
	}

	void aquired() {
		this.isOccupied = true;
	}

	void released() {
		this.isOccupied = false;
	}

	public void process(String value) {
		System.out.println("Currently processing value: " + value);
	}
}
