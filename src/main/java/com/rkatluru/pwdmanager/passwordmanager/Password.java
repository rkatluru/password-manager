/**
 * 
 */
package com.rkatluru.pwdmanager.passwordmanager;

/**
 * @author Ramakrishna Atluru
 *
 */
public class Password {
	private String password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Password(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Password [password=" + password + "]";
	}
	
	
	
}
