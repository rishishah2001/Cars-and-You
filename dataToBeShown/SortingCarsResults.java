

package dataToBeShown;

import java.util.ArrayList;

import javax.swing.JRadioButton;

import automobiles.AutomobileData;
import windows.SortCars;

public class SortingCarsResults extends SortCars{
	
	public static ArrayList<String> checksCars = new ArrayList<String>();
	public static ArrayList<String> checksTrucks= new ArrayList<String>();
	public static ArrayList<String> checksMotorcycles = new ArrayList<String>();

	
	public static ArrayList<Integer> carMatches = new ArrayList<Integer>();	
	public static ArrayList<Integer> truckMatches = new ArrayList<Integer>();
	public static ArrayList<Integer> motorcycleMatches = new ArrayList<Integer>();
	
	
	//Start checking
	public static void startChecking() {
		
		//Runs the corresponding sequence of checks depending on which buttons are selected in the GUI
		if (radioButtonTrucks.isSelected() == true && radioButtonMotorcycles.isSelected() == true && radioButtonCars.isSelected() == true ) {
			System.out.println("All");
			truckResults();
			carResults();
			
			motorcycleResults();
			print();
	
		}
		else if (radioButtonCars.isSelected() == true && radioButtonTrucks.isSelected() == true) {
			System.out.println("Cars & Trucks");
			carResults();
			truckResults();
			print();
		}
		else if (radioButtonCars.isSelected() == true && radioButtonMotorcycles.isSelected() == true) {
			System.out.println("Cars & Motorcycles");
			carResults();
			motorcycleResults();
			print();
		}
		else if (radioButtonTrucks.isSelected() == true && radioButtonMotorcycles.isSelected() == true) {
			System.out.println("Trucks & Motorcycles");
			truckResults();
			motorcycleResults();
			print();
		}
		
		else if (radioButtonTrucks.isSelected() == true) {
			System.out.println("Single Trucks");
			truckResults();
			print();
		}
		else if (radioButtonMotorcycles.isSelected() == true) {
			System.out.println("Single Motorcycles");
			motorcycleResults();
			print();
		}
		
		
		else if (radioButtonCars.isSelected() == true) {
			System.out.println("Single Cars");
			carResults();
			print();
		}
		
	}
	
