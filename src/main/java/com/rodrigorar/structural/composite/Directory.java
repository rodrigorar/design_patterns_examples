package com.rodrigorar.structural.composite;

import java.util.LinkedList;
import java.util.List;

// Composite
public class Directory implements AbstractFile {
	private final String name;
	private final List<AbstractFile> childFiles;

	public Directory(String name) {
		this.name = name;
		this.childFiles = new LinkedList<>();
	}

	public void add(AbstractFile file) {
		childFiles.add(file);
	}

	@Override
	public void ls() {
		System.out.println("--------------------------------------------------");
		System.out.println(name);
		childFiles.forEach(AbstractFile::ls);
	}
}
