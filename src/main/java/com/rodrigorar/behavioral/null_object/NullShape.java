package com.rodrigorar.behavioral.null_object;

class NullShape implements Shape {
	private final Type type;

	public NullShape() {
		this.type = Type.NULL;
	}

	@Override
	public void print() {
		System.out.println("Nothing to print this is a null shape");
	}

	@Override
	public Type getType() {
		return this.type;
	}
}
