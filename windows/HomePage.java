package windows;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.SwingConstants;
import java.awt.Font;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.TextArea;
import java.awt.List;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;

import automobiles.AutomobileData;
import dataToBeShown.CartCheckout;
import dataToBeShown.HomepageRandomizer;
import dataToBeShown.TrackData;

import javax.swing.border.CompoundBorder;
import javax.swing.JSeparator;

public class HomePage extends AutomobileData {

	private JFrame frameHomePage;
	private JTable tableCar;
	private JTable tableTruck;
	private JTable tableMotorcycle;

	public static void initialize() {
		
		HomePage window = new HomePage();
		window.frameHomePage.setVisible(true);
	}
	
	public HomePage() {
		contents();
	}

	
	private void contents() {
		frameHomePage = new JFrame();
		frameHomePage.setBounds(200, 50, 1000, 750);
		frameHomePage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameHomePage.getContentPane().setLayout(null);
		
		JLabel labelTitle = new JLabel("Cars & You");
		labelTitle.setForeground(Color.DARK_GRAY);
		labelTitle.setFont(new Font("Futura", Font.BOLD, 35));
		labelTitle.setHorizontalAlignment(SwingConstants.CENTER);
		labelTitle.setBounds(6, 51, 988, 51);
		frameHomePage.getContentPane().add(labelTitle);
		
		JLabel labelSubtitle = new JLabel("The best place to buy a");
		labelSubtitle.setForeground(Color.GRAY);
		labelSubtitle.setFont(new Font("Futura", Font.PLAIN, 14));
		labelSubtitle.setBounds(412, 106, 155, 16);
		frameHomePage.getContentPane().add(labelSubtitle);
		
		JLabel imageCar = new JLabel("");
		imageCar.setIcon(new ImageIcon(HomePage.class.getResource("/resources/car.png")));
		imageCar.setBounds(568, 104, 32, 23);
		frameHomePage.getContentPane().add(imageCar);
		
		
		
		String[] columnNamesCar = {"Make", "Model","Year","KM/Litre", "Cost ($)","Seats","Horse Power"}; 
		
		JLabel labelSubHeading = new JLabel("Vehicles for You");
		labelSubHeading.setHorizontalAlignment(SwingConstants.CENTER);
		labelSubHeading.setForeground(Color.DARK_GRAY);
		labelSubHeading.setFont(new Font("Futura", Font.PLAIN, 25));
		labelSubHeading.setBounds(6, 155, 988, 34);
		frameHomePage.getContentPane().add(labelSubHeading);
		
		tableCar = new JTable(dataHomeCars , columnNamesCar);
		tableCar.setRowSelectionAllowed(false);
		tableCar.setShowVerticalLines(false);
		tableCar.setShowHorizontalLines(false);
		tableCar.setShowGrid(false);
		tableCar.setBorder(new CompoundBorder());
		tableCar.setPreferredScrollableViewportSize(new Dimension(950,100));
		tableCar.setFont(new Font("Futura", Font.PLAIN, 14));
		tableCar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (tableCar.getSelectedRow() == 0 ) {
					if ( JOptionPane.showConfirmDialog(frameHomePage.getContentPane(), "Are You Sure you wish to add this to the cart?","Cart Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null) == JOptionPane.YES_OPTION) {
						System.out.println("Yes");
						CartCheckout.carsCheckout.add(carsArray[Integer.parseInt(HomepageRandomizer.carsNum.substring(0,1))]);
					}
				}
				else if (tableCar.getSelectedRow() == 1 ) {
					if (JOptionPane.showConfirmDialog(frameHomePage.getContentPane(), "Are You Sure you wish to add this to the cart?","Cart Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null) == JOptionPane.YES_OPTION) {
						System.out.println("Yes");
						CartCheckout.carsCheckout.add(carsArray[Integer.parseInt(HomepageRandomizer.carsNum.substring(1,2))]);
					}
				}
				else if (tableCar.getSelectedRow() == 2 ) {
					if (JOptionPane.showConfirmDialog(frameHomePage.getContentPane(), "Are You Sure you wish to add this to the cart?","Cart Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null) == JOptionPane.YES_OPTION) {
						System.out.println("Yes");
						CartCheckout.carsCheckout.add(carsArray[Integer.parseInt(HomepageRandomizer.carsNum.substring(2))]);
					}
				}
			}
		});
		
		JScrollPane scrollPaneCar = new JScrollPane(tableCar);
		scrollPaneCar.setSize(950, 80);
		scrollPaneCar.setLocation(26, 250);
		frameHomePage.getContentPane().add(scrollPaneCar);
		
		
		String[] columnNamesTruck = {"Make", "Model","Year","KM/Litre", "Cost ($)","Max Trailer Weight (KG)","Wheels"}; 
		
		tableTruck = new JTable(dataHomeTrucks , columnNamesTruck);
		tableTruck.setRowSelectionAllowed(false);
		tableTruck.setShowVerticalLines(false);
		tableTruck.setShowHorizontalLines(false);
		tableTruck.setShowGrid(false);
		tableTruck.setBorder(new CompoundBorder());
		tableTruck.setPreferredScrollableViewportSize(new Dimension(950,100));
		tableTruck.setFont(new Font("Futura", Font.PLAIN, 14));
		tableTruck.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (tableTruck.getSelectedRow() == 0 ) {
					if ( JOptionPane.showConfirmDialog(frameHomePage.getContentPane(), "Are You Sure you wish to add this to the cart?","Cart Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null) == JOptionPane.YES_OPTION) {
						System.out.println("Yes");
						CartCheckout.trucksCheckout.add(trucksArray[Integer.parseInt(HomepageRandomizer.trucksNum.substring(0,1))]);
					}
				}
				else if (tableTruck.getSelectedRow() == 1 ) {
					if (JOptionPane.showConfirmDialog(frameHomePage.getContentPane(), "Are You Sure you wish to add this to the cart?","Cart Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null) == JOptionPane.YES_OPTION) {
						System.out.println("Yes");
						CartCheckout.trucksCheckout.add(trucksArray[Integer.parseInt(HomepageRandomizer.trucksNum.substring(1,2))]);
					}
				}
				else if (tableTruck.getSelectedRow() == 2 ) {
					if (JOptionPane.showConfirmDialog(frameHomePage.getContentPane(), "Are You Sure you wish to add this to the cart?","Cart Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null) == JOptionPane.YES_OPTION) {
						System.out.println("Yes");
						CartCheckout.trucksCheckout.add(trucksArray[Integer.parseInt(HomepageRandomizer.trucksNum.substring(2))]);
					}
				}
			}
		});
		
		JScrollPane scrollPaneTruck = new JScrollPane(tableTruck);
		scrollPaneTruck.setSize(950, 80);
		scrollPaneTruck.setLocation(26, 400);
		frameHomePage.getContentPane().add(scrollPaneTruck);
		
		
		String[] columnNamesMotorcycle = {"Make", "Model","Year","KM/Litre", "Cost ($)","Engine Type","Seat Height (cm)"}; 
		
		tableMotorcycle = new JTable(dataHomeMotorcycles , columnNamesMotorcycle);
		tableMotorcycle.setRowSelectionAllowed(false);
		tableMotorcycle.setShowVerticalLines(false);
		tableMotorcycle.setShowHorizontalLines(false);
		tableMotorcycle.setShowGrid(false);
		tableMotorcycle.setBorder(new CompoundBorder());
		tableMotorcycle.setPreferredScrollableViewportSize(new Dimension(950,100));
		tableMotorcycle.setFont(new Font("Futura", Font.PLAIN, 14));
		tableMotorcycle.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (tableMotorcycle.getSelectedRow() == 0 ) {
					if ( JOptionPane.showConfirmDialog(frameHomePage.getContentPane(), "Are You Sure you wish to add this to the cart?","Cart Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null) == JOptionPane.YES_OPTION) {
						System.out.println("Yes");
						CartCheckout.motorcyclesCheckout.add(motorcyclesArray[Integer.parseInt(HomepageRandomizer.motorcyclesNum.substring(0,1))]);
					}
				}
				else if (tableMotorcycle.getSelectedRow() == 1 ) {
					if (JOptionPane.showConfirmDialog(frameHomePage.getContentPane(), "Are You Sure you wish to add this to the cart?","Cart Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null) == JOptionPane.YES_OPTION) {
						System.out.println("Yes");
						CartCheckout.motorcyclesCheckout.add(motorcyclesArray[Integer.parseInt(HomepageRandomizer.motorcyclesNum.substring(1,2))]);
					}
				}
				else if (tableMotorcycle.getSelectedRow() == 2 ) {
					if (JOptionPane.showConfirmDialog(frameHomePage.getContentPane(), "Are You Sure you wish to add this to the cart?","Cart Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null) == JOptionPane.YES_OPTION) {
						System.out.println("Yes");
						CartCheckout.motorcyclesCheckout.add(motorcyclesArray[Integer.parseInt(HomepageRandomizer.motorcyclesNum.substring(2))]);
					}
				}
			}
		});
		
		JScrollPane scrollPaneMotorcycle = new JScrollPane(tableMotorcycle);
		scrollPaneMotorcycle.setSize(950, 80);
		scrollPaneMotorcycle.setLocation(26, 550);
		frameHomePage.getContentPane().add(scrollPaneMotorcycle);
		
		
	
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.DARK_GRAY);
		separator.setBounds(370, 145, 258, 23);
		frameHomePage.getContentPane().add(separator);
		
