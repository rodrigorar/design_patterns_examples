package com.rodrigorar.behavioral.command;

import java.io.PrintStream;

public class CommandPrint implements Command<PrintStream, Void> {
	private final PrintStream stream;

	public CommandPrint(PrintStream stream) {
		this.stream = stream;
	}

	@Override
	public Void execute() {
		this.stream.println("print a line in Command Print");
		return null;
	}
}
