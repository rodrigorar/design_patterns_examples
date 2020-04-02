package com.rodrigorar.structural.bridge;

public class PreemptiveConfigurations {
	private final String name;
	private final int priority;

	public PreemptiveConfigurations(String name, int priority) {
		this.name = name;
		this.priority = priority;
	}

	public String getName() {
		return this.name;
	}

	public int getPriority() {
		return this.priority;
	}
}