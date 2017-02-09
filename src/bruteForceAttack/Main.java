package bruteForceAttack;

import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException{
		RandomPasswordRetriever randomRetriever = new RandomPasswordRetriever();
		String[][] randomPasswords = randomRetriever.getPasswordsToCrack("F:\\xampp\\htdocs\\Security_hw01_passwordAttacker\\src\\resources\\3NSMnXOKH2@.txt");
		for (String[] str: randomPasswords) {
			for (String str1 :
					str) {
				System.out.println(str1);
			}
			
		}
	}
}
