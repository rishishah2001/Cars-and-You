package windows;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.CompoundBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import automobiles.AutomobileData;
import dataToBeShown.CartCheckout;
import dataToBeShown.HomepageRandomizer;
import dataToBeShown.ResultsOfSortingArrays;
import dataToBeShown.SortingCarsResults;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ResultsOfSorting extends SortingCarsResults{

	private JFrame frameResults;
	
	private JTable tableCar;
	private JTable tableTruck;
	private JTable tableMotorcycle;
	

	public static void initialize() {
		ResultsOfSorting window = new ResultsOfSorting();
		window.frameResults.setVisible(true);
	}


	public ResultsOfSorting() {
		contents();
	}


	private void contents() {
		frameResults = new JFrame();
		frameResults.setBounds(200, 50, 1000, 750);
		frameResults.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameResults.getContentPane().setLayout(null);
		
		JLabel labelTitle = new JLabel("Vehicle Results");
		labelTitle.setForeground(Color.DARK_GRAY);
		labelTitle.setFont(new Font("Futura", Font.BOLD, 35));
		labelTitle.setHorizontalAlignment(SwingConstants.CENTER);
		labelTitle.setBounds(6, 51, 988, 51);
		frameResults.getContentPane().add(labelTitle);
		
		JLabel labelSubtitle = new JLabel("Here are your customized results ");
		labelSubtitle.setHorizontalAlignment(SwingConstants.CENTER);
		labelSubtitle.setForeground(Color.GRAY);
		labelSubtitle.setFont(new Font("Futura", Font.PLAIN, 14));
		labelSubtitle.setBounds(372, 106, 268, 16);
		frameResults.getContentPane().add(labelSubtitle);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.DARK_GRAY);
		separator.setBounds(370, 145, 258, 23);
		frameResults.getContentPane().add(separator);
		
		
		String[] columnNamesCar = {"Make", "Model","Year","KM/Litre", "Cost ($)","Seats","Horse Power"}; 
		
		
		JLabel labelSubHeading = new JLabel("Vehicles for You");
		labelSubHeading.setHorizontalAlignment(SwingConstants.CENTER);
		labelSubHeading.setForeground(Color.DARK_GRAY);
		labelSubHeading.setFont(new Font("Futura", Font.PLAIN, 25));
		labelSubHeading.setBounds(6, 155, 988, 34);
		frameResults.getContentPane().add(labelSubHeading);
		
		tableCar = new JTable(ResultsOfSortingArrays.resultsCars , columnNamesCar);
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
					if ( JOptionPane.showConfirmDialog(frameResults.getContentPane(), "Are You Sure you wish to add this to the cart?","Cart Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null) == JOptionPane.YES_OPTION) {
						System.out.println("Yes");
						CartCheckout.carsCheckout.add(AutomobileData.carsArray[carMatches.get(0)]);
					}
				}
				else if (tableCar.getSelectedRow() == 1 ) {
					if (JOptionPane.showConfirmDialog(frameResults.getContentPane(), "Are You Sure you wish to add this to the cart?","Cart Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null) == JOptionPane.YES_OPTION) {
						System.out.println("Yes");
						CartCheckout.carsCheckout.add(AutomobileData.carsArray[carMatches.get(1)]);
					}
				}
				else if (tableCar.getSelectedRow() == 2 ) {
					if (JOptionPane.showConfirmDialog(frameResults.getContentPane(), "Are You Sure you wish to add this to the cart?","Cart Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null) == JOptionPane.YES_OPTION) {
						System.out.println("Yes");
						CartCheckout.carsCheckout.add(AutomobileData.carsArray[carMatches.get(2)]);
					}
				}
				else if (tableCar.getSelectedRow() == 3 ) {
					if (JOptionPane.showConfirmDialog(frameResults.getContentPane(), "Are You Sure you wish to add this to the cart?","Cart Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null) == JOptionPane.YES_OPTION) {
						System.out.println("Yes");
						CartCheckout.carsCheckout.add(AutomobileData.carsArray[carMatches.get(3)]);
					}
				}
				else if (tableCar.getSelectedRow() == 4 ) {
					if (JOptionPane.showConfirmDialog(frameResults.getContentPane(), "Are You Sure you wish to add this to the cart?","Cart Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null) == JOptionPane.YES_OPTION) {
						System.out.println("Yes");
						CartCheckout.carsCheckout.add(AutomobileData.carsArray[carMatches.get(4)]);
					}
				}
				else if (tableCar.getSelectedRow() == 5 ) {
					if ( JOptionPane.showConfirmDialog(frameResults.getContentPane(), "Are You Sure you wish to add this to the cart?","Cart Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null) == JOptionPane.YES_OPTION) {
						System.out.println("Yes");
						CartCheckout.carsCheckout.add(AutomobileData.carsArray[carMatches.get(5)]);
					}
				}
				else if (tableCar.getSelectedRow() == 6 ) {
					if (JOptionPane.showConfirmDialog(frameResults.getContentPane(), "Are You Sure you wish to add this to the cart?","Cart Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null) == JOptionPane.YES_OPTION) {
						System.out.println("Yes");
						CartCheckout.carsCheckout.add(AutomobileData.carsArray[carMatches.get(6)]);
					}
				}
				else if (tableCar.getSelectedRow() == 7 ) {
					if (JOptionPane.showConfirmDialog(frameResults.getContentPane(), "Are You Sure you wish to add this to the cart?","Cart Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null) == JOptionPane.YES_OPTION) {
						System.out.println("Yes");
						CartCheckout.carsCheckout.add(AutomobileData.carsArray[carMatches.get(7)]);
					}
				}
				else if (tableCar.getSelectedRow() == 8 ) {
					if (JOptionPane.showConfirmDialog(frameResults.getContentPane(), "Are You Sure you wish to add this to the cart?","Cart Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null) == JOptionPane.YES_OPTION) {
						System.out.println("Yes");
						CartCheckout.carsCheckout.add(AutomobileData.carsArray[carMatches.get(8)]);
					}
				}
				else if (tableCar.getSelectedRow() == 9 ) {
					if (JOptionPane.showConfirmDialog(frameResults.getContentPane(), "Are You Sure you wish to add this to the cart?","Cart Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null) == JOptionPane.YES_OPTION) {
						System.out.println("Yes");
						CartCheckout.carsCheckout.add(AutomobileData.carsArray[carMatches.get(9)]);
					}
				}
				
				
				
			}
		});
		

			
	
		JScrollPane scrollPaneCar = new JScrollPane(tableCar);
		
		scrollPaneCar.setSize(950, 80);
		scrollPaneCar.setLocation(26, 250);
		frameResults.getContentPane().add(scrollPaneCar);
		
		String[] columnNamesTruck = {"Make", "Model","Year","KM/Litre", "Cost ($)","Max Trailer Weight (KG)","Wheels"}; 
		
		tableTruck = new JTable(ResultsOfSortingArrays.resultsTrucks , columnNamesTruck);
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
					if ( JOptionPane.showConfirmDialog(frameResults.getContentPane(), "Are You Sure you wish to add this to the cart?","Cart Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null) == JOptionPane.YES_OPTION) {
						System.out.println("Yes");
						CartCheckout.trucksCheckout.add(AutomobileData.trucksArray[truckMatches.get(0)]);
					}
				}
				else if (tableTruck.getSelectedRow() == 1 ) {
					if (JOptionPane.showConfirmDialog(frameResults.getContentPane(), "Are You Sure you wish to add this to the cart?","Cart Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null) == JOptionPane.YES_OPTION) {
						System.out.println("Yes");
						CartCheckout.trucksCheckout.add(AutomobileData.trucksArray[truckMatches.get(1)]);
					}
				}
				else if (tableTruck.getSelectedRow() == 2 ) {
					if (JOptionPane.showConfirmDialog(frameResults.getContentPane(), "Are You Sure you wish to add this to the cart?","Cart Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null) == JOptionPane.YES_OPTION) {
						System.out.println("Yes");
						CartCheckout.trucksCheckout.add(AutomobileData.trucksArray[truckMatches.get(2)]);
					}
				}
				else if (tableTruck.getSelectedRow() == 3 ) {
					if (JOptionPane.showConfirmDialog(frameResults.getContentPane(), "Are You Sure you wish to add this to the cart?","Cart Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null) == JOptionPane.YES_OPTION) {
						System.out.println("Yes");
						CartCheckout.trucksCheckout.add(AutomobileData.trucksArray[truckMatches.get(3)]);
					}
				}
				else if (tableTruck.getSelectedRow() == 4 ) {
					if (JOptionPane.showConfirmDialog(frameResults.getContentPane(), "Are You Sure you wish to add this to the cart?","Cart Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null) == JOptionPane.YES_OPTION) {
						System.out.println("Yes");
						CartCheckout.trucksCheckout.add(AutomobileData.trucksArray[truckMatches.get(4)]);
					}
				}
				else if (tableTruck.getSelectedRow() == 5 ) {
					if ( JOptionPane.showConfirmDialog(frameResults.getContentPane(), "Are You Sure you wish to add this to the cart?","Cart Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null) == JOptionPane.YES_OPTION) {
						System.out.println("Yes");
						CartCheckout.trucksCheckout.add(AutomobileData.trucksArray[truckMatches.get(5)]);
					}
				}
				else if (tableTruck.getSelectedRow() == 6 ) {
					if (JOptionPane.showConfirmDialog(frameResults.getContentPane(), "Are You Sure you wish to add this to the cart?","Cart Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null) == JOptionPane.YES_OPTION) {
						System.out.println("Yes");
						CartCheckout.trucksCheckout.add(AutomobileData.trucksArray[truckMatches.get(6)]);
					}
				}
				else if (tableTruck.getSelectedRow() == 7 ) {
					if (JOptionPane.showConfirmDialog(frameResults.getContentPane(), "Are You Sure you wish to add this to the cart?","Cart Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null) == JOptionPane.YES_OPTION) {
						System.out.println("Yes");
						CartCheckout.trucksCheckout.add(AutomobileData.trucksArray[truckMatches.get(7)]);
					}
				}
				else if (tableTruck.getSelectedRow() == 8 ) {
					if (JOptionPane.showConfirmDialog(frameResults.getContentPane(), "Are You Sure you wish to add this to the cart?","Cart Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null) == JOptionPane.YES_OPTION) {
						System.out.println("Yes");
						CartCheckout.trucksCheckout.add(AutomobileData.trucksArray[truckMatches.get(8)]);
					}
				}
				else if (tableTruck.getSelectedRow() == 9 ) {
					if (JOptionPane.showConfirmDialog(frameResults.getContentPane(), "Are You Sure you wish to add this to the cart?","Cart Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null) == JOptionPane.YES_OPTION) {
						System.out.println("Yes");
						CartCheckout.trucksCheckout.add(AutomobileData.trucksArray[truckMatches.get(9)]);
					}
				}
				
				
				
			}
		});
		
		JScrollPane scrollPaneTruck = new JScrollPane(tableTruck);
		scrollPaneTruck.setSize(950, 80);
		scrollPaneTruck.setLocation(26, 400);
		frameResults.getContentPane().add(scrollPaneTruck);
		
		
		String[] columnNamesMotorcycle = {"Make", "Model","Year","KM/Litre", "Cost ($)","Engine Type","Seat Height (cm)"}; 
		
		tableMotorcycle = new JTable(ResultsOfSortingArrays.resultsMotorcycles , columnNamesMotorcycle);
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
					if ( JOptionPane.showConfirmDialog(frameResults.getContentPane(), "Are You Sure you wish to add this to the cart?","Cart Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null) == JOptionPane.YES_OPTION) {
						System.out.println("Yes");
						CartCheckout.motorcyclesCheckout.add(AutomobileData.motorcyclesArray[motorcycleMatches.get(0)]);
					}
				}
				else if (tableMotorcycle.getSelectedRow() == 1 ) {
					if (JOptionPane.showConfirmDialog(frameResults.getContentPane(), "Are You Sure you wish to add this to the cart?","Cart Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null) == JOptionPane.YES_OPTION) {
						System.out.println("Yes");
						CartCheckout.motorcyclesCheckout.add(AutomobileData.motorcyclesArray[motorcycleMatches.get(1)]);
					}
				}
				else if (tableMotorcycle.getSelectedRow() == 2 ) {
					if (JOptionPane.showConfirmDialog(frameResults.getContentPane(), "Are You Sure you wish to add this to the cart?","Cart Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null) == JOptionPane.YES_OPTION) {
						System.out.println("Yes");
						CartCheckout.motorcyclesCheckout.add(AutomobileData.motorcyclesArray[motorcycleMatches.get(2)]);
					}
				}
				else if (tableMotorcycle.getSelectedRow() == 3 ) {
					if (JOptionPane.showConfirmDialog(frameResults.getContentPane(), "Are You Sure you wish to add this to the cart?","Cart Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null) == JOptionPane.YES_OPTION) {
						System.out.println("Yes");
						CartCheckout.motorcyclesCheckout.add(AutomobileData.motorcyclesArray[motorcycleMatches.get(3)]);
					}
				}
				else if (tableMotorcycle.getSelectedRow() == 4 ) {
					if (JOptionPane.showConfirmDialog(frameResults.getContentPane(), "Are You Sure you wish to add this to the cart?","Cart Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null) == JOptionPane.YES_OPTION) {
						System.out.println("Yes");
						CartCheckout.motorcyclesCheckout.add(AutomobileData.motorcyclesArray[motorcycleMatches.get(4)]);
					}
				}
				else if (tableMotorcycle.getSelectedRow() == 5 ) {
					if ( JOptionPane.showConfirmDialog(frameResults.getContentPane(), "Are You Sure you wish to add this to the cart?","Cart Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null) == JOptionPane.YES_OPTION) {
						System.out.println("Yes");
						CartCheckout.motorcyclesCheckout.add(AutomobileData.motorcyclesArray[motorcycleMatches.get(5)]);
					}
				}
				else if (tableMotorcycle.getSelectedRow() == 6 ) {
					if (JOptionPane.showConfirmDialog(frameResults.getContentPane(), "Are You Sure you wish to add this to the cart?","Cart Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null) == JOptionPane.YES_OPTION) {
						System.out.println("Yes");
						CartCheckout.motorcyclesCheckout.add(AutomobileData.motorcyclesArray[motorcycleMatches.get(6)]);
					}
				}
				else if (tableMotorcycle.getSelectedRow() == 7 ) {
					if (JOptionPane.showConfirmDialog(frameResults.getContentPane(), "Are You Sure you wish to add this to the cart?","Cart Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null) == JOptionPane.YES_OPTION) {
						System.out.println("Yes");
						CartCheckout.motorcyclesCheckout.add(AutomobileData.motorcyclesArray[motorcycleMatches.get(7)]);
					}
				}
				else if (tableMotorcycle.getSelectedRow() == 8 ) {
					if (JOptionPane.showConfirmDialog(frameResults.getContentPane(), "Are You Sure you wish to add this to the cart?","Cart Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null) == JOptionPane.YES_OPTION) {
						System.out.println("Yes");
						CartCheckout.motorcyclesCheckout.add(AutomobileData.motorcyclesArray[motorcycleMatches.get(8)]);
					}
				}
				else if (tableMotorcycle.getSelectedRow() == 9 ) {
					if (JOptionPane.showConfirmDialog(frameResults.getContentPane(), "Are You Sure you wish to add this to the cart?","Cart Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null) == JOptionPane.YES_OPTION) {
						System.out.println("Yes");
						CartCheckout.motorcyclesCheckout.add(AutomobileData.motorcyclesArray[motorcycleMatches.get(9)]);
					}
				}
				
				
				
			}
		});
		
		JScrollPane scrollPaneMotorcycle = new JScrollPane(tableMotorcycle);
		scrollPaneMotorcycle.setSize(950, 80);
		scrollPaneMotorcycle.setLocation(26, 550);
		frameResults.getContentPane().add(scrollPaneMotorcycle);
		
		JLabel labelCars = new JLabel("Cars");
		labelCars.setFont(new Font("Futura", Font.PLAIN, 20));
		labelCars.setVerticalAlignment(SwingConstants.BOTTOM);
		labelCars.setBounds(26, 201, 90, 37);
		frameResults.getContentPane().add(labelCars);
		
		JLabel labelTrucks = new JLabel("Trucks");
		labelTrucks.setVerticalAlignment(SwingConstants.BOTTOM);
		labelTrucks.setFont(new Font("Futura", Font.PLAIN, 20));
		labelTrucks.setBounds(26, 351, 90, 37);
		frameResults.getContentPane().add(labelTrucks);
		
		JLabel labelMotorcycles = new JLabel("Motorcycles");
		labelMotorcycles.setVerticalAlignment(SwingConstants.BOTTOM);
		labelMotorcycles.setFont(new Font("Futura", Font.PLAIN, 20));
		labelMotorcycles.setBounds(26, 501, 124, 37);
		frameResults.getContentPane().add(labelMotorcycles);
		
		JButton buttonReturn = new JButton("Return to Sorting");
		buttonReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SortCars.initialize();
				frameResults.dispose();
			}
		});
		buttonReturn.setBounds(830, 6, 164, 29);
		frameResults.getContentPane().add(buttonReturn);
		
	}
}
