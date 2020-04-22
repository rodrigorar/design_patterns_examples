package com.rodrigorar.behavioral.visitor;

public class VisitorTwo implements Visitor {

	@Override
	public void visit(ElementOne element) {
		System.out.println("Visitor two executing element " + element.getName());
	}

	@Override
	public void visit(ElementTwo element) {
		System.out.println("Visitor two executing element " + element.getName());
	}
}
