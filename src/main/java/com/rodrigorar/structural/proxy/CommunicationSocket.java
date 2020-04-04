package com.rodrigorar.structural.proxy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

class CommunicationSocket implements Socket {
	private final File channel;
	private final InputStream inputStream;
	private final OutputStream outputStream;

	CommunicationSocket() throws IOException {
		this.channel = File.createTempFile(null, "test_file", null);
		this.inputStream = new FileInputStream(this.channel);
		this.outputStream = new FileOutputStream(this.channel);
	}

	@Override
	public String read() throws IOException {
		int content;
		StringBuilder resultBuilder = new StringBuilder();
		while ((content = this.inputStream.read()) != -1) {
			resultBuilder.append((char)content);
		}
		return resultBuilder.toString();
	}

	@Override
	public void write(String value) throws IOException {
		this.outputStream.write(value.getBytes());
	}

	@Override
	public void close() throws IOException {
		this.inputStream.close();
		this.outputStream.close();
		this.channel.delete();
	}
}