	//Car results
	public static void carResults() {
		//Clearing the car matches for every sort
		carMatches.clear();
		for (int i=0 ; i<10 ; i++) {
			//Resetting the car checks for each car
			checksCars.clear();
			//Checking if the make of the car is correct
			if (radioButtonNoPreferenceMake.isSelected() == false ) {
				
				if (AutomobileData.carsArray[i].getMake().equals(enteredMake)) {checksCars.add("true");}
				else {checksCars.add("false");}
			}
			
			else {checksCars.add("true");}
			//Checking if the model is correct
			if (radioButtonNoPreferenceModel.isSelected() == false) {
				
				
				if (AutomobileData.carsArray[i].getModel().equals(enteredModel)) {checksCars.add("true");}
				else {checksCars.add("false");}		
			}
			else {checksCars.add("true");}
			//Checking if the cost is correct
			if (radioButtonLessThanCost.isSelected() == true) {
				
				if (AutomobileData.carsArray[i].getCost() <= cost) {checksCars.add("true");}
				else {checksCars.add("false");}	
			}

			else if (radioButtonMoreThanCost.isSelected() == true) {
	
				if (AutomobileData.carsArray[i].getCost() > cost) {checksCars.add("true");}
				else {checksCars.add("false");}	
			}
			else {checksCars.add("true");}
			//Checking if the year released is correct
			if (radioButtonLessThanYear.isSelected() == true) {
				if (AutomobileData.carsArray[i].getYear() <= year) {checksCars.add("true");}
				else {checksCars.add("false");}
			}
			else if (radioButtonMoreThanYear.isSelected() == true) {
				if (AutomobileData.carsArray[i].getYear() > year) {checksCars.add("true");}
				else {checksCars.add("false");}
			}
			else {checksCars.add("true");}
			//Checking if the KM / L is correct
			if (radioButtonLessThanKM.isSelected() == true) {
			
				if (AutomobileData.carsArray[i].getKmPerLitre() <= km) {checksCars.add("true");}
				else {checksCars.add("false");}	
			}
			else if (radioButtonMoreThanKM.isSelected() == true) {
				
				if (AutomobileData.carsArray[i].getKmPerLitre() > km) {checksCars.add("true");}
				else {checksCars.add("false");}	
			}
			else {checksCars.add("true");}
			
			
			//Checking if the seats is correct
			if (radioButtonLessThenSeats.isSelected() == true) {
				
				if (AutomobileData.carsArray[i].getSeats() <= seats) {checksCars.add("true");}
				else {checksCars.add("false");}	
			}
			else if (radioButtonMoreThenSeats.isSelected() == true) {
				
				if (AutomobileData.carsArray[i].getSeats() > seats) {checksCars.add("true");}
				else {checksCars.add("false");}	
			}
			else {checksCars.add("true");}
			
			//Checking if the horspower is correcrt
			if (radioButtonLessThanHP.isSelected() == true) {
				
				if (AutomobileData.carsArray[i].getHorsePower() <= HP) {checksCars.add("true");}
				else {checksCars.add("false");}	
			}
			else if (radioButtonMoreThanHP.isSelected() == true) {
			
				if (AutomobileData.carsArray[i].getHorsePower() > HP) {checksCars.add("true");}
				else {checksCars.add("false");}	
			}
			else {checksCars.add("true");}
			//If all the conndition are true add it to the car matches
			for (int x = 0; x<7;x++) {
				System.out.println(checksCars.get(x));
				if (checksCars.get(x).equals("false")){
				
					break;
				}
				else if (x==6) {
					
					carMatches.add(i);
				}
			}
		}
	}

	
	//Truck results
	public static void truckResults() {
		truckMatches.clear();
		for (int i=0 ; i<10 ; i++) {
			checksTrucks.clear();
			if (radioButtonNoPreferenceMake.isSelected() == false ) {
				
				if (AutomobileData.trucksArray[i].getMake().equals(enteredMake)) {checksTrucks.add("true");}
				else {checksTrucks.add("false");}
			}
			
			else {checksTrucks.add("true");}
			if (radioButtonNoPreferenceModel.isSelected() == false) {
				
				
				if (AutomobileData.trucksArray[i].getModel().equals(enteredModel)) {checksTrucks.add("true");}
				else {checksTrucks.add("false");}		
			}
			else {checksTrucks.add("true");}

			if (radioButtonLessThanCost.isSelected() == true) {
				
				if (AutomobileData.trucksArray[i].getCost() <= cost) {checksTrucks.add("true");}
				else {checksTrucks.add("false");}	
			}

			else if (radioButtonMoreThanCost.isSelected() == true) {
	
				if (AutomobileData.trucksArray[i].getCost() > cost) {checksTrucks.add("true");}
				else {checksTrucks.add("false");}	
			}
			else {checksTrucks.add("true");}
			
			if (radioButtonLessThanYear.isSelected() == true) {
				if (AutomobileData.trucksArray[i].getYear() <= year) {checksTrucks.add("true");}
				else {checksTrucks.add("false");}
			}
			else if (radioButtonMoreThanYear.isSelected() == true) {
				if (AutomobileData.trucksArray[i].getYear() > year) {checksTrucks.add("true");}
				else {checksTrucks.add("false");}
			}
			else {checksTrucks.add("true");}
			
			
			
			if (radioButtonLessThanKM.isSelected() == true) {
			
				if (AutomobileData.trucksArray[i].getKmPerLitre() <= km) {checksTrucks.add("true");}
				else {checksTrucks.add("false");}	
			}
			else if (radioButtonMoreThanKM.isSelected() == true) {
				
				if (AutomobileData.trucksArray[i].getKmPerLitre() > km) {checksTrucks.add("true");}
				else {checksTrucks.add("false");}	
			}
			else {checksTrucks.add("true");}
			
			//Checking if the trailer weight is correct
			
			if (radioButtonLessThanWeight.isSelected() == true) {
				
				if (AutomobileData.trucksArray[i].getTrailerWeight() <= weight) {checksTrucks.add("true");}
				else {checksTrucks.add("false");}	
			}
			else if (radioButtonMoreThanWeight.isSelected() == true) {
				
				if (AutomobileData.trucksArray[i].getTrailerWeight() > weight) {checksTrucks.add("true");}
				else {checksTrucks.add("false");}	
			}
			else {checksTrucks.add("true");}
			
			//Checking if the number of wheels is correcrt
			if (radioButtonLessThanWheels.isSelected() == true) {
				
				if (AutomobileData.trucksArray[i].getWheels() <= wheels) {checksTrucks.add("true");}
				else {checksTrucks.add("false");}	
			}
			else if (radioButtonMoreThanWheels.isSelected() == true) {
			
				if (AutomobileData.trucksArray[i].getWheels() > wheels) {checksTrucks.add("true");}
				else {checksTrucks.add("false");}	
			}
			else {checksTrucks.add("true");}
			for (int x = 0; x<7;x++) {
				if (checksTrucks.get(x).equals("false")){
				
					break;
				}
				else if (x==6) {
					
					truckMatches.add(i);
				}
			}
		}
	}
	
