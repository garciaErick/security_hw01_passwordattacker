package resources;

import javax.xml.bind.DatatypeConverter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.security.MessageDigest;

public class Sha1Generator {

	public Sha1Generator() {
	}

	public String getSha1(String toHash) throws Exception {
		MessageDigest hash = MessageDigest.getInstance("SHA1");
		hash.update(toHash.getBytes());
		byte[] digest = hash.digest();
		return DatatypeConverter.printHexBinary(digest).toLowerCase();
	}

	public static void main(String[] args) throws Exception {
		MessageDigest hash = MessageDigest.getInstance("SHA1");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print(" Enter string you want to hash: ");
		String toHash = in.readLine();
		hash.update(toHash.getBytes());
		byte[] digest = hash.digest();
		System.out.println(DatatypeConverter.printHexBinary(digest).toLowerCase());
	}

}
