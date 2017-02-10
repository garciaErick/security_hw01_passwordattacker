package attacks;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws Exception {
		FileRetriever fileRetriever = new FileRetriever();
		String[][] saltedPasswords = fileRetriever.getSaltedPasswords();
		String[][] randomPasswords = fileRetriever.getRandomPasswords();
		ArrayList<String> dictionary = fileRetriever.getDictionary();

		DictionaryAttacker dictionaryAttacker = new DictionaryAttacker(saltedPasswords, dictionary);
		BruteForceAttacker bruteForceAttacker = new BruteForceAttacker(randomPasswords, dictionary);

		System.out.println("Dictionary Attack");
		dictionaryAttacker.attack();
		System.out.println();

		System.out.println("Brute Force Attack");
		bruteForceAttacker.attack();
		System.out.println();
	}
}
