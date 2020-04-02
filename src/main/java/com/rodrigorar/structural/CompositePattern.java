package com.rodrigorar.structural;

import com.rodrigorar.structural.composite.Directory;
import com.rodrigorar.structural.composite.File;

public class CompositePattern {
	public static void main(String[] args) {
		File wholeLottaLove = new File("Wholle Lotta Love.flac");
		File communicationBreakdown = new File("Communication Breakdonw.mp3");
		Directory ledZeppelin = new Directory("Led Zeppelin");
		ledZeppelin.add(wholeLottaLove);
		ledZeppelin.add(communicationBreakdown);

		File voodooChild = new File("Voodoo Child.mp3");
		File theWindCriesMary = new File("The Wind Cries Mary.mp3");
		File littleWing = new File("Little Wing.mp3");
		Directory jimiHendrix = new Directory("Jimi Hendrix");
		jimiHendrix.add(voodooChild);
		jimiHendrix.add(theWindCriesMary);
		jimiHendrix.add(littleWing);

		Directory music = new Directory("Music");
		music.add(ledZeppelin);
		music.add(jimiHendrix);

		music.ls();
	}
}
