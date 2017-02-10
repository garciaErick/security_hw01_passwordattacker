package attacks;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

class FileRetriever {
	private String[][] randomPasswords;
	private String[][] saltedPasswords;
	private ArrayList<String> dictionary;

	FileRetriever() {
		randomPasswords = new String[10][2];
		saltedPasswords = new String[10][3];
		dictionary = new ArrayList<>();
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

	String[][] getRandomPasswords() throws IOException {
		String fileName = "src/resources/3NSMnXOKH2@.txt";
		return getPasswords(fileName, randomPasswords);
	}

	String[][] getSaltedPasswords() throws IOException {
		String fileName = "src/resources/3NSMnXOKH2.txt";
		return getPasswords(fileName, saltedPasswords);
	}

	ArrayList<String> getDictionary() throws IOException{
		FileReader in = new FileReader("src/resources/wordsEn.txt");
		BufferedReader br = new BufferedReader(in);
		String line;
		while ((line = br.readLine()) != null) {
			dictionary.add(line);
		}
		return dictionary;
	}
}
