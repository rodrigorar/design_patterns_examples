package com.rodrigorar.behavioral.chain_of_responsability;

import java.util.LinkedHashSet;
import java.util.Set;

public class Chain {
	private final Set<Handler> handlers;

	public Chain() {
		this.handlers = new LinkedHashSet<>();
	}

	public void register(Handler handler) {
		this.handlers.add(handler);
	}

	public Response send(Request request) {
		Response response = new Response();
		this.handlers.forEach(handler -> handler.handle(request, response));
		return response;
	}
}
