package com.rodrigorar.behavioral;

import com.rodrigorar.behavioral.command.Command;
import com.rodrigorar.behavioral.command.CommandPrint;
import com.rodrigorar.behavioral.command.CommandRead;

public class CommandPattern {
	public static void main(String[] args) {
		Command printCommand = new CommandPrint(System.out);
		printCommand.execute();

		Command readCommand = new CommandRead(System.in);
		readCommand.execute();
	}
}
