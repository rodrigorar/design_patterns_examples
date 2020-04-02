package com.rodrigorar.structural.decorator;

public class LeavingRoom extends HouseDecorator {

	public LeavingRoom(House decorator) {
		super(decorator);
	}

	@Override
	public void layout() {
		super.layout();
		System.out.println("Leaving Room");
	}
}
