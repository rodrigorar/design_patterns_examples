package com.rodrigorar.structural.proxy;

import java.io.IOException;

public interface Socket {
	String read() throws IOException;
	void write(String value) throws IOException;
	void close() throws IOException;
}
