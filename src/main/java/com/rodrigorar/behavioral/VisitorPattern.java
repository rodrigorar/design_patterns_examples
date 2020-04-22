package com.rodrigorar.behavioral;

import com.rodrigorar.behavioral.visitor.*;

public class VisitorPattern {
	public static void main(String[] args) {
		Element element1 = new ElementOne();
		Element element2 = new ElementTwo();

		System.out.println("Visitor One");
		Visitor visitor1 = new VisitorOne();
		element1.accept(visitor1);
		element2.accept(visitor1);

		System.out.print("\nVisitor Two\n");
		Visitor visitor2 = new VisitorTwo();
		element1.accept(visitor2);
		element2.accept(visitor2);
	}
}
