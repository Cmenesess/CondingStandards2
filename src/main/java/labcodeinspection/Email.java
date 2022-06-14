package labcodeinspection;

import java.util.Locale;

public class Email {

	private transient final String m_firstName; 
	private transient final String m_lastName;
	private transient String password;
	private transient String department;
	final transient int defaultpasswordLength = 8;
	private transient String email;
	
	/**
	*Class constructor for Email
	*@param firstName the name of the Email.
	*@param lastName the last name of the Email.
	*/
	
	public Email(String firstName, String lastName) {
		this.m_firstName = firstName;
		this.m_lastName = lastName;
	}
	
	/**
	*Show info like the first name plus last name, department, email and password.
	*/
	public void showInfo() {
		System.out.println("\nFIRST NAME= " + m_firstName + "\nLAST NAME= " + m_lastName);
		System.out.println("DEPARMENT= " + department + "\nEMAIL= " + email + "\nPASSWORD= " + password);
	}
	
	/**
	*Set departments by a choice.
	*@param depChoice number choice of a department.
	*/
	public void setDeparment(int depChoice) {
		switch (depChoice) {
		case 1:
			this.department = "sales";
			break;
		case 2:
			this.department = "dev";
			break;
		case 3:
			this.department = "acct";
			break;
		default:
			break;
		}
	}

	private String randomPassword(int length) {
		String set = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890#$&@*";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * set.length());
			password[i] = set.charAt(rand);
		}
		return new String(password);
	}

	/**
	*
	* Method that help to generate the email 
	* @author Miguel Licea
	*/
	public void generateEmail() {
		this.password = this.randomPassword(this.defaultpasswordLength);
		this.email = this.m_firstName.toLowerCase(Locale.ROOT) + this.m_lastName.toLowerCase(Locale.ROOT) + "@" + this.department
				+ ".espol.edu.ec";
	}
}
