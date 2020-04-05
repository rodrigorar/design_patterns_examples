package com.rodrigorar.behavioral.chain_of_responsability;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class Request {
	private final UUID id;
	private final List<String> arguments;

	public Request(List<String> arguments) {
		this.id = UUID.randomUUID();
		this.arguments = arguments;
	}

	UUID getId() {
		return id;
	}

	public Optional<String> getArgument() {
		final String result;
		if (arguments.isEmpty()) {
			result = null;
		} else {
			result = arguments.get(0);
			arguments.remove(result);
		}
		return Optional.ofNullable(result);
	}

	public void print() {
		StringBuilder builder = new StringBuilder();
		builder.append("Request-Id: ").append(id.toString()).append("\n");
		this.arguments.forEach(value -> {
			builder.append(value);
			builder.append("\t");
		});
		builder.append("\n");
		System.out.print(builder.toString());
	}

}
