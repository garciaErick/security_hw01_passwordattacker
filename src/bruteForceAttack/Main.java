package bruteForceAttack;

import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		PasswordRetriever passwordRetriever = new PasswordRetriever();
		String[][] saltedPasswords = passwordRetriever.getSaltedPasswords();
		String[][] randomPasswords = passwordRetriever.getRandomPasswords();
	}
}
