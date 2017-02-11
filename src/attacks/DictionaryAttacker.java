package attacks;

import java.util.ArrayList;

class DictionaryAttacker extends Attacker {

	DictionaryAttacker(String[][] passwords, ArrayList<String> dictionary) {
		super(passwords, dictionary);
	}

	void attack() throws Exception {
		for (String[] row : userInfo)
			for (String passwordGuess : dictionary) {
				String user = row[0], salt = row[1], password = row[2];
				validatePassword(user, password, passwordGuess, salt);
			}
	}
}

