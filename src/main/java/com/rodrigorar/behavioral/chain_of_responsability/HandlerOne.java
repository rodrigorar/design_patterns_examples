package com.rodrigorar.behavioral.chain_of_responsability;

import java.util.Optional;

public class HandlerOne implements Handler {

	@Override
	public void handle(Request request, Response response) {
		Optional<String> argument = request.getArgument();
		argument.ifPresent(response::addArgument);
	}

}
