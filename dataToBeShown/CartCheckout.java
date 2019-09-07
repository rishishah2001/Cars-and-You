

package dataToBeShown;

import java.util.ArrayList;

import automobiles.AutomobileData;
import automobiles.Cars;
import automobiles.Motorcycles;
import automobiles.Trucks;
import automobiles.Vehicles;
import windows.Cart;
import windows.HomePage;

public class CartCheckout  {
	//Creating the arraylists
	public static ArrayList<Cars> carsCheckout = new ArrayList<Cars>();
	public static ArrayList<Trucks> trucksCheckout = new ArrayList<Trucks>();
	public static ArrayList<Motorcycles> motorcyclesCheckout = new ArrayList<Motorcycles>();
	
	//Creating the arrays in basic form 
	public static String[][]carsCheckoutArray= new String[1][1];
	public static String[][]trucksCheckoutArray= new String[1][1];
	public static String[][]motorcyclesCheckoutArray= new String[1][1];

	//Starting the program
	public static void output() {
		//Starting the specific methods to calculate each of the types of vehicles
		carsCart();
		trucksCart();
		motorcyclesCart();
		//Initalize the JFrame
		Cart.initialize();
	}
	//Calculate the cars in the checkout 
	public static void carsCart() {
		//If there is nothing in the cart
		if (carsCheckout.size() ==0) {
			carsCheckoutArray = new String[2][7];
			for (int row = 0 ; row<2;row++) {
				for (int column = 0; column<7;column++) {
					carsCheckoutArray[row][column]="";
				}
			}
		}
		//If there is something in the cart
		else {
			
			carsCheckoutArray = new String[carsCheckout.size()][7];
			//For each row of the array
			for (int row=0;row<carsCheckout.size();row++) {
				//For each column of the array
				for (int column=0;column<7;column++) {
					//Adding the respective information in each of the corresponding columns
					if (column ==0) {carsCheckoutArray[row][column] =carsCheckout.get(row).getMake();}
					else if (column == 1) {carsCheckoutArray[row][column] = carsCheckout.get(row).getModel();}
					else if (column == 2) {carsCheckoutArray[row][column] = Integer.toString(carsCheckout.get(row).getYear());}
					else if (column == 3) {carsCheckoutArray[row][column] = Float.toString(carsCheckout.get(row).getKmPerLitre());}
					else if (column == 4) {carsCheckoutArray[row][column] = Double.toString(carsCheckout.get(row).getCost());}
					else if (column == 5) {carsCheckoutArray[row][column] = Integer.toString(carsCheckout.get(row).getSeats());}
					else if (column == 6) {carsCheckoutArray[row][column] = Integer.toString(carsCheckout.get(row).getHorsePower());}
				}
			}
		}
	}
	
	
	
	
	//Cart for trucks
	public static void trucksCart() {
		//If no trucks are selected
		if (trucksCheckout.size() ==0) {
			trucksCheckoutArray = new String[2][7];
			for (int row = 0 ; row<2;row++) {
				for (int column = 0; column<7;column++) {
					trucksCheckoutArray[row][column]="";
				}
			}
		}
		//If there are trucks that are in the cart
		else {
			trucksCheckoutArray = new String[trucksCheckout.size()][7];
			//For each row of the array
			for (int row=0;row<trucksCheckout.size();row++) {
				//For each column in the array
				for (int column=0;column<7;column++) {
					//Adding the correct infromation to the right array
					if (column ==0) {trucksCheckoutArray[row][column] = trucksCheckout.get(row).getMake();}
					else if (column == 1) {trucksCheckoutArray[row][column] = trucksCheckout.get(row).getModel();}
					else if (column == 2) {trucksCheckoutArray[row][column] = Integer.toString(trucksCheckout.get(row).getYear());}
					else if (column == 3) {trucksCheckoutArray[row][column] = Float.toString(trucksCheckout.get(row).getKmPerLitre());}
					else if (column == 4) {trucksCheckoutArray[row][column] = Double.toString(trucksCheckout.get(row).getCost());}
					else if (column == 5) {trucksCheckoutArray[row][column] = Double.toString(trucksCheckout.get(row).getTrailerWeight());}
					else if (column == 6) {trucksCheckoutArray[row][column] = Integer.toString(trucksCheckout.get(row).getWheels());}
				}
			}
		}
	}
	//Motorcycle cart
	public static void motorcyclesCart() {
		//If there is no motor cycles selected
		if (motorcyclesCheckout.size() ==0) {
			motorcyclesCheckoutArray = new String[2][7];
			for (int row = 0 ; row<2;row++) {
				for (int column = 0; column<7;column++) {
					motorcyclesCheckoutArray[row][column]="";
				}
			}
		}
		//If there is motor cycles selected
		else {
			
			motorcyclesCheckoutArray = new String[motorcyclesCheckout.size()][7];
			//For each motorcycle
			for (int row=0;row<motorcyclesCheckout.size();row++) {
				//For each catagory of the motorcycle
				for (int column=0;column<7;column++) {

					if (column ==0) {motorcyclesCheckoutArray[row][column] =motorcyclesCheckout.get(row).getMake();}
					else if (column == 1) {motorcyclesCheckoutArray[row][column] = motorcyclesCheckout.get(row).getModel();}
					else if (column == 2) {motorcyclesCheckoutArray[row][column] = Integer.toString(motorcyclesCheckout.get(row).getYear());}
					else if (column == 3) {motorcyclesCheckoutArray[row][column] = Float.toString(motorcyclesCheckout.get(row).getKmPerLitre());}
					else if (column == 4) {motorcyclesCheckoutArray[row][column] = Double.toString(motorcyclesCheckout.get(row).getCost());}
					else if (column == 5) {motorcyclesCheckoutArray[row][column] = motorcyclesCheckout.get(row).getConduction();}
					else if (column == 6) {motorcyclesCheckoutArray[row][column] = Integer.toString(motorcyclesCheckout.get(row).getSeatHeight());}
				}
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
