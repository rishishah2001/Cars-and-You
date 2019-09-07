package windows;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.CompoundBorder;

import dataToBeShown.CartCheckout;
import dataToBeShown.HomepageRandomizer;
import dataToBeShown.TrackData;
import javax.swing.JTextField;
import javax.swing.JButton;

public class TrackTimes {

	private JFrame frameTrackTimes;
	private JTable tableTrackDriverCar;
	private JTable tableTrackDriverTruck;

	public static void initialize() {
		TrackTimes window = new TrackTimes();
		window.frameTrackTimes.setVisible(true);
	
	}

	public TrackTimes() {
		contents();
	}

	private void contents() {
		
		frameTrackTimes = new JFrame();
		frameTrackTimes.setBounds(200, 50, 1000, 750);
		frameTrackTimes.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameTrackTimes.getContentPane().setLayout(null);
		
		JLabel labelTitle = new JLabel("Track Times");
		labelTitle.setForeground(Color.DARK_GRAY);
		labelTitle.setFont(new Font("Futura", Font.BOLD, 35));
		labelTitle.setHorizontalAlignment(SwingConstants.CENTER);
		labelTitle.setBounds(6, 51, 988, 51);
		frameTrackTimes.getContentPane().add(labelTitle);
		
		JLabel labelSubtitle = new JLabel("Track Driving Times for Various Cars & Trucks");
		labelSubtitle.setForeground(Color.GRAY);
		labelSubtitle.setFont(new Font("Futura", Font.PLAIN, 14));
		labelSubtitle.setBounds(361, 105, 301, 16);
		frameTrackTimes.getContentPane().add(labelSubtitle);
		
		String[] columnNames = {"Driver","Vehicle","Time (Hr)"};
		
		
		tableTrackDriverCar = new JTable(TrackData.carByDriver , columnNames);
		tableTrackDriverCar.setRowSelectionAllowed(false);
		tableTrackDriverCar.setShowVerticalLines(false);
		tableTrackDriverCar.setShowHorizontalLines(false);
		tableTrackDriverCar.setShowGrid(false);
		tableTrackDriverCar.setBorder(new CompoundBorder());
		tableTrackDriverCar.setPreferredScrollableViewportSize(new Dimension(950,100));
		tableTrackDriverCar.setFont(new Font("Futura", Font.PLAIN, 14));
		
		JScrollPane scrollPaneCarDriver = new JScrollPane(tableTrackDriverCar);
		scrollPaneCarDriver.setSize(400, 80);
		scrollPaneCarDriver.setLocation(85, 250);
		frameTrackTimes.getContentPane().add(scrollPaneCarDriver);
		
		
		tableTrackDriverTruck = new JTable(TrackData.truckByDriver , columnNames);
		tableTrackDriverTruck.setRowSelectionAllowed(false);
		tableTrackDriverTruck.setShowVerticalLines(false);
		tableTrackDriverTruck.setShowHorizontalLines(false);
		tableTrackDriverTruck.setShowGrid(false);
		tableTrackDriverTruck.setBorder(new CompoundBorder());
		tableTrackDriverTruck.setPreferredScrollableViewportSize(new Dimension(950,100));
		tableTrackDriverTruck.setFont(new Font("Futura", Font.PLAIN, 14));
		
		JScrollPane scrollPaneTruckDriver = new JScrollPane(tableTrackDriverTruck);
		scrollPaneTruckDriver.setSize(400, 80);
		scrollPaneTruckDriver.setLocation(537, 250);
		frameTrackTimes.getContentPane().add(scrollPaneTruckDriver);
		
		JLabel lblNewLabelCar = new JLabel("Car");
		lblNewLabelCar.setFont(new Font("Futura", Font.PLAIN, 20));
		lblNewLabelCar.setBounds(85, 187, 117, 51);
		frameTrackTimes.getContentPane().add(lblNewLabelCar);
		
		JLabel lblTruck = new JLabel("Truck");
		lblTruck.setHorizontalAlignment(SwingConstants.TRAILING);
		lblTruck.setFont(new Font("Futura", Font.PLAIN, 20));
		lblTruck.setBounds(856, 187, 81, 51);
		frameTrackTimes.getContentPane().add(lblTruck);
		
		JMenuBar menuBar = new JMenuBar();
		frameTrackTimes.setJMenuBar(menuBar);
		
		
		JMenuItem menuButtonHome = new JMenuItem("Home");
		menuButtonHome.addActionListener(new ActionListener() {;
		public void actionPerformed(ActionEvent e) {
			HomePage.initialize();
			frameTrackTimes.dispose();
		}
	});
		menuBar.add(menuButtonHome);
		JMenuItem menuButtonSort = new JMenuItem("Sort Cars      ");
		menuButtonSort.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SortCars.initialize();
				frameTrackTimes.dispose();
			}
		});
		menuBar.add(menuButtonSort);
		
		JMenuItem menuButtonTrackTimes = new JMenuItem("Track Times");
		menuButtonTrackTimes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TrackData.begin();
				TrackTimes.initialize();
				frameTrackTimes.dispose();
			}
		});
		menuBar.add(menuButtonTrackTimes);
		
		JMenuItem menuButtonCart = new JMenuItem("My Cart");
		menuButtonCart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CartCheckout.output();
				frameTrackTimes.dispose();
			}
		});
		menuBar.add(menuButtonCart);
		
		JMenuItem menuButtonLogOut = new JMenuItem("Log Out");
		menuButtonLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login.initialize();
				frameTrackTimes.dispose();
				
			}
		});
		menuBar.add(menuButtonLogOut);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
