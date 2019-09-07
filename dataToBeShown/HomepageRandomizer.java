

package dataToBeShown;

import java.util.*;

import automobiles.AutomobileData;

public class HomepageRandomizer extends AutomobileData {

	//Create variable for the cars to be picked
	public static String carsNum;
	public static String trucksNum;
	public static String motorcyclesNum;
	
	static ArrayList<Integer> random = new ArrayList<Integer>();
	
	
	public static void generateRandomNumbers() {
		//Create 10 random numbers
		for (int s=0 ; s<10 ; s++) {
			random.add(new Integer(s));
		}
		//Set the random cars to be used
		carsNum = generateRandomCar();
		trucksNum = generateRandomTruck();
		motorcyclesNum = generateRandomMotorcycle();
		
		
		
		//Set the vehicles that will appear on the homepage
		setDataValuesHome();
	}
	//Generate 3 random cars to use
	public static String generateRandomCar() {
		String c="";
		//Shiffing the arraylsit 
		Collections.shuffle(random);
	
		//Taking the first 3 cars
		for (int x=0 ; x<3 ; x++) {
			c= c +(Integer.toString(random.get(x)));
			
		}
		//returning the 3 cars
		return c;
	}
	//Generating random trucks
	public static String generateRandomTruck() {
		String t="";
		//Suffling the arraylist
		Collections.shuffle(random);
	
		//Getting the first 3 trucks 
		for (int x=0 ; x<3 ; x++) {
			t= t +(Integer.toString(random.get(x)));
		}
		
		return t;
	}
	//Generating a random motorcyle 
	public static String generateRandomMotorcycle() {
		String m="";
		Collections.shuffle(random);
		//Getting the first 3 motorcycles
		for (int x=0 ; x<3 ; x++) {
			m= m +(Integer.toString(random.get(x)));
		}
		
		return m;
	}
	
	//Setting that data values
	public static void setDataValuesHome() {
		//Cars
		dataHomeCars [0][0] = carsArray[Integer.parseInt(carsNum.substring(0,1))].getMake();
		dataHomeCars [0][1] = carsArray[Integer.parseInt(carsNum.substring(0,1))].getModel();
		dataHomeCars [0][2] = Integer.toString(carsArray[Integer.parseInt(carsNum.substring(0,1))].getYear());
		dataHomeCars [0][3] = Float.toString(carsArray[Integer.parseInt(carsNum.substring(0,1))].getKmPerLitre());
		dataHomeCars [0][4] = Double.toString(carsArray[Integer.parseInt(carsNum.substring(0,1))].getCost());
		dataHomeCars [0][5] = Integer.toString(carsArray[Integer.parseInt(carsNum.substring(0,1))].getSeats());
		dataHomeCars [0][6] = Integer.toString(carsArray[Integer.parseInt(carsNum.substring(0,1))].getHorsePower());
		
		dataHomeCars [1][0] = carsArray[Integer.parseInt(carsNum.substring(1,2))].getMake();
		dataHomeCars [1][1] = carsArray[Integer.parseInt(carsNum.substring(1,2))].getModel();
		dataHomeCars [1][2] = Integer.toString(carsArray[Integer.parseInt(carsNum.substring(1,2))].getYear());
		dataHomeCars [1][3] = Float.toString(carsArray[Integer.parseInt(carsNum.substring(1,2))].getKmPerLitre());
		dataHomeCars [1][4] = Double.toString(carsArray[Integer.parseInt(carsNum.substring(1,2))].getCost());
		dataHomeCars [1][5] = Integer.toString(carsArray[Integer.parseInt(carsNum.substring(1,2))].getSeats());
		dataHomeCars [1][6] = Integer.toString(carsArray[Integer.parseInt(carsNum.substring(1,2))].getHorsePower());
		
		dataHomeCars [2][0] = carsArray[Integer.parseInt(carsNum.substring(2))].getMake();
		dataHomeCars [2][1] = carsArray[Integer.parseInt(carsNum.substring(2))].getModel();
		dataHomeCars [2][2] = Integer.toString(carsArray[Integer.parseInt(carsNum.substring(2))].getYear());
		dataHomeCars [2][3] = Float.toString(carsArray[Integer.parseInt(carsNum.substring(2))].getKmPerLitre());
		dataHomeCars [2][4] = Double.toString(carsArray[Integer.parseInt(carsNum.substring(2))].getCost());
		dataHomeCars [2][5] = Integer.toString(carsArray[Integer.parseInt(carsNum.substring(2))].getSeats());
		dataHomeCars [2][6] = Integer.toString(carsArray[Integer.parseInt(carsNum.substring(2))].getHorsePower());
		
		
		//Trucks
		dataHomeTrucks [0][0] = trucksArray[Integer.parseInt(trucksNum.substring(0,1))].getMake();
		dataHomeTrucks [0][1] = trucksArray[Integer.parseInt(trucksNum.substring(0,1))].getModel();
		dataHomeTrucks [0][2] = Integer.toString(trucksArray[Integer.parseInt(trucksNum.substring(0,1))].getYear());
		dataHomeTrucks [0][3] = Float.toString(trucksArray[Integer.parseInt(trucksNum.substring(0,1))].getKmPerLitre());
		dataHomeTrucks [0][4] = Double.toString(trucksArray[Integer.parseInt(trucksNum.substring(0,1))].getCost());
		dataHomeTrucks [0][5] = Double.toString(trucksArray[Integer.parseInt(trucksNum.substring(0,1))].getTrailerWeight());
		dataHomeTrucks [0][6] = Integer.toString(trucksArray[Integer.parseInt(trucksNum.substring(0,1))].getWheels());
		
		dataHomeTrucks [1][0] = trucksArray[Integer.parseInt(trucksNum.substring(1,2))].getMake();
		dataHomeTrucks [1][1] = trucksArray[Integer.parseInt(trucksNum.substring(1,2))].getModel();
		dataHomeTrucks [1][2] = Integer.toString(trucksArray[Integer.parseInt(trucksNum.substring(1,2))].getYear());
		dataHomeTrucks [1][3] = Float.toString(trucksArray[Integer.parseInt(trucksNum.substring(1,2))].getKmPerLitre());
		dataHomeTrucks [1][4] = Double.toString(trucksArray[Integer.parseInt(trucksNum.substring(1,2))].getCost());
		dataHomeTrucks [1][5] = Double.toString(trucksArray[Integer.parseInt(trucksNum.substring(1,2))].getTrailerWeight());
		dataHomeTrucks [1][6] = Integer.toString(trucksArray[Integer.parseInt(trucksNum.substring(1,2))].getWheels());
		
		dataHomeTrucks [2][0] = trucksArray[Integer.parseInt(trucksNum.substring(2))].getMake();
		dataHomeTrucks [2][1] = trucksArray[Integer.parseInt(trucksNum.substring(2))].getModel();
		dataHomeTrucks [2][2] = Integer.toString(trucksArray[Integer.parseInt(trucksNum.substring(2))].getYear());
		dataHomeTrucks [2][3] = Float.toString(trucksArray[Integer.parseInt(trucksNum.substring(2))].getKmPerLitre());
		dataHomeTrucks [2][4] = Double.toString(trucksArray[Integer.parseInt(trucksNum.substring(2))].getCost());
		dataHomeTrucks [2][5] = Double.toString(trucksArray[Integer.parseInt(trucksNum.substring(2))].getTrailerWeight());
		dataHomeTrucks [2][6] = Integer.toString(trucksArray[Integer.parseInt(trucksNum.substring(2))].getWheels());
		
		//Motorcycles
		dataHomeMotorcycles [0][0] = motorcyclesArray[Integer.parseInt(motorcyclesNum.substring(0,1))].getMake();
		dataHomeMotorcycles [0][1] = motorcyclesArray[Integer.parseInt(motorcyclesNum.substring(0,1))].getModel();
		dataHomeMotorcycles [0][2] = Integer.toString(motorcyclesArray[Integer.parseInt(motorcyclesNum.substring(0,1))].getYear());
		dataHomeMotorcycles [0][3] = Float.toString(motorcyclesArray[Integer.parseInt(motorcyclesNum.substring(0,1))].getKmPerLitre());
		dataHomeMotorcycles [0][4] = Double.toString(motorcyclesArray[Integer.parseInt(motorcyclesNum.substring(0,1))].getCost());
		dataHomeMotorcycles [0][5] = motorcyclesArray[Integer.parseInt(motorcyclesNum.substring(0,1))].getConduction();
		dataHomeMotorcycles [0][6] = Integer.toString(motorcyclesArray[Integer.parseInt(motorcyclesNum.substring(0,1))].getSeatHeight());
		
		dataHomeMotorcycles [1][0] = motorcyclesArray[Integer.parseInt(motorcyclesNum.substring(1,2))].getMake();
		dataHomeMotorcycles [1][1] = motorcyclesArray[Integer.parseInt(motorcyclesNum.substring(1,2))].getModel();
		dataHomeMotorcycles [1][2] = Integer.toString(motorcyclesArray[Integer.parseInt(motorcyclesNum.substring(1,2))].getYear());
		dataHomeMotorcycles [1][3] = Float.toString(motorcyclesArray[Integer.parseInt(motorcyclesNum.substring(1,2))].getKmPerLitre());
		dataHomeMotorcycles [1][4] = Double.toString(motorcyclesArray[Integer.parseInt(motorcyclesNum.substring(1,2))].getCost());
		dataHomeMotorcycles [1][5] = motorcyclesArray[Integer.parseInt(motorcyclesNum.substring(1,2))].getConduction();
		dataHomeMotorcycles [1][6] = Integer.toString(motorcyclesArray[Integer.parseInt(motorcyclesNum.substring(1,2))].getSeatHeight());
		
		dataHomeMotorcycles [2][0] = motorcyclesArray[Integer.parseInt(motorcyclesNum.substring(2))].getMake();
		dataHomeMotorcycles [2][1] = motorcyclesArray[Integer.parseInt(motorcyclesNum.substring(2))].getModel();
		dataHomeMotorcycles [2][2] = Integer.toString(motorcyclesArray[Integer.parseInt(motorcyclesNum.substring(2))].getYear());
		dataHomeMotorcycles [2][3] = Float.toString(motorcyclesArray[Integer.parseInt(motorcyclesNum.substring(2))].getKmPerLitre());
		dataHomeMotorcycles [2][4] = Double.toString(motorcyclesArray[Integer.parseInt(motorcyclesNum.substring(2))].getCost());
		dataHomeMotorcycles [2][5] = motorcyclesArray[Integer.parseInt(motorcyclesNum.substring(2))].getConduction();
		dataHomeMotorcycles [2][6] = Integer.toString(motorcyclesArray[Integer.parseInt(motorcyclesNum.substring(2))].getSeatHeight());
		
	}
	
	
	
}
