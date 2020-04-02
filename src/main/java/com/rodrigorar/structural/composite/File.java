package com.rodrigorar.structural.composite;

// Leaf
public class File implements AbstractFile {
	private final String name;

	public File(String name) {
		this.name = name;
	}

	@Override
	public void ls() {
		System.out.println(" - " + name);
	}
}
