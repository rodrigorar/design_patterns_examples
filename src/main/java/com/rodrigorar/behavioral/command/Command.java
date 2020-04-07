package com.rodrigorar.behavioral.command;

public interface Command<I, O> {
	O execute();
}
