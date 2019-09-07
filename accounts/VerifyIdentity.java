


package accounts;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

import windows.Login;



public class VerifyIdentity extends Login {
	public static boolean confirmation=false;
	
	public static String uName;
	
	
	public static void loggingIn(String enteredUsername, String enteredPassword) throws FileNotFoundException {
		//Creating variables of the files in which the usernames and passwords are stored
		File usernames = new File ("pathname to username files");
		File passwords = new File ("pathname to passwords files");
		
		//Scanners to go through the files and add the usernames and password to the array list
		Scanner scanUsernames = new Scanner(usernames);
		Scanner scanPasswords = new Scanner(passwords);
		
		//Variable for the position of usernames corresponding to passwords
		int lineNum;
		
		//Arraylists for the usernames and passwords
		ArrayList<String> usernameArray = new ArrayList<String>();
		ArrayList<String> passwordArray = new ArrayList<String>();
		
		//While there is a another username and password in the file
		while (scanUsernames.hasNextLine()) {
			usernameArray.add(scanUsernames.nextLine());
			passwordArray.add(scanPasswords.nextLine());
		}
		
			//Finding the posistion of the username in the array
			lineNum=usernameArray.indexOf(enteredUsername);
			
			//If no username is found
			if (lineNum==-1) {
				JOptionPane.showMessageDialog(frameLogin, "No account found! Please try again or create an account");
				confirmation = false;
			}
		
			else {
				//If the entered password equals the password on file
				if (enteredPassword.equals(passwordArray.get(lineNum))) {
					JOptionPane.showMessageDialog(frameLogin, "Success!");
					uName = enteredUsername;
					confirmation = true;
				}
				
				else {
					//If the entered password does not equal the name on file
					JOptionPane.showMessageDialog(frameLogin, "Incorrect Password!");
					confirmation = false;
				}
				
			}
	}
	
	public static boolean getConfirmation() {
		return confirmation;
	}
	
}