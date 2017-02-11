package attacks;

import resources.Sha1Generator;

import java.util.ArrayList;

class Attacker {

	String[][] userInfo;
	ArrayList<String> dictionary;
	private Sha1Generator sha1;
	private long startTime = System.currentTimeMillis();


	Attacker(String[][] userInfo, ArrayList<String> dictionary) {
		this.userInfo = userInfo;
		this.dictionary = dictionary;
		sha1 = new Sha1Generator();
	}

	void validatePassword(String user, String password, String passwordGuess, String salt) throws Exception {
		String hash = sha1.getHash(passwordGuess + salt);
		if (password.equals(hash))
			System.out.println("User: " + user + ", Password: " + passwordGuess + ", Time Elapsed: " + getEstimatedTime() + "ms");
	}

	private long getEstimatedTime() {
		long thisPasswordStartTime = startTime;
		startTime = System.currentTimeMillis();
		return System.currentTimeMillis() - thisPasswordStartTime;
	}
}

