



package dataToBeShown;

import java.text.NumberFormat;
import java.util.Locale;

public class motorcycleReciept extends vehiclePurchase{

	//Variables for total motorcyles purchased 
	public static byte motorcyclesPurchased=0;
	
	public static double price=0;
	
	//Begin class
	public void begin() {
		costPreTax();
		costAfterTax();
	}
	
	//Calculate the cost pretax
	public String costPreTax() {
		motorcyclesPurchased=0;
		price =0;
		//Adding the price of all the motorcycles and counting the number of motorcyles purchased
		for (int row=0;row<CartCheckout.motorcyclesCheckout.size();row++) {
			price = price + CartCheckout.motorcyclesCheckout.get(row).getCost();	
			motorcyclesPurchased++;
		} 
		//Using currency format
		Locale locale = new Locale("en", "US");      
		NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
		return currencyFormatter.format(price);	
	}

	//Cost after tax
	public String costAfterTax() {
		price = price*1.13;
		Locale locale = new Locale("en", "US");    
		////Using currency format
		NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
		return currencyFormatter.format(price);
	}

}
