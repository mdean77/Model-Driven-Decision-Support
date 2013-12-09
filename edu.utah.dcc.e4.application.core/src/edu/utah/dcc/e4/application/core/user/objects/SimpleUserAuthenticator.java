package edu.utah.dcc.e4.application.core.user.objects;



/**
 * Wrapper class to handle user authentication without exposing
 * the underlying methods utilized. This implementation is stupid
 * and is designed to work with plain text passwords during
 * debugging.
 * 
 * @author mdean
 *
 */
public final class SimpleUserAuthenticator implements IAuthenticator {

	
	public SimpleUserAuthenticator() {
	}

	public  String encryptPassword(String userPassword) {
		return userPassword;
	}

	public  Boolean checkPassword(String inputPassword, String encryptedPassword) {
		if (inputPassword.equals(encryptedPassword)){
			System.out.println("Password is valid");
			return true;
		} else{
			System.out.println("Password is not valid");
			return false;
		}	
	}
}
