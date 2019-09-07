

package dataToBeShown;

public class TrackData {
	//All the information
	public static String[][][] trackData = {{
											{"Max","Acura MDX","1.1"},
											{"John","Lexus RX 350","2.4"},
											{"Ruby","BMW 3 series","0.8"},
											{"Max","Toyota Camry","3.8"},
											{"Ruby","Honda Civic","4.5"},
											{"John","Nissan Sentra","4.0"},
											{"Ruby","VW Jetta","2.8"},
											{"John","MBenz A Class","2.2"},
											{"Max","Jaguar XF","0.7"}},
			
											{
											{"Ruby","Ford F150","4.5"},
											{"John","Dodge D80","6.8"},
											{"Max","RAM 1500","7.6"},
											{"Max","Chevy Silverado","5.4"},
											{"John","GMC Sierra","9.8"},
											{"Ruby","Toyota Tacoma","7.4"},
											{"John","Chevy Colorado","5.9"},
											{"Max","Toyota Tundra","6.9"},
											{"Ruby","Ford Ranger","9.9"}}};
	
	//2D Arrays to output the information
	public static String[][] carTrackData = new String[9][3];
	public static String[][] truckTrackData = new String[9][3];
	
	public static String[][] carByDriver = new String [9][3];
	public static String[][] truckByDriver = new String [9][3];
	

	

	
	//Start the class
	public static void begin() {
		start();
		sortByDrivers();
		
		
	}
	
	
	//Adding the 3D array information to the 2D arrays
	public static void start() {
		for (int section = 0; section<2 ; section++) {
			for (int row = 0 ; row<9 ; row++) {
				for (int column = 0 ; column<3 ; column++) {
					if (section == 0) {carTrackData[row][column] = trackData[section][row][column];}
					else if (section == 1) {truckTrackData[row][column] = trackData[section][row][column];}
				}
			}
		}
		//Cloning the arrays
		carByDriver = carTrackData.clone();
		truckByDriver = truckTrackData.clone();
		
	}
	//Bubble sorting by the driver name
	public static void sortByDrivers() {
		//For cars
	      String temp;
	      for (int j = 0; j < 9; j++) {
	         for (int i = j + 1; i < 9; i++) {
	           
	            if (carByDriver[i][0].compareTo(carByDriver[j][0]) < 0) {
	               temp = carByDriver[j][0];
	               carByDriver[j][0] = carByDriver[i][0];
	               carByDriver[i][0] = temp;
	            }
	         }
	      }
	    
	     
	      //For trucks
	      String temp1;
	      for (int j = 0; j < 9; j++) {
	         for (int i = j + 1; i < 9; i++) {
	           
	            if (truckByDriver[i][0].compareTo(truckByDriver[j][0]) < 0) {
	               temp1 = truckByDriver[j][0];
	               truckByDriver[j][0] = truckByDriver[i][0];
	               truckByDriver[i][0] = temp1;
	            }
	         }
	      }
	      
	}
	
	
	

	
	
	
	

	
	
	

}

