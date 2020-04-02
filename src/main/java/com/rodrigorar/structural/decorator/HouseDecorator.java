package com.rodrigorar.structural.decorator;

public class HouseDecorator implements House {
	private House wrappee;

	public HouseDecorator(House decorator) {
		this.wrappee = decorator;
	}

	@Override
	public void layout() {
		this.wrappee.layout();
	}
}
