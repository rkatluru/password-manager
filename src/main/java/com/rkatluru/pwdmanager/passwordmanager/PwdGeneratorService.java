/**
 * 
 */
package com.rkatluru.pwdmanager.passwordmanager;

import java.util.Random;

import org.springframework.stereotype.Component;

/**
 * @author Ramakrishna Atluru
 *
 */
@Component
public class PwdGeneratorService {
	public static final int passwordlength = 10;
	public String generatePassword() {
		return generatePwd();
	}

	private String generatePwd() {
		int lowerLimit = 48;
		int upperLimit = 122;
		
		Random random = new Random();
		
		String generatedString = random.ints(lowerLimit, upperLimit + 1)
			      .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
			      .limit(passwordlength)
			      .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
			      .toString();
		return generatedString;
	}
}
