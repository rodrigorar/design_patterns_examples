package com.rodrigorar.behavioral.visitor;

public class ElementTwo implements Element {
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	public String getName() {
		return "TWO";
	}
}
