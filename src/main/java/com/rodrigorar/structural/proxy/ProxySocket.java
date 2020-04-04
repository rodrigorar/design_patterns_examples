package com.rodrigorar.structural.proxy;

import java.io.IOException;

public class ProxySocket implements Socket {
	private ProxySocketData data;

	public ProxySocket() {
		this.data = new ProxySocketData();
	}

	@Override
	public String read() throws IOException {
		String result = data.getSocket().read();
		if (result == null) {
			result = new String();
		}
		return result;
	}

	@Override
	public void write(String value) throws IOException {
		if (! (value == null || value.equals(""))) {
			data.getSocket().write(value);
		}
	}

	@Override
	public void close() throws IOException {
		data.getSocket().close();
	}

	private class ProxySocketData {
		private Socket socket;

		public Socket getSocket() throws IOException {
			if (this.socket == null) {
				this.socket = new CommunicationSocket();
			}
			return this.socket;
		}
	}
}
