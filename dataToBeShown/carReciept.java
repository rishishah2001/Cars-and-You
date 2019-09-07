
package dataToBeShown;

import java.text.NumberFormat;
import java.util.Locale;


public class carReciept extends vehiclePurchase{

	//Establishing variablea
	public static byte carsPurchased=0;
	public static double price=0;
	public static String cost;
	public static String costTax;
	
	//Finding the cost pre-tax
	public String costPreTax() {
		//Establishing the variables for finding the cost pretax
		carsPurchased=0;
		price =0;
		//For loop to add the prices together and adding the cars purchased
		for (int row=0;row<CartCheckout.carsCheckout.size();row++) {
			price = price + CartCheckout.carsCheckout.get(row).getCost();
			carsPurchased++;
		} 
		//Using number format for price
		Locale locale = new Locale("en", "US");      
		NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
		return currencyFormatter.format(price);	
	}
	//Finding the cost after tax
	public String costAfterTax() {
		price = price*1.13;
		//Using number format for total cost 
		Locale locale = new Locale("en", "US");      
		NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
		return currencyFormatter.format(price);
	}

}
