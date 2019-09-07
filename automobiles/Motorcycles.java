

package automobiles;

import java.io.Serializable;
//Motorcycles class
public class Motorcycles extends Vehicles implements Serializable {
	
	private static final long serialVersionUID = 1649741819809483069L;
	
	
	//Variables for conduction and seat height
	public String conduction;
	
	public int seatHeight;

	//Motorcycle constructors 
	public Motorcycles(String make, String model, int year, float kmPerLitre, double cost , String conduction , int seatHeight) {
		super(make, model, year, kmPerLitre, cost);
		this.conduction = conduction;
		this.seatHeight = seatHeight;
		
	}
	//Getters and setters
	public String getConduction() {
		return conduction;
	}

	public void setConduction(String conduction) {
		this.conduction = conduction;
	}

	public int getSeatHeight() {
		return seatHeight;
	}

	public void setSeatHeight(int seatHeight) {
		this.seatHeight = seatHeight;
	}

}
