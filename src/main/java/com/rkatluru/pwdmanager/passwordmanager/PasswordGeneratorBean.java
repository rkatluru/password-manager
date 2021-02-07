/**
 * 
 */
package com.rkatluru.pwdmanager.passwordmanager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Ramakrishna Atluru
 *
 */
@RestController
public class PasswordGeneratorBean {
	@Autowired
	 private PwdGeneratorService pwdGeneratorService;
	@GetMapping(path="/genpwd")
	public String generatePassword() {
		return pwdGeneratorService.generatePassword();
	}
}
