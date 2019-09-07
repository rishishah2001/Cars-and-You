
package automobiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class AutomobileData {
	
	//Where the objects of the automobiles are stored
	public String filePathCars = "/Users/rishishah/Desktop/School/Computer Science/Rishi Shah Eclipse Workspace/ISU v3.0/src/resources/cars.txt";
	public String filePathTrucks = "/Users/rishishah/Desktop/School/Computer Science/Rishi Shah Eclipse Workspace/ISU v3.0/src/resources/trucks.txt";
	public String filePathMotorcycles = "/Users/rishishah/Desktop/School/Computer Science/Rishi Shah Eclipse Workspace/ISU v3.0/src/resources/motorcycles.txt";
	
	//The array to be outputted on the homescreen
	public static String[][] dataHomeCars = new String[3][7];
	public static String[][] dataHomeTrucks = new String[3][7];
	public static String[][] dataHomeMotorcycles = new String[3][7];
	
	//Object arrays for the types of vehicles
	public static Cars[] carsArray = new Cars[10];
	public static Trucks[] trucksArray = new Trucks[10];
	public static Motorcycles[] motorcyclesArray = new Motorcycles[10];
	
	
	//Writing the objects to the files
	public static void dataWriting() {
		
		AutomobileData auto = new AutomobileData();
		//Creating Car objects
		Vehicles c1 = new Cars("Honda" , "Accord" , 2017, 10.4F , 23234.98 , 5 , 465);
		Vehicles c2 = new Cars("Toyota" , "Corolla" , 2003 , 9.2F , 11532.40 , 5 , 321);
		Vehicles c3 = new Cars("Acura" , "MDX" , 2018 , 8.43F , 45345.75 , 6 , 534);
		Vehicles c4 = new Cars("Nissan" , "Sentra" , 2019 , 10.45F , 20456.23 , 5 , 401);
		Vehicles c5 = new Cars("Ford" , "Transit" , 2008 , 6.932F , 19234.34 , 7 , 356);
		Vehicles c6 = new Cars("Lexus" , "RX350" , 2001 , 7.234F , 17342.12 , 5 , 324);
		Vehicles c7 = new Cars("Honda", "Oddessy" , 2014 , 6.235F , 22421.03 , 8 , 503);
		Vehicles c8 = new Cars("Toyota", "Camry" , 1999 , 6.489F , 8500.01 , 5 , 352);
		Vehicles c9 = new Cars("Mazda", "CX-5" , 2016 , 8.011F , 17561.06 , 5 , 456);
		Vehicles c10 = new Cars("VW", "Jetta" , 2002 , 7.493F , 9203.34 , 5 , 299);
		
		//Creating Truck objects
		Vehicles t1 = new Trucks("Chevy", "Truckster", 2012 , 4.34F ,  50345.45 , 13453.23 ,18);
		Vehicles t2 = new Trucks("Ford", "Hauler", 2017 , 5.234F ,  61239.43 , 18453.23 ,18);
		Vehicles t3 = new Trucks("Nissan", "Carrier", 2003 , 3.8993F ,  34313.75 , 10324.34 ,16);
		Vehicles t4 = new Trucks("Honda", "Deliver", 2008 , 4.24F ,  44242.34 , 15674.23 ,12);
		Vehicles t5 = new Trucks("Kawasaki", "Transporter", 2018 , 5.034F ,  75367.67 , 23564.45 ,20);
		Vehicles t6 = new Trucks("Dodge", "C-4", 2014 , 4.904F ,  202335.45 , 10435.23 ,8);
		Vehicles t7 = new Trucks("Truckers", "A124", 2006 , 5.240F ,  43567.43 , 18903.23 ,16);
		Vehicles t8 = new Trucks("Nissan", "F-4230", 2010 ,4.114F ,  40345.65 , 16324.34 ,18);
		Vehicles t9 = new Trucks("Honda", "H-1", 1998 , 3.012F ,  15632.34 , 9674.23 ,10);
		Vehicles t10 = new Trucks("Mitusbishi", "M-8", 2011 , 4.995F ,  23567.05 , 25102.45 , 14);
				
		//Creating motorcycle objects
		Vehicles m1 = new Motorcycles ("Honda", "Explorer", 2004 ,12.43F , 9004.23 , "Type C" , 23 );
		Vehicles m2 = new Motorcycles ("Toyota", "Vroomer", 2012 ,13.43F , 12354.76 , "Type C" , 12 );
		Vehicles m3 = new Motorcycles ("Kawasaki", "Infinity", 2008 ,12.91F , 11424.82 , "Type B" , 34 );
		Vehicles m4 = new Motorcycles ("Davidson", "M-3", 1999 ,8.34F , 5124.98 , "Type B" , 9 );
		Vehicles m5 = new Motorcycles ("Yamaha", "Z-11", 2019 ,15.21F , 17431.31 , "Type C" , 11 );
		Vehicles m6 = new Motorcycles ("Lexus", "L-12", 2012 ,13.43F , 15004.23 , "Type A" , 7);
		Vehicles m7 = new Motorcycles ("Kawasaki", "K-10", 2010 ,11.02F , 10001.76 , "Type A" , 16 );
		Vehicles m8 = new Motorcycles ("Ford", "F*", 2018 ,15.91F , 19234.82 , "Type C" , 11 );
		Vehicles m9 = new Motorcycles ("Davidson", "H-1", 1970 ,6.34F , 15134.98 , "Type B" , 9 );
		Vehicles m10 = new Motorcycles ("Mazda", "M-2", 2002 ,10.33F , 6561.31 , "Type A" , 45 );
		
		
		//Adding the objects to the files
		auto.writeToFileCars(c1, c2, c3, c4, c5,c6,c7,c8,c9,c10);
		auto.writeToFileTrucks(t1,t2,t3,t4,t5,t6,t7,t8,t9,t10);
		auto.writeToFileMotorcycles(m1,m2,m3,m4,m5,m6,m7,m8,m9,m10);
	}
	
		
	//Write to files car objects
	public void writeToFileCars(Vehicles c1, Vehicles c2,Vehicles c3,Vehicles c4,Vehicles c5,Vehicles c6,Vehicles c7,Vehicles c8,Vehicles c9,Vehicles c10) {
		FileOutputStream fileWriteCars;
		try {
			fileWriteCars = new FileOutputStream(filePathCars);
			ObjectOutputStream objectOut = new ObjectOutputStream(fileWriteCars);
			//Writing each of the objects to the file
	        objectOut.writeObject(c1);
	        objectOut.writeObject(c2);
	        objectOut.writeObject(c3);
	        objectOut.writeObject(c4);
	        objectOut.writeObject(c5);
	        objectOut.writeObject(c6);
	        objectOut.writeObject(c7);
	        objectOut.writeObject(c8);
	        objectOut.writeObject(c9);
	        objectOut.writeObject(c10);
		} catch (IOException e) { e.printStackTrace(); }
	}
	
	//Write to files trick objects
	public void writeToFileTrucks(Vehicles t1,Vehicles t2,Vehicles t3,Vehicles t4,Vehicles t5,Vehicles t6,Vehicles t7,Vehicles t8,Vehicles t9,Vehicles t10) {
		 FileOutputStream fileWriteTrucks;
		try {
			fileWriteTrucks = new FileOutputStream(filePathTrucks);
			ObjectOutputStream objectOut = new ObjectOutputStream(fileWriteTrucks);
	        objectOut.writeObject(t1);
	        //Writing the truck objects to the files
	        objectOut.writeObject(t2);
	        objectOut.writeObject(t3);
	        objectOut.writeObject(t4);
	        objectOut.writeObject(t5);
	        objectOut.writeObject(t6);
	        objectOut.writeObject(t7);
	        objectOut.writeObject(t8);
	        objectOut.writeObject(t9);
	        objectOut.writeObject(t10);
		} catch (IOException e) { e.printStackTrace(); }  
	}
	//Write motorcycle objects to file
	public void writeToFileMotorcycles(Vehicles m1,Vehicles m2,Vehicles m3,Vehicles m4,Vehicles m5,Vehicles m6,Vehicles m7,Vehicles m8,Vehicles m9,Vehicles m10) {
		 FileOutputStream fileWriteMotorcycles;
		try {
			fileWriteMotorcycles = new FileOutputStream(filePathMotorcycles);
			ObjectOutputStream objectOut = new ObjectOutputStream(fileWriteMotorcycles);
			//Adding each of the nmotorcylce objects to the file
	        objectOut.writeObject(m1);
	        objectOut.writeObject(m2);
	        objectOut.writeObject(m3);
	        objectOut.writeObject(m4);
	        objectOut.writeObject(m5);
	        objectOut.writeObject(m6);
	        objectOut.writeObject(m7);
	        objectOut.writeObject(m8);
	        objectOut.writeObject(m9);
	        objectOut.writeObject(m10);
		} catch (IOException e) { e.printStackTrace(); }  
	}
	
	
	
	//Read from file for the cars objects
	public void readFromFileCars() {
		try {
	        FileInputStream fileInputCars = new FileInputStream(filePathCars);
	        ObjectInputStream objectInputCars = new ObjectInputStream(fileInputCars);
	        //Adding each of the 10 objects to the cars array
	        for (int i = 0 ; i<10 ; i++) {
	        	carsArray[i]= (Cars) objectInputCars.readObject();
	        }
    	 } catch (Exception ex) { ex.printStackTrace(); }
	}
	
	//Read from file for the trucks objects
	public void readFromFileTrucks() {
		try {
	        FileInputStream fileInputTrucks = new FileInputStream(filePathTrucks);
	        ObjectInputStream objectInputTrucks = new ObjectInputStream(fileInputTrucks);
	        //Adding each of the 10 objects to the trucks array
	    	for (int x = 0 ; x<10 ; x++) {
	    		trucksArray[x] = (Trucks)objectInputTrucks.readObject();
	    	}
    	 } catch (Exception ex) { ex.printStackTrace(); }
	}
	
	//Read from file for the motorcycle objects
	public void readFromFileMotorcycles() {
		try {
	        FileInputStream fileInputMotorcycles = new FileInputStream(filePathMotorcycles);
	        ObjectInputStream objectInputMotorcycles = new ObjectInputStream(fileInputMotorcycles);
	        //Adding each of the 10 objects to the motorcycles array
	    	for (int z = 0 ;z<10 ; z++) {
	    		motorcyclesArray[z] = (Motorcycles)objectInputMotorcycles.readObject();
	    	}
    	 } catch (Exception ex) { ex.printStackTrace(); }
	}
	
	
	
	
	
	
	
	
	

	
}