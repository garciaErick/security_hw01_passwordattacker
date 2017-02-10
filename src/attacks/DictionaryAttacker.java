package attacks;

import java.util.ArrayList;

public class DictionaryAttacker extends Attacker {

	public DictionaryAttacker(String[][] passwords, ArrayList<String> dictionary) {
		super(passwords, dictionary);
	}

	public void attack() throws Exception{
		for (String[] password : passwords) {
			for (String word : dictionary) {
				String salt = password[1];
				String hash = sha1.getHash(word + salt);
				if (password[2].equals(hash)) {
					System.out.println(password[0] + ": " + word);
				}
			}
		}
	}
}
