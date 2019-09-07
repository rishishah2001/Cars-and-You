


package dataToBeShown;

import java.text.NumberFormat;
import java.util.Locale;

public class truckReciept extends vehiclePurchase{
	//Variables for the trucks purchased
	public static byte trucksPurchased;
	//Price variable
	public static double price=0;
	
	//Program 
	public void begin() {
		costPreTax();
		costAfterTax();
	}
	
	//Cost before tax
	public String costPreTax() {
		trucksPurchased=0;
		price =0;
		//Adding up cost
		for (int row=0;row<CartCheckout.trucksCheckout.size();row++) {
			price = price + CartCheckout.trucksCheckout.get(row).getCost();	
			trucksPurchased++;
		} 
		//Using currency format
		Locale locale = new Locale("en", "US");      
		NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
		return currencyFormatter.format(price);	
	}

	//Cost after tax
	public String costAfterTax() {
		price = price*1.13;
		//Using cuurency format
		Locale locale = new Locale("en", "US");      
		NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
		return currencyFormatter.format(price);
	}

}
