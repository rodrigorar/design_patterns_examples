package com.rodrigorar.behavioral;

import com.rodrigorar.behavioral.memento.Transaction;

public class MementoPattern {
	public static void main(String[] args) {
		Transaction transaction = new Transaction();
		transaction.addOperation("operation-1");
		transaction.addOperation("operation-2");
		transaction.addOperation("operation-3");
		System.out.println("Before Checkpoint 1");
		transaction.currentStackedOperations();
		Transaction.Memento checkpoint1 = transaction.checkpoint();

		transaction.addOperation("operation-4");
		transaction.addOperation("operation-5");
		System.out.print("\n\nBefore Checkpoint 2\n");
		transaction.currentStackedOperations();
		Transaction.Memento checkpoint2 = transaction.checkpoint();

		transaction.rollback(checkpoint1);
		System.out.print("\n\nAfter rollback to checkpoint 1\n");
		transaction.currentStackedOperations();

		transaction.rollback(checkpoint2);
		System.out.print("\n\nAfter rollback to checkpoint 2\n");
		transaction.currentStackedOperations();
	}
}
