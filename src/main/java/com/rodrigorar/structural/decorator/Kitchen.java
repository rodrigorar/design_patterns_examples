package com.rodrigorar.structural.decorator;

public class Kitchen extends HouseDecorator {

	public Kitchen(House decorator) {
		super(decorator);
	}

	@Override
	public void layout() {
		super.layout();
		System.out.println("Kitchen");
	}
}
