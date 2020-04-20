package com.rodrigorar.behavioral.strategy;

public class ServiceOne implements Service<Boolean> {
	private final String parameter;

	public ServiceOne(String parameter) {
		this.parameter = parameter;
	}

	@Override
	public Boolean execute() {
		System.out.println("Service One Executing: " + parameter);
		return true;
	}
}
