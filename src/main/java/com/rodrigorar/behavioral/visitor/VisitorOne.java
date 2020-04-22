package com.rodrigorar.behavioral.visitor;

public class VisitorOne implements Visitor {

	@Override
	public void visit(ElementOne element) {
		System.out.println("Visitor One Executing element " + element.getName());
	}

	@Override
	public void visit(ElementTwo element) {
		System.out.println("Visitor One Executing element " + element.getName());
	}
}
