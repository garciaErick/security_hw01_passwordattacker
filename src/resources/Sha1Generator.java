package resources;

import javax.xml.bind.DatatypeConverter;
import java.security.MessageDigest;

public class Sha1Generator {

	public Sha1Generator() {
	}

	public String getHash(String toHash) throws Exception {
		MessageDigest hash = MessageDigest.getInstance("SHA1");
		hash.update(toHash.getBytes());
		byte[] digest = hash.digest();
		return DatatypeConverter.printHexBinary(digest).toLowerCase();
	}
}
