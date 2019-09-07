

package automobiles;

import java.io.Serializable;

//Vehicles calss
public abstract class Vehicles implements Serializable{

	//Serial version UID for safety
	private static final long serialVersionUID = 1649741819809483069L;

	
	//Variables for all aspects of vehicles
	public String make;
	
	public String model;
	
	public int year;
	
	public float kmPerLitre;
	
	public double cost;
	
	//Vehicles constructor
	public Vehicles (String make , String model , int year , float kmPerLitre , double cost) {
		this.make = make;
		this.model = model; 
		this.year = year;
		this.kmPerLitre = kmPerLitre;
		this.cost = cost;
		
	}

	//Getters and setters
	public String getMake() {
		return make;
	}


	public void setMake(String make) {
		this.make = make;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public float getKmPerLitre() {
		return kmPerLitre;
	}


	public void setKmPerLitre(float kmPerLitre) {
		this.kmPerLitre = kmPerLitre;
	}


	public double getCost() {
		return cost;
	}


	public void setCost(double cost) {
		this.cost = cost;
	}
	
	
	
	
	
}
