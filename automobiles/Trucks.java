
package automobiles;

import java.io.Serializable;

public class Trucks extends Vehicles implements Serializable{
	
	//Serial version UID for security
	private static final long serialVersionUID = 1649741819809483069L;

	
	//Variables for trailer weight and wheels
	public double trailerWeight; 
	
	public int wheels;

	//Constructor for trucks
	public Trucks(String make, String model, int year, float kmPerLitre, double cost , double trailerWeight , int wheels) {
		super(make, model, year, kmPerLitre, cost);
		this.trailerWeight = trailerWeight;
		this.wheels = wheels;
	}

	
	//Getters and setters
	public double getTrailerWeight() {
		return trailerWeight;
	}

	public void setTrailerWeight(double trailerWeight) {
		this.trailerWeight = trailerWeight;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

}
