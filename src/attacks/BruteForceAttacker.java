package attacks;

import java.util.ArrayList;

public class BruteForceAttacker extends Attacker {
	private final char[] possibleCharacters = "aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ1234567890-_".toCharArray();

	public BruteForceAttacker(String[][] passwords, ArrayList<String> dictionary) {
		super(passwords, dictionary);
	}

	void attack(){

		}
	}
}
