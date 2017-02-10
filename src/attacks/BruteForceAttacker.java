package attacks;

import java.util.ArrayList;
import java.util.Arrays;

public class BruteForceAttacker extends Attacker {
	private final char[] possibleCharacters = "aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ1234567890-_".toCharArray();
	private int[] indexes;

	public BruteForceAttacker(String[][] passwords, ArrayList<String> dictionary) {
		super(passwords, dictionary);
		indexes = new int[64];
		Arrays.fill(indexes, 0);
	}

	public void attack() throws Exception {
		String passwordGuess = "";
		tryAllCombinationsLastChar();
	}

	public void tryAllCombinationsLastChar() throws Exception {
		String passwordGuess = "";
		for (char possibleCharacter1 : possibleCharacters) {
			passwordGuess = "";
			String baseString = "";
			baseString += possibleCharacter1;
			for (char possibleCharacter : possibleCharacters) {
				passwordGuess = baseString;
				passwordGuess += possibleCharacter;
				for (String[] password : passwords) {
					validatePassword(password, passwordGuess);
				}
			}
		}
	}

	public void possibleCombinations(int length, String prefix) throws Exception {
		if (length == 0)
			for (char possibleCharacter : possibleCharacters) {
				String passwordGuess = "";
				passwordGuess += prefix + possibleCharacter;
				System.out.println(passwordGuess);

				for (String[] password : passwords) {
					validatePassword(password, passwordGuess);
				}
			}
			if (length != 0){
				for (char possibleCharacter : possibleCharacters) {
					prefix += possibleCharacter;
					possibleCombinations(length - 1, prefix);
					prefix = "";
				}
			}
	}

	public void validatePassword(String[] password, String passwordGuess) throws Exception {
		String hash = sha1.getHash(passwordGuess);
		if (password[1].equals(hash)) {
			System.out.println(password[0] + ": " + passwordGuess);
		}
	}
}
