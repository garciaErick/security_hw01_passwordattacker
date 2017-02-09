package bruteForceAttack;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class RandomPasswordRetriever {

	public RandomPasswordRetriever() {
	}

	public String[][] getPasswordsToCrack(String fileName) throws IOException {
		String[][] userRandomPasswords = new String[2][10];

		FileReader in = new FileReader(fileName);
		BufferedReader br = new BufferedReader(in);
		String line;
		int i = 0;
		while ((line = br.readLine()) != null) {
			userRandomPasswords[i] = line.split(", ");
			i++;
		}
		in.close();
		return userRandomPasswords;
	}
}
