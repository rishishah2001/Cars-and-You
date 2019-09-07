

package windows;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.CompoundBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import dataToBeShown.CartCheckout;
import dataToBeShown.HomepageRandomizer;
import dataToBeShown.ResultsOfSortingArrays;
import dataToBeShown.SortingCarsResults;
import dataToBeShown.TrackData;
import dataToBeShown.carReciept;
import dataToBeShown.motorcycleReciept;
import dataToBeShown.truckReciept;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Cart {
	//The variables
	private JFrame frameCart;
	private JTable tableCar;
	private JTable tableTruck;
	private JTable tableMotorcycle;
	
	//Initalize the window
	public static void initialize() {
		Cart window = new Cart();
		window.frameCart.setVisible(true);
	}

	//Constructor
	public Cart() {
		contents();
	}

	//Frame contents
	private void contents() {
		frameCart = new JFrame();
		frameCart.setBounds(200, 50, 1000, 750);
		frameCart.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameCart.getContentPane().setLayout(null);
		
		//Title
		JLabel labelTitle = new JLabel("Cart");
		labelTitle.setForeground(Color.DARK_GRAY);
		labelTitle.setFont(new Font("Futura", Font.BOLD, 35));
		labelTitle.setHorizontalAlignment(SwingConstants.CENTER);
		labelTitle.setBounds(6, 51, 988, 51);
		frameCart.getContentPane().add(labelTitle);
		
		
		//Subtitle
		JLabel labelSubtitle = new JLabel("One Step Closer to your dream ");
		labelSubtitle.setHorizontalAlignment(SwingConstants.CENTER);
		labelSubtitle.setForeground(Color.GRAY);
		labelSubtitle.setFont(new Font("Futura", Font.PLAIN, 14));
		labelSubtitle.setBounds(372, 106, 268, 16);
		frameCart.getContentPane().add(labelSubtitle);
		
		//Seperator
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.DARK_GRAY);
		separator.setBounds(370, 145, 258, 23);
		frameCart.getContentPane().add(separator);
		
		//Column names 
		String[] columnNamesCar = {"Make", "Model","Year","KM/Litre", "Cost ($)","Seats","Horse Power"}; 
		
		//Label of the selections
		JLabel labelSubHeading = new JLabel("Your Selections");
		labelSubHeading.setHorizontalAlignment(SwingConstants.CENTER);
		labelSubHeading.setForeground(Color.DARK_GRAY);
		labelSubHeading.setFont(new Font("Futura", Font.PLAIN, 25));
		labelSubHeading.setBounds(6, 155, 988, 34);
		frameCart.getContentPane().add(labelSubHeading);
		
		//JTable car
		tableCar = new JTable(CartCheckout.carsCheckoutArray , columnNamesCar);
		tableCar.setRowSelectionAllowed(false);
		tableCar.setShowVerticalLines(false);
		tableCar.setShowHorizontalLines(false);
		tableCar.setShowGrid(false);
		tableCar.setBorder(new CompoundBorder());
		tableCar.setPreferredScrollableViewportSize(new Dimension(950,100));
		tableCar.setFont(new Font("Futura", Font.PLAIN, 14));
	
		

			
		//Scroll pane
		JScrollPane scrollPaneCar = new JScrollPane(tableCar);
		
		scrollPaneCar.setSize(950, 80);
		scrollPaneCar.setLocation(26, 250);
		frameCart.getContentPane().add(scrollPaneCar);
		
		//COlumn names truck
		String[] columnNamesTruck = {"Make", "Model","Year","KM/Litre", "Cost ($)","Max Trailer Weight (KG)","Wheels"}; 
		
		//Table of the truck
		tableTruck = new JTable(CartCheckout.trucksCheckoutArray , columnNamesTruck);
		tableTruck.setRowSelectionAllowed(false);
		tableTruck.setShowVerticalLines(false);
		tableTruck.setShowHorizontalLines(false);
		tableTruck.setShowGrid(false);
		tableTruck.setBorder(new CompoundBorder());
		tableTruck.setPreferredScrollableViewportSize(new Dimension(950,100));
		tableTruck.setFont(new Font("Futura", Font.PLAIN, 14));
		
		//Table scroll pane truck
		JScrollPane scrollPaneTruck = new JScrollPane(tableTruck);
		scrollPaneTruck.setSize(950, 80);
		scrollPaneTruck.setLocation(26, 400);
		frameCart.getContentPane().add(scrollPaneTruck);
		
		//Column names motor cycles
		String[] columnNamesMotorcycle = {"Make", "Model","Year","KM/Litre", "Cost ($)","Engine Type","Seat Height (cm)"}; 
		
		//Table motorcycle
		tableMotorcycle = new JTable(CartCheckout.motorcyclesCheckoutArray , columnNamesMotorcycle);
		tableMotorcycle.setRowSelectionAllowed(false);
		tableMotorcycle.setShowVerticalLines(false);
		tableMotorcycle.setShowHorizontalLines(false);
		tableMotorcycle.setShowGrid(false);
		tableMotorcycle.setBorder(new CompoundBorder());
		tableMotorcycle.setPreferredScrollableViewportSize(new Dimension(950,100));
		tableMotorcycle.setFont(new Font("Futura", Font.PLAIN, 14));
		
		//Scroll pane motorcycle
		JScrollPane scrollPaneMotorcycle = new JScrollPane(tableMotorcycle);
		scrollPaneMotorcycle.setSize(950, 80);
		scrollPaneMotorcycle.setLocation(26, 550);
		frameCart.getContentPane().add(scrollPaneMotorcycle);
		
		//Car name
		JLabel labelCars = new JLabel("Cars");
		labelCars.setFont(new Font("Futura", Font.PLAIN, 20));
		labelCars.setVerticalAlignment(SwingConstants.BOTTOM);
		labelCars.setBounds(26, 201, 90, 37);
		frameCart.getContentPane().add(labelCars);
		
		
		//Truck name
		JLabel labelTrucks = new JLabel("Trucks");
		labelTrucks.setVerticalAlignment(SwingConstants.BOTTOM);
		labelTrucks.setFont(new Font("Futura", Font.PLAIN, 20));
		labelTrucks.setBounds(26, 351, 90, 37);
		frameCart.getContentPane().add(labelTrucks);
		
		//Motorcycle name
		JLabel labelMotorcycles = new JLabel("Motorcycles");
		labelMotorcycles.setVerticalAlignment(SwingConstants.BOTTOM);
		labelMotorcycles.setFont(new Font("Futura", Font.PLAIN, 20));
		labelMotorcycles.setBounds(26, 501, 124, 37);
		frameCart.getContentPane().add(labelMotorcycles);
		
		//Menu Bar
		JMenuBar menuBar = new JMenuBar();
		frameCart.setJMenuBar(menuBar);
		
		
		JMenuItem menuButtonHome = new JMenuItem("Home");
		menuButtonHome.addActionListener(new ActionListener() {;
		public void actionPerformed(ActionEvent e) {
			HomePage.initialize();
			frameCart.dispose();
		}
	});
		menuBar.add(menuButtonHome);
		JMenuItem menuButtonSort = new JMenuItem("Sort Cars      ");
		menuButtonSort.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SortCars.initialize();
				frameCart.dispose();
			}
		});
		menuBar.add(menuButtonSort);
		
		JMenuItem menuButtonTrackTimes = new JMenuItem("Track Times");
		menuButtonTrackTimes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TrackData.begin();
				TrackTimes.initialize();
				frameCart.dispose();
			}
		});
		menuBar.add(menuButtonTrackTimes);
		
		JMenuItem menuButtonCart = new JMenuItem("My Cart");
		menuButtonCart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CartCheckout.output();
				frameCart.dispose();
			}
		});
		menuBar.add(menuButtonCart);
		
		JMenuItem menuButtonLogOut = new JMenuItem("Log Out");
		menuButtonLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login.initialize();
				frameCart.dispose();
				
			}
		});
		menuBar.add(menuButtonLogOut);
		
		//Check out button
		JButton buttonCheckOut = new JButton("Check Out");
		buttonCheckOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Calculate the cost before and after taxc
				carReciept r = new carReciept();
				r.costPreTax();
				r.costAfterTax();
				truckReciept rt = new truckReciept();
				rt.costPreTax();
				rt.costAfterTax();
				motorcycleReciept rm = new motorcycleReciept();
				rm.costPreTax();
				rm.costAfterTax();
				CheckOut.initalize();
				
				
			}
		});
		buttonCheckOut.setBounds(400 ,660, 150, 30);
		frameCart.getContentPane().add(buttonCheckOut);
	}
	
}