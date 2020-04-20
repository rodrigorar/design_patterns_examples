package com.rodrigorar.behavioral.strategy;

public class ServiceTwo implements Service<String> {
	private final Boolean parameter;

	public ServiceTwo(Boolean parameter) {
		this.parameter = parameter;
	}

	@Override
	public String execute() {
		final String result;
		if (parameter) {
			result = "Service Two will execute";
		} else {
			result = "Service will not execute";
		}
		return result;
	}
}
