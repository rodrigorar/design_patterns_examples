package com.rodrigorar.behavioral.command;

import java.io.InputStream;

public class CommandRead implements Command<InputStream, Void> {
	private final InputStream stream;

	public CommandRead(InputStream stream) {
		this.stream = stream;
	}

	@Override
	public Void execute() {
		System.out.println("Reading from InputStream, not really");
		return null;
	}
}
