package bruteForceAttack;

import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		PasswordRetriever passwordRetriever = new PasswordRetriever();
		String[][] saltedPasswords = passwordRetriever.getSaltedPasswords();
		String[][] randomPasswords = passwordRetriever.getRandomPasswords();
		for (String[] str : saltedPasswords) {
			for (String str1 : str) {
				System.out.print(str1 + ", ");
			}
			System.out.println();
		}
		System.out.println();
		for (String[] str : randomPasswords) {
			for (String str1 : str) {
				System.out.print(str1 + ", ");
			}
			System.out.println();
		}

	}
}
