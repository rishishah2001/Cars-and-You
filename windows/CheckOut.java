

package windows;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.CompoundBorder;

import dataToBeShown.carReciept;
import dataToBeShown.motorcycleReciept;
import dataToBeShown.truckReciept;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.BorderLayout;

public class CheckOut {

	private JFrame frameCheckOut;
	private JTable tableReciept;

	public static void initalize() {
		CheckOut window = new CheckOut();
		window.frameCheckOut.setVisible(true);
	}
	
	public CheckOut() {
		contents();
	}

	
	private void contents() {
		
		frameCheckOut = new JFrame();
		frameCheckOut.setBounds(200, 50, 1000, 750);
		frameCheckOut.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameCheckOut.getContentPane().setLayout(null);
		
		JLabel labelTitle = new JLabel("Check Out");
		labelTitle.setForeground(Color.DARK_GRAY);
		labelTitle.setFont(new Font("Futura", Font.BOLD, 35));
		labelTitle.setHorizontalAlignment(SwingConstants.CENTER);
		labelTitle.setBounds(6, 51, 988, 51);
		frameCheckOut.getContentPane().add(labelTitle);
		
		JLabel labelSubtitle = new JLabel("Thank you for your purchase");
		labelSubtitle.setHorizontalAlignment(SwingConstants.CENTER);
		labelSubtitle.setForeground(Color.GRAY);
		labelSubtitle.setFont(new Font("Futura", Font.PLAIN, 14));
		labelSubtitle.setBounds(372, 106, 268, 16);
		frameCheckOut.getContentPane().add(labelSubtitle);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.DARK_GRAY);
		separator.setBounds(370, 145, 258, 23);
		frameCheckOut.getContentPane().add(separator);
		
		JButton buttonReturn = new JButton("Return to Cart");
		buttonReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cart.initialize();
				frameCheckOut.dispose();
			}
		});
		buttonReturn.setBounds(830, 6, 164, 29);
		frameCheckOut.getContentPane().add(buttonReturn);
		carReciept a = new carReciept();
		truckReciept rt = new truckReciept();
		motorcycleReciept rm = new motorcycleReciept();
		
		String[] columnNamesHeadings = {"Automobile Type", "Total Cost ($)","Total Cost w/ Tax ($)","Total Vehicles Purchased"}; 
		
		String[][] rows = {{"Cars",a.costPreTax(),a.costAfterTax(),Byte.toString(carReciept.carsPurchased)},
						   {"Trucks",rt.costPreTax(),rt.costAfterTax(),Byte.toString(truckReciept.trucksPurchased)},
						   {"Motorcycles",rm.costPreTax(),rm.costAfterTax(),Byte.toString(motorcycleReciept.motorcyclesPurchased)}};
			
		
		tableReciept = new JTable(rows , columnNamesHeadings);
		tableReciept.setRowSelectionAllowed(false);
		tableReciept.setShowVerticalLines(false);
		tableReciept.setShowHorizontalLines(false);
		tableReciept.setShowGrid(false);
		tableReciept.setBorder(new CompoundBorder());
		tableReciept.setPreferredScrollableViewportSize(new Dimension(950,100));
		tableReciept.setFont(new Font("Futura", Font.PLAIN, 16));
		
		JScrollPane scrollPaneReciept = new JScrollPane(tableReciept);
		scrollPaneReciept.setSize(950, 80);
		scrollPaneReciept.setLocation(26, 300);
		frameCheckOut.getContentPane().add(scrollPaneReciept);
		
		
	}
}
