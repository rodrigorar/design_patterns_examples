package com.rodrigorar.behavioral.iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Television {
	private final List<String> channels;
	private String currentChannel;

	public Television() {
		this.channels = new ArrayList<>();
		this.channels.add("channel-1");
		this.channels.add("channel-2");
		this.channels.add("channel-3");
		this.channels.add("channel-4");
		this.channels.add("channel-5");
	}

	public Collection<String> channels() {
		return this.channels;
	}

	public void setChannel(String currentChannel) {
		System.out.println("Current channel: " + currentChannel);
		this.currentChannel = currentChannel;
	}

	public String getCurrentChannel() {
		return this.currentChannel;
	}

}
