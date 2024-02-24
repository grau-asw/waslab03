package fib.asw.waslab03;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class Token {
	
	public static String get() {
		try {
			return ResourceBundle.getBundle("fib.asw.waslab03.token").getString("token");
		} catch (MissingResourceException e) {
			return "Missing token!";
		}
	}
	
}