		JLabel labelCars = new JLabel("Cars");
		labelCars.setFont(new Font("Futura", Font.PLAIN, 20));
		labelCars.setVerticalAlignment(SwingConstants.BOTTOM);
		labelCars.setBounds(26, 201, 90, 37);
		frameHomePage.getContentPane().add(labelCars);
		
		JLabel labelTrucks = new JLabel("Trucks");
		labelTrucks.setVerticalAlignment(SwingConstants.BOTTOM);
		labelTrucks.setFont(new Font("Futura", Font.PLAIN, 20));
		labelTrucks.setBounds(26, 351, 90, 37);
		frameHomePage.getContentPane().add(labelTrucks);
		
		JLabel labelMotorcycles = new JLabel("Motorcycles");
		labelMotorcycles.setVerticalAlignment(SwingConstants.BOTTOM);
		labelMotorcycles.setFont(new Font("Futura", Font.PLAIN, 20));
		labelMotorcycles.setBounds(26, 501, 124, 37);
		frameHomePage.getContentPane().add(labelMotorcycles);
		
	
		JMenuBar menuBar = new JMenuBar();
		frameHomePage.setJMenuBar(menuBar);
		
		JMenuItem menuButtonHome = new JMenuItem("Home");
		menuBar.add(menuButtonHome);
		
		JMenuItem menuButtonSort = new JMenuItem("Sort Cars      ");
		menuButtonSort.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SortCars.initialize();
				frameHomePage.dispose();
			}
		});
		menuBar.add(menuButtonSort);
		
		JMenuItem menuButtonTrackTimes = new JMenuItem("Track Times");
		menuButtonTrackTimes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TrackData.begin();
				
				TrackTimes.initialize();
				frameHomePage.dispose();
			}
		});
		menuBar.add(menuButtonTrackTimes);
		
		JMenuItem menuButtonCart = new JMenuItem("My Cart");
		menuButtonCart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CartCheckout.output();
			
				frameHomePage.dispose();
			}
		});
		menuBar.add(menuButtonCart);
		
		JMenuItem menuButtonLogOut = new JMenuItem("Log Out");
		menuButtonLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login.initialize();
				frameHomePage.dispose();
				
			}
		});
		menuBar.add(menuButtonLogOut);
		
	

	}
}
