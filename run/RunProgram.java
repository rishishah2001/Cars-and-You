

package run;

import automobiles.AutomobileData;
import dataToBeShown.HomepageRandomizer;
import windows.Login;

public class RunProgram {
	//Main method
	public static void main(String[] args) {
		AutomobileData a = new AutomobileData();
		//Read from files for the automobiles
		a.readFromFileCars();
		a.readFromFileTrucks();
		a.readFromFileMotorcycles();
		//Generating random numbers
		HomepageRandomizer.generateRandomNumbers();
		//Initalizing the login Frame
		Login.initialize();
		
		//AutomobileData.dataWriting();
		

	}
	
	

}
