package com.rodrigorar.behavioral.null_object;

public interface Shape {
	enum Type {
		SQUARE,
		CIRCLE,
		NULL
	}

	void print();
	Type getType();
}
