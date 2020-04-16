package com.rodrigorar.behavioral.null_object;

class Circle implements Shape {
	private final Type type;

	Circle() {
		this.type = Type.CIRCLE;
	}

	@Override
	public void print() {
		System.out.println("Circle shape printing");
	}

	@Override
	public Type getType() {
		return this.type;
	}
}
