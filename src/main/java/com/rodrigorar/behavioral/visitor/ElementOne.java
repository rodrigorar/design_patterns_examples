package com.rodrigorar.behavioral.visitor;

public class ElementOne implements Element {
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	public String getName() {
		return "ONE";
	}
}
