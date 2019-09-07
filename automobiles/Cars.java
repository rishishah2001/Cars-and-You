
package automobiles;

import java.io.Serializable;
//Car object
public class Cars extends Vehicles implements Serializable{
	
	
	//Serial version UID for protection
	private static final long serialVersionUID = 1649741819809483069L;

	//Variables for seats and horsepower
	public int seats;
	public int horsePower;

	//Constructor 
	public Cars(String make, String model, int year, float kmPerLitre, double cost , int seats , int horsePower) {
		super(make, model, year, kmPerLitre, cost);
		this.seats = seats;
		this.horsePower = horsePower;
	}
	
	//Getters and setters below
	
	
	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public int getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}
		
}
