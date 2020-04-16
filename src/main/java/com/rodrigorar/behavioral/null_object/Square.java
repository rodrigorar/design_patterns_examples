package com.rodrigorar.behavioral.null_object;

class Square implements Shape {
	private final Type type;

	Square() {
		this.type = Type.SQUARE;
	}

	public void print() {
		System.out.println("Square shape printing");
	}

	@Override
	public Type getType() {
		return this.type;
	}
}
