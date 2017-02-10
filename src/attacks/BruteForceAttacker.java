package attacks;

import java.util.ArrayList;

class BruteForceAttacker extends Attacker {
	private final char[] possibleCharacters = "aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ1234567890-_".toCharArray();
	private ArrayList<String> currentCombination;
	private final long startTime = System.currentTimeMillis();

	BruteForceAttacker(String[][] passwords, ArrayList<String> dictionary) {
		super(passwords, dictionary);
		currentCombination = new ArrayList<>();
	}

	void attack() throws Exception {
		for (char possibleCharacter : possibleCharacters) {
			String passwordGuess = String.valueOf(possibleCharacter);
			currentCombination.add(passwordGuess);
			for (String[] password : passwords) validatePassword(password, passwordGuess);
		}

		for (int i = 0; i < 9; i++) verifyCurrentCombination();
	}

	private void verifyCurrentCombination() throws Exception {
		ArrayList<String> temp = new ArrayList<>();
		for (char possibleCharacter : possibleCharacters)
			for (String combination : currentCombination) {
				combination += possibleCharacter;
				temp.add(combination);
				for (String[] password : passwords) validatePassword(password, combination);
			}
		currentCombination = temp;
	}

	private void validatePassword(String[] password, String passwordGuess) throws Exception {
		String hash = sha1.getHash(passwordGuess);
		if (password[1].equals(hash)) {
			System.out.println(password[0] + ": " + passwordGuess);
			long estimatedTime = System.currentTimeMillis() - startTime;
			System.out.println("Time Elapsed: " + estimatedTime);
		}
	}
}
