

package dataToBeShown;

import automobiles.AutomobileData;
import windows.ResultsOfSorting;

public class ResultsOfSortingArrays extends SortingCarsResults {

	//Establishing arrays in which the results are stored
	public static String[][] resultsCars = new String[10][7];
	
	public static String[][] resultsTrucks = new String[10][7];
	
	public static String[][] resultsMotorcycles = new String[10][7];
	
	//Counter for how many of each vehicle has been added
	static int counterC =0;
	static int counterT =0;
	static int counterM =0;
	
	//Starting the class
	public static void output() {
		//Storing results of each of the variables
		resultsCars();
		resultsTrucks();
		resultsMotorcycles();
		//Initalizing the JFrame
		ResultsOfSorting.initialize();
	}
	
	//Results for cars 
	public static void resultsCars() {
		
		//If there are no car matches
		if (carMatches.size() ==0) {
			resultsCars = new String[2][7];
			for (int row = 0 ; row<2;row++) {
				for (int column = 0; column<7;column++) {
					resultsCars[row][column]="";
				}
			}
		}
		//If there are car matches
		else {
			int size = carMatches.size();
			counterC = counterC+1;
			//Reseting the cars array
			if (counterC > 1) {
				for (int a = 0 ; a<resultsCars.length;a++) {
					for (int column = 0; column<7;column++) {
						resultsCars[a][column]="";
					}
				}
			}
			//Adding the corresponding information to each car
			System.out.println(getCarMatches());
			for (int row=0;row<getCarMatches().size();row++) {
				for (int column=0;column<7;column++) {
					if (column ==0) {resultsCars[row][column] = AutomobileData.carsArray[carMatches.get(row)].getMake();}
					else if (column == 1) {resultsCars[row][column] = AutomobileData.carsArray[carMatches.get(row)].getModel();}
					else if (column == 2) {resultsCars[row][column] = Integer.toString(AutomobileData.carsArray[carMatches.get(row)].getYear());}
					else if (column == 3) {resultsCars[row][column] = Float.toString(AutomobileData.carsArray[carMatches.get(row)].getKmPerLitre());}
					else if (column == 4) {resultsCars[row][column] = Double.toString(AutomobileData.carsArray[carMatches.get(row)].getCost());}
					else if (column == 5) {resultsCars[row][column] = Integer.toString(AutomobileData.carsArray[carMatches.get(row)].getSeats());}
					else if (column == 6) {resultsCars[row][column] = Integer.toString(AutomobileData.carsArray[carMatches.get(row)].getHorsePower());}
				}
			}
		}
	}
	
	
	//Results for trucks
	public static void resultsTrucks() {
		
		//If there are no truck matches
		if (truckMatches.size() ==0) {
			resultsTrucks = new String[2][7];
			for (int row = 0 ; row<2;row++) {
				for (int column = 0; column<7;column++) {
					resultsTrucks[row][column]="";
				}
			}
		}
		//If there are truck results
		else {
			counterT = counterT +1;
			//If there has been one sort this resets the array
			if (counterT>1) {
				for (int a = 0 ; a<resultsTrucks.length;a++) {
					for (int column = 0; column<7;column++) {
						resultsTrucks[a][column]="";
					}
				}
			}
			int size = truckMatches.size();
			//Adding the corresponding information to the results array
			for (int row=0;row<getTruckMatches().size();row++) {
				for (int column=0;column<7;column++) {
					if (column ==0) {resultsTrucks[row][column] = AutomobileData.trucksArray[truckMatches.get(row)].getMake();}
					else if (column == 1) {resultsTrucks[row][column] = AutomobileData.trucksArray[truckMatches.get(row)].getModel();}
					else if (column == 2) {resultsTrucks[row][column] = Integer.toString(AutomobileData.trucksArray[truckMatches.get(row)].getYear());}
					else if (column == 3) {resultsTrucks[row][column] = Float.toString(AutomobileData.trucksArray[truckMatches.get(row)].getKmPerLitre());}
					else if (column == 4) {resultsTrucks[row][column] = Double.toString(AutomobileData.trucksArray[truckMatches.get(row)].getCost());}
					else if (column == 5) {resultsTrucks[row][column] = Double.toString(AutomobileData.trucksArray[truckMatches.get(row)].getTrailerWeight());}
					else if (column == 6) {resultsTrucks[row][column] = Integer.toString(AutomobileData.trucksArray[truckMatches.get(row)].getWheels());}
				}
			}
		}
	}
	
	//Results of the motorctycle sorting
	public static void resultsMotorcycles() {
		
		//IF there was no montorcycles found
		if (motorcycleMatches.size() ==0) {
			resultsMotorcycles = new String[2][7];
			resultsMotorcycles[0][0]="";
			for (int row = 0 ; row<2;row++) {
				for (int column = 0; column<7;column++) {
					resultsMotorcycles[row][column]="";
				}
			} 
		}
		//If there were motorcycles found
		else {
			counterM = counterM +1;
			//Resets the array of results after every sort
			if (counterM>1) {			
				for (int a = 0 ; a<resultsMotorcycles.length;a++) {
					for (int column = 0; column<7;column++) {
						resultsMotorcycles[a][column]="";
					}
				}
			}
			int size = motorcycleMatches.size();
			
			
			
			
			//Adding the motorcycle infromation to the corresponding section in the array
			for (int row=0;row<getMotorcycleMatches().size();row++) {
				for (int column=0;column<7;column++) {
					if (column ==0) {resultsMotorcycles[row][column] = AutomobileData.motorcyclesArray[motorcycleMatches.get(row)].getMake();}
					else if (column == 1) {resultsMotorcycles[row][column] = AutomobileData.motorcyclesArray[motorcycleMatches.get(row)].getModel();}
					else if (column == 2) {resultsMotorcycles[row][column] = Integer.toString(AutomobileData.motorcyclesArray[motorcycleMatches.get(row)].getYear());}
					else if (column == 3) {resultsMotorcycles[row][column] = Float.toString(AutomobileData.motorcyclesArray[motorcycleMatches.get(row)].getKmPerLitre());}
					else if (column == 4) {resultsMotorcycles[row][column] = Double.toString(AutomobileData.motorcyclesArray[motorcycleMatches.get(row)].getCost());}
					else if (column == 5) {resultsMotorcycles[row][column] = AutomobileData.motorcyclesArray[motorcycleMatches.get(row)].getConduction();}
					else if (column == 6) {resultsMotorcycles[row][column] = Integer.toString(AutomobileData.motorcyclesArray[motorcycleMatches.get(row)].getSeatHeight());}
				}
			}
		}
		
	}
	
	
	
	
	
	
	
	
	
}
