

package accounts;
import java.io.*;
import java.net.URL;
import java.nio.file.Files;
import java.util.*;



public class Accounts  {
	
	//Username and password variables
	public  String username;
	public  String password;
	
	//Creating a arraylist to store usernames and passwords
	public  ArrayList<String> usernameArray = new ArrayList<String>();
	public  ArrayList<String> passwordArray = new ArrayList<String>();
	
	//Storing the file path in as a variable
	File usernames = new File ("pathname to username files");
	File passwords = new File ("pathname to passwords files");
	
	//Variable for line number
	int lineNum;
	
	
	
	
	
	//Constructor to assign usernames and passwords
	public Accounts (String a, String p) throws IOException {
		readFromFile();
		username = a;
		password = p;
		
		//Adding the new object's username and password to their specific arraylist
		usernameArray.add(username);
		passwordArray.add(password);
		writeToFile(username, password);
	}
	
	//Set methods for usernames and passwords
	public void setUsername (String a) { username = a; }
	public void setPassword (String p) { password = p; }
	
	//Get methods for usernames and passwords
	public String getUsername () { return username; }
	public String getPassword () { return password; }
	
	
	
	
	//Method to read the information from a file
	public  void readFromFile () throws IOException {
		
		//Create scanners to look through the files and retrieve information
		Scanner scanUsernames = new Scanner(usernames);
		Scanner scanPasswords = new Scanner(passwords);
		
		//Variable for the number in a line
		int lineNum;
		
		//Adding to the arraylists if there is more information in the file
		while (scanUsernames.hasNextLine()) {
			usernameArray.add(scanUsernames.nextLine());
			passwordArray.add(scanPasswords.nextLine());
		}
		
	}
	
	public  void writeToFile (String username , String password) throws IOException {
		//Creating filewriter objects with the username and password files in mind
		FileWriter usernameWriter = new FileWriter ("pathname to usernames files");
		FileWriter passwordWriter = new FileWriter ("pathname to passwords files");
		
		//Creating a for loop to continue to add the usernames and passwords to the files
		for (int i=0;i<usernameArray.size();i++) { 
			//Adding usernames
			String usernameSTR = usernameArray.get(i).toString();
            usernameWriter.write(usernameSTR);
            //Adding passwords
            String passwordSTR = passwordArray.get(i).toString();
            passwordWriter.write(passwordSTR);
            //Preventing a blank line from being added at the end of the file
            if(i < (usernameArray.size()-1)) {
            	usernameWriter.write("\n");
            	passwordWriter.write("\n");
            }
		}
		//Ending the writer objects, thus ending writing to a file
		usernameWriter.close();
		passwordWriter.close();
	}
	
	
	
}
