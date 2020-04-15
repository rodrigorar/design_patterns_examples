package com.rodrigorar.behavioral.memento;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Transaction {
	private List<String> operations;

	public Transaction() {
		this.operations = new LinkedList<>();
	}

	public void addOperation(String operation) {
		this.operations.add(operation);
	}

	public Memento checkpoint() {
		return new Memento(new ArrayList<>(this.operations));
	}

	public void rollback(Memento memento) {
		this.operations = new LinkedList<>(memento.getState());
	}

	public void currentStackedOperations() {
		this.operations.forEach(System.out::println);
	}

	public static class Memento {
		private final List<String> operations;

		protected Memento(List<String> operations) {
			this.operations = operations;
		}

		protected List<String> getState() {
			return this.operations;
		}
	}
}
