package com.rodrigorar.behavioral.strategy;

public class FactoryService {

	public static Service serviceOne(String parameter) {
		return new ServiceOne(parameter);
	}

	public static Service serviceTwo(Boolean parameter) {
		return new ServiceTwo(parameter);
	}
}
