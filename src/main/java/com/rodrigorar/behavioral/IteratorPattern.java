package com.rodrigorar.behavioral;

import com.rodrigorar.behavioral.iterator.Television;

import java.util.Collection;
import java.util.Iterator;

public class IteratorPattern {
	public static void main(String[] args) {
		Television television = new Television();

		// Change channel 1
		Collection<String> channels1 = television.channels();
		Iterator<String> channels1Iterator = channels1.iterator();
		while (channels1Iterator.hasNext()) {
			String next = channels1Iterator.next();
			if (next.equals("channel-3")) {
				television.setChannel(next);
				break;
			}
		}

		// Change channel 2
		Collection<String> channels2 = television.channels();
		Iterator<String> channels2Iterator = channels2.iterator();
		while (channels2Iterator.hasNext()) {
			String next = channels2Iterator.next();
			if (next.equals("channel-5")) {
				television.setChannel(next);
				break;
			}
		}
	}
}
