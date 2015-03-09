package com.socialcdeIntellij.action;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InterceptingFilter {

	public static boolean verifyText(String txt) {
		return (txt == "" ? false : true);
	}//verifica che il testo sia stato inserito

	public static boolean verifyMail(String mail) {
		if (mail.startsWith(".") || mail.startsWith("@") || mail == null) {
			return false;
		} else {
			Pattern p = Pattern.compile(".+@.+\\.[a-z]+");
			Matcher m = p.matcher(mail);
			return m.matches();
		}
	}//verifica la sintassi della email

	public static boolean verifyRegistrationPanel(HashMap<String, String> values) {
		Boolean flag = true;

		if (!verifyText(values.get("Password"))) {
			flag = false;
		}

		if (!verifyText(values.get("Username")) && flag) {
			flag = false;
		}

		if ((!verifyText(values.get("ConfirmPassword"))) && flag) {
			flag = false;
		} else if (verifyText(values.get("Password"))
				&& verifyText(values.get("ConfirmPassword"))
				&& !(values.get("ConfirmPassword").equals(values.get("Password")))) {
			flag = false;
		}

		if ((!verifyMail(values.get("Email"))) && flag) {
			flag = false;
		}

		if ((!verifyText(values.get("InvitationCode"))) && flag) {
			flag = false;
		}

		return flag;

	}//verifica il corretto inserimento dei dati di registrazione

}
