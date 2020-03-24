package com.rodrigorar.creational.singleton;

public class Government {
	private static Government _instance;

	private final String name;

	private Government(String name) {
		this.name = name;
	}

	public static Government getInstance(String name) {
		if (_instance == null) {
			_instance = new Government(name);
		}
		return _instance;
	}

	public String getName() {
		return name;
	}
}
