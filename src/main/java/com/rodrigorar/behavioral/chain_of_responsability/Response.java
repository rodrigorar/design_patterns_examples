package com.rodrigorar.behavioral.chain_of_responsability;

import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

public class Response {
	private final UUID id;
	private final List<String> arguments;

	Response() {
		this.id = UUID.randomUUID();
		this.arguments = new LinkedList<>();
	}

	UUID getId() {
		return id;
	}

	public void addArgument(String argument) {
		this.arguments.add(argument);
	}

	public void print() {
		StringBuilder builder = new StringBuilder();
		builder.append("Response-Id: ").append(id.toString()).append("\n");
		this.arguments.forEach(value -> {
			builder.append(value);
			builder.append("\t");
		});
		builder.append("\n\n");
		System.out.print(builder.toString());
	}

}