	//Motorcycle results
	public static void motorcycleResults() {
		motorcycleMatches.clear();
		for (int i=0 ; i<10 ; i++) {
			checksMotorcycles.clear();
			if (radioButtonNoPreferenceMake.isSelected() == false ) {
				
				if (AutomobileData.motorcyclesArray[i].getMake().equals(enteredMake)) {checksMotorcycles.add("true");}
				else {checksMotorcycles.add("false");}
			}
			
			else {checksMotorcycles.add("true");}
			if (radioButtonNoPreferenceModel.isSelected() == false) {
				
				
				if (AutomobileData.motorcyclesArray[i].getModel().equals(enteredModel)) {checksMotorcycles.add("true");}
				else {checksMotorcycles.add("false");}		
			}
			else {checksMotorcycles.add("true");}

			if (radioButtonLessThanCost.isSelected() == true) {
				
				if (AutomobileData.motorcyclesArray[i].getCost() <= cost) {checksMotorcycles.add("true");}
				else {checksMotorcycles.add("false");}	
			}

			else if (radioButtonMoreThanCost.isSelected() == true) {
	
				if (AutomobileData.motorcyclesArray[i].getCost() > cost) {checksMotorcycles.add("true");}
				else {checksMotorcycles.add("false");}	
			}
			else {checksMotorcycles.add("true");}
			
			
			if (radioButtonLessThanYear.isSelected() == true) {
				if (AutomobileData.motorcyclesArray[i].getYear() <= year) {checksMotorcycles.add("true");}
				else {checksMotorcycles.add("false");}
			}
			else if (radioButtonMoreThanYear.isSelected() == true) {
				if (AutomobileData.motorcyclesArray[i].getYear() > year) {checksMotorcycles.add("true");}
				else {checksMotorcycles.add("false");}
			}
			else {checksMotorcycles.add("true");}
			
			
			
			
			
			
			
			if (radioButtonLessThanKM.isSelected() == true) {
			
				if (AutomobileData.motorcyclesArray[i].getKmPerLitre() <= km) {checksMotorcycles.add("true");}
				else {checksMotorcycles.add("false");}	
			}
			else if (radioButtonMoreThanKM.isSelected() == true) {
				
				if (AutomobileData.motorcyclesArray[i].getKmPerLitre() > km) {checksMotorcycles.add("true");}
				else {checksMotorcycles.add("false");}	
			}
			else {checksMotorcycles.add("true");}
			
			
			//Checking if the seat height is correct
			if (radioButtonLessThanSeatHeight.isSelected() == true) {
				
				if (AutomobileData.motorcyclesArray[i].getSeatHeight() <= height) {checksMotorcycles.add("true");}
				else {checksMotorcycles.add("false");}	
			}
			else if (radioButtonMoreThanSeatHeight.isSelected() == true) {
				
				if (AutomobileData.motorcyclesArray[i].getSeatHeight() > height) {checksMotorcycles.add("true");}
				else {checksMotorcycles.add("false");}	
			}
			else {checksMotorcycles.add("true");}
			
			//Checking if the radio buttons are correct
			if (radioButtonTypeA.isSelected() == true) {
				
				if (AutomobileData.motorcyclesArray[i].getConduction().equals("Type A")) {checksMotorcycles.add("true");}
				else {checksMotorcycles.add("false");}	
			}
			else if (radioButtonTypeB.isSelected() == true) {
				
				if (AutomobileData.motorcyclesArray[i].getConduction().equals("Type B")) {checksMotorcycles.add("true");}
				else {checksMotorcycles.add("false");}	
			}
			else if (radioButtonTypeC.isSelected() == true) {
				
				if (AutomobileData.motorcyclesArray[i].getConduction().equals("Type C")) {checksMotorcycles.add("true");}
				else {checksMotorcycles.add("false");}	
			}
			else if (radioButtonTypeD.isSelected() == true) {
				checksMotorcycles.add("true");
			}
			
			
			for (int x = 0; x<7;x++) {
				if (checksMotorcycles.get(x).equals("false")){
				
					break;
				}
				else if (x==6) {
					
					motorcycleMatches.add(i);
				}
			}
		}
	}
	
	
	//Outputting the information
	public static void print() {
		
		ResultsOfSortingArrays.output();
	}
	//Getters and setters
	public static ArrayList<Integer> getCarMatches() {
		return carMatches;
	}

	public static void setCarMatches(ArrayList<Integer> carMatches) {
		SortingCarsResults.carMatches = carMatches;
	}

	public static ArrayList<Integer> getTruckMatches() {
		return truckMatches;
	}

	public static void setTruckMatches(ArrayList<Integer> truckMatches) {
		SortingCarsResults.truckMatches = truckMatches;
	}

	public static ArrayList<Integer> getMotorcycleMatches() {
		return motorcycleMatches;
	}

	public static void setMotorcycleMatches(ArrayList<Integer> motorcycleMatches) {
		SortingCarsResults.motorcycleMatches = motorcycleMatches;
	}
	
	
	
}
