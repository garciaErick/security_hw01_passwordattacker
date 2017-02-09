package bruteForceAttack;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PasswordRetriever {
	private String[][] randomPasswords;
	private String[][] saltedPasswords;

	public PasswordRetriever() {
		randomPasswords = new String[10][2];
		saltedPasswords = new String[10][3];
	}

	private String[][] getPasswords(String fileName, String[][] arr) throws IOException {
		FileReader in = new FileReader(fileName);
		BufferedReader br = new BufferedReader(in);
		String line;
		int i = 0;
		br.readLine(); //Skipping the first line
		while ((line = br.readLine()) != null) {
			arr[i] = line.split(", ");
			i++;
		}
		in.close();
		return arr;
	}

	public String[][] getRandomPasswords() throws IOException {
		String fileName = "src/resources/3NSMnXOKH2@.txt";
		return getPasswords(fileName, randomPasswords);
	}

	public String[][] getSaltedPasswords() throws IOException {
		String fileName = "src/resources/3NSMnXOKH2.txt";
		return getPasswords(fileName, saltedPasswords);
	}
}
