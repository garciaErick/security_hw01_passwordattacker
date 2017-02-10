package attacks;

import resources.Sha1Generator;

import java.util.ArrayList;

class Attacker {

	protected String[][] passwords;
	protected ArrayList<String> dictionary;
	protected Sha1Generator sha1;

	Attacker(String[][] passwords, ArrayList<String> dictionary) {
		this.passwords = passwords;
		this.dictionary = dictionary;
		sha1 = new Sha1Generator();
	}
}

