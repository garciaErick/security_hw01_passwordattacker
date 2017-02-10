package attacks;

import resources.Sha1Generator;
import java.util.ArrayList;

class Attacker {

	String[][] passwords;
	ArrayList<String> dictionary;
	Sha1Generator sha1;

	Attacker(String[][] passwords, ArrayList<String> dictionary) {
		this.passwords = passwords;
		this.dictionary = dictionary;
		sha1 = new Sha1Generator();
	}
}

