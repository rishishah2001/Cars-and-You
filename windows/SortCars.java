package windows;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

import dataToBeShown.CartCheckout;
import dataToBeShown.SortingCarsResults;
import dataToBeShown.TrackData;

import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;

public class SortCars {

	protected JFrame frameSortCars;
	protected static JTextField textFieldMake;
	protected static JTextField textFieldModel;
	protected static JTextField textFieldPrice;
	protected static JTextField textFieldYear;
	protected static JTextField textFieldKMPerLitre;
	protected static JTextField textFieldSeats;
	protected static JTextField textFieldHP;
	protected static JTextField textFieldWeight;
	protected static JTextField textFieldWheels;
	protected static JTextField textFieldSeatHeight;
	protected static JRadioButton radioButtonCars;
	protected static JRadioButton radioButtonTrucks;
	protected static JRadioButton radioButtonMotorcycles;
	protected static JRadioButton radioButtonNoPreferenceMake;
	protected static JRadioButton radioButtonNoPreferenceModel;
	protected static JRadioButton radioButtonLessThanCost;
	protected static JRadioButton radioButtonMoreThanCost;
	protected static JRadioButton radioButtonNoPrefCost;
	protected static JRadioButton radioButtonLessThanKM;
	protected static JRadioButton radioButtonMoreThanKM;
	protected static JRadioButton radioButtonNoPrefKM;
	protected static JRadioButton radioButtonLessThanYear;
	protected static JRadioButton radioButtonMoreThanYear;
	protected static JRadioButton radioButtonNoPrefYear;
	protected static JRadioButton radioButtonLessThenSeats;
	protected static JRadioButton radioButtonMoreThenSeats;
	protected static JRadioButton radioButtonSeatsNoPref;
	protected static JRadioButton radioButtonLessThanHP;
	protected static JRadioButton radioButtonMoreThanHP;
	protected static JRadioButton radioButtonNoPrefHP;
	protected static JRadioButton radioButtonLessThanWeight;
	protected static JRadioButton radioButtonMoreThanWeight;
	protected static JRadioButton radioButtonNoPrefWeight;
	protected static JRadioButton radioButtonLessThanWheels;
	protected static JRadioButton radioButtonMoreThanWheels;
	protected static JRadioButton radioButtonNoPrefWheels;
	protected static JRadioButton radioButtonLessThanSeatHeight;
	protected static JRadioButton radioButtonMoreThanSeatHeight;
	protected static JRadioButton radioButtonNoPrefSeatHeight;
	protected static JRadioButton radioButtonTypeA;
	protected static JRadioButton radioButtonTypeB;
	protected static JRadioButton radioButtonTypeC;
	protected static JRadioButton radioButtonTypeD;
	
	public static String enteredMake;
	public static String enteredModel;
	
	protected static double cost;
	protected static float km;
	protected static int year;
	protected static int seats;
	protected static int HP;
	protected static double weight;
	protected static int wheels;
	protected static int height;
	
	private static boolean proceed = false;
	private JSeparator separator_5;

	
	public static void initialize() {
		SortCars window = new SortCars();
		window.frameSortCars.setVisible(true);
	}

	public SortCars() {
		contents();
	}

	private void contents() {
		frameSortCars= new JFrame();
		frameSortCars.setBounds(200, 50, 1000, 750);
		frameSortCars.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameSortCars.getContentPane().setLayout(null);
		
		JLabel labelTitle = new JLabel("Sort Vehicles");
		labelTitle.setForeground(Color.DARK_GRAY);
		labelTitle.setFont(new Font("Futura", Font.BOLD, 35));
		labelTitle.setHorizontalAlignment(SwingConstants.CENTER);
		labelTitle.setBounds(9, 53, 988, 51);
		frameSortCars.getContentPane().add(labelTitle);
		
		JLabel labelSubtitle = new JLabel("Find the perfect car for you");
		labelSubtitle.setFont(new Font("Futura", Font.PLAIN, 14));
		labelSubtitle.setForeground(Color.GRAY);
		labelSubtitle.setHorizontalAlignment(SwingConstants.CENTER);
		labelSubtitle.setBounds(6, 114, 988, 16);
		frameSortCars.getContentPane().add(labelSubtitle);
		
		JMenuBar menuBar = new JMenuBar();
		frameSortCars.setJMenuBar(menuBar);
		
		
		JMenuItem menuButtonHome = new JMenuItem("Home");
		menuButtonHome.addActionListener(new ActionListener() {;
		public void actionPerformed(ActionEvent e) {
			HomePage.initialize();
			frameSortCars.dispose();
		}
	});
		menuBar.add(menuButtonHome);
		JMenuItem menuButtonSort = new JMenuItem("Sort Cars      ");
		menuButtonSort.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SortCars.initialize();
				frameSortCars.dispose();
			}
		});
		menuBar.add(menuButtonSort);
		
		JMenuItem menuButtonTrackTimes = new JMenuItem("Track Times");
		menuButtonTrackTimes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TrackData.begin();
				TrackTimes.initialize();
				frameSortCars.dispose();
			}
		});
		menuBar.add(menuButtonTrackTimes);
		
		JMenuItem menuButtonCart = new JMenuItem("My Cart");
		menuButtonCart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CartCheckout.output();
				frameSortCars.dispose();
			}
		});
		menuBar.add(menuButtonCart);
		
		JMenuItem menuButtonLogOut = new JMenuItem("Log Out");
		menuButtonLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login.initialize();
				frameSortCars.dispose();
				
			}
		});
		menuBar.add(menuButtonLogOut);
		

		JSeparator separator = new JSeparator();
		separator.setForeground(Color.DARK_GRAY);
		separator.setBounds(370, 145, 258, 23);
		frameSortCars.getContentPane().add(separator);
		
		radioButtonCars = new JRadioButton("Cars");
		radioButtonCars.setSelected(true);
		
		radioButtonCars.setFont(new Font("Futura", Font.BOLD, 20));
		radioButtonCars.setBounds(325, 160, 84, 23);
		frameSortCars.getContentPane().add(radioButtonCars);
		
		radioButtonTrucks = new JRadioButton("Trucks");
		radioButtonTrucks.setSelected(true);
		radioButtonTrucks.setFont(new Font("Futura", Font.BOLD, 20));
		radioButtonTrucks.setBounds(443, 160, 106, 23);
		frameSortCars.getContentPane().add(radioButtonTrucks);
		
		radioButtonMotorcycles = new JRadioButton("Motorcycles");
		radioButtonMotorcycles.setSelected(true);
		radioButtonMotorcycles.setFont(new Font("Futura", Font.BOLD, 20));
		radioButtonMotorcycles.setBounds(577, 160, 160, 23);
		frameSortCars.getContentPane().add(radioButtonMotorcycles);
		
		
		
		textFieldMake = new JTextField();
		textFieldMake.setText("[Enter Make Here]");
		textFieldMake.setBounds(102, 202, 150, 26);
		frameSortCars.getContentPane().add(textFieldMake);
		textFieldMake.setColumns(10);
		
		textFieldModel = new JTextField();
		textFieldModel.setText("[Enter Model Here]");
		textFieldModel.setColumns(10);
		textFieldModel.setBounds(102, 253, 150, 26);
		frameSortCars.getContentPane().add(textFieldModel);
		
		JLabel labelMake = new JLabel("Make");
		labelMake.setFont(new Font("Futura", Font.PLAIN, 20));
		labelMake.setBounds(29, 208, 61, 16);
		frameSortCars.getContentPane().add(labelMake);
		
		JLabel labelModel = new JLabel("Model");
		labelModel.setFont(new Font("Futura", Font.PLAIN, 20));
		labelModel.setBounds(29, 257, 61, 16);
		frameSortCars.getContentPane().add(labelModel);
		
	
		
		radioButtonLessThanCost = new JRadioButton("Less Than");
		radioButtonLessThanCost.setFont(new Font("Futura", Font.PLAIN, 13));
		radioButtonLessThanCost.setBounds(390, 256, 96, 23);
		frameSortCars.getContentPane().add(radioButtonLessThanCost);
		
		radioButtonMoreThanCost = new JRadioButton("More Than");
		radioButtonMoreThanCost.setFont(new Font("Futura", Font.PLAIN, 13));
		radioButtonMoreThanCost.setBounds(478, 256, 106, 23);
		frameSortCars.getContentPane().add(radioButtonMoreThanCost);
		
		radioButtonNoPrefCost = new JRadioButton("Any Cost");
		radioButtonNoPrefCost.setSelected(true);
		radioButtonNoPrefCost.setFont(new Font("Futura", Font.PLAIN, 13));
		radioButtonNoPrefCost.setBounds(577, 256, 94, 23);
		frameSortCars.getContentPane().add(radioButtonNoPrefCost);
		
		ButtonGroup buttonGroupCost = new ButtonGroup();
		buttonGroupCost.add(radioButtonMoreThanCost);
		buttonGroupCost.add(radioButtonLessThanCost);
		buttonGroupCost.add(radioButtonNoPrefCost);
	
		
		textFieldPrice = new JTextField();
		textFieldPrice.setText("0");
		textFieldPrice.setBounds(495, 204, 150, 26);
		frameSortCars.getContentPane().add(textFieldPrice);
		textFieldPrice.setColumns(10);
		
		JLabel labelCost = new JLabel("Cost ($)");
		labelCost.setFont(new Font("Futura", Font.PLAIN, 20));
		labelCost.setBounds(406, 203, 71, 25);
		frameSortCars.getContentPane().add(labelCost);
		
		radioButtonLessThanYear = new JRadioButton("Before");
		radioButtonLessThanYear.setFont(new Font("Futura", Font.PLAIN, 13));
		radioButtonLessThanYear.setBounds(23, 355, 76, 23);
		frameSortCars.getContentPane().add(radioButtonLessThanYear);
		
		radioButtonMoreThanYear = new JRadioButton("After");
		radioButtonMoreThanYear.setFont(new Font("Futura", Font.PLAIN, 13));
		radioButtonMoreThanYear.setBounds(137, 355, 65, 23);
		frameSortCars.getContentPane().add(radioButtonMoreThanYear);
		
		radioButtonNoPrefYear = new JRadioButton("Any Year");
		radioButtonNoPrefYear.setSelected(true);
		radioButtonNoPrefYear.setFont(new Font("Futura", Font.PLAIN, 13));
		radioButtonNoPrefYear.setBounds(233, 355, 94, 23);
		frameSortCars.getContentPane().add(radioButtonNoPrefYear);
		
		ButtonGroup buttonGroupYear = new ButtonGroup();
		buttonGroupYear.add(radioButtonMoreThanYear);
		buttonGroupYear.add(radioButtonLessThanYear);
		buttonGroupYear.add(radioButtonNoPrefYear);
		
		textFieldYear = new JTextField();
		textFieldYear.setText("0");
		textFieldYear.setColumns(10);
		textFieldYear.setBounds(128, 314, 150, 26);
		frameSortCars.getContentPane().add(textFieldYear);
		
		JLabel labelYear = new JLabel("Year");
		labelYear.setFont(new Font("Futura", Font.PLAIN, 20));
		labelYear.setBounds(39, 309, 51, 30);
		frameSortCars.getContentPane().add(labelYear);
		
		radioButtonLessThanKM = new JRadioButton("Less Than");
		radioButtonLessThanKM.setFont(new Font("Futura", Font.PLAIN, 13));
		radioButtonLessThanKM.setBounds(688, 256, 96, 23);
		frameSortCars.getContentPane().add(radioButtonLessThanKM);
		
		radioButtonMoreThanKM = new JRadioButton("More Than");
		radioButtonMoreThanKM.setFont(new Font("Futura", Font.PLAIN, 13));
		radioButtonMoreThanKM.setBounds(783, 256, 106, 23);
		frameSortCars.getContentPane().add(radioButtonMoreThanKM);
		
		radioButtonNoPrefKM = new JRadioButton("Any KM/L");
		radioButtonNoPrefKM.setSelected(true);
		radioButtonNoPrefKM.setFont(new Font("Futura", Font.PLAIN, 13));
		radioButtonNoPrefKM.setBounds(887, 256, 94, 23);
		frameSortCars.getContentPane().add(radioButtonNoPrefKM);
		
		ButtonGroup buttonGroupKM= new ButtonGroup();
		buttonGroupKM.add(radioButtonLessThanKM);
		buttonGroupKM.add(radioButtonMoreThanKM);
		buttonGroupKM.add(radioButtonNoPrefKM);
		
		
		
		
		
		textFieldKMPerLitre = new JTextField();
		textFieldKMPerLitre.setText("0");
		textFieldKMPerLitre.setColumns(10);
		textFieldKMPerLitre.setBounds(803, 204, 150, 26);
		frameSortCars.getContentPane().add(textFieldKMPerLitre);
		
		JLabel labelKMPerLitre = new JLabel("KM/Litre");
		labelKMPerLitre.setFont(new Font("Futura", Font.PLAIN, 20));
		labelKMPerLitre.setBounds(704, 203, 80, 25);
		frameSortCars.getContentPane().add(labelKMPerLitre);
		
		radioButtonLessThenSeats = new JRadioButton("Less Than");
		radioButtonLessThenSeats.setFont(new Font("Futura", Font.PLAIN, 13));
		radioButtonLessThenSeats.setBounds(390, 355, 96, 23);
		frameSortCars.getContentPane().add(radioButtonLessThenSeats);
		
		radioButtonMoreThenSeats = new JRadioButton("More Than");
		radioButtonMoreThenSeats.setFont(new Font("Futura", Font.PLAIN, 13));
		radioButtonMoreThenSeats.setBounds(478, 355, 106, 23);
		frameSortCars.getContentPane().add(radioButtonMoreThenSeats);
		
		radioButtonSeatsNoPref = new JRadioButton("Any Seats");
		radioButtonSeatsNoPref.setSelected(true);
		radioButtonSeatsNoPref.setFont(new Font("Futura", Font.PLAIN, 13));
		radioButtonSeatsNoPref.setBounds(577, 355, 97, 23);
		frameSortCars.getContentPane().add(radioButtonSeatsNoPref);
		
		
		
		ButtonGroup buttonGroupSeats = new ButtonGroup();
		buttonGroupSeats.add(radioButtonMoreThenSeats);
		buttonGroupSeats.add(radioButtonLessThenSeats);
		buttonGroupSeats.add(radioButtonSeatsNoPref);
		
		textFieldSeats = new JTextField();
		textFieldSeats.setText("0");
		textFieldSeats.setToolTipText("");
		textFieldSeats.setColumns(10);
		textFieldSeats.setBounds(495, 314, 150, 26);
		frameSortCars.getContentPane().add(textFieldSeats);
		
		JLabel lblSeats = new JLabel("Seats");
		lblSeats.setFont(new Font("Futura", Font.PLAIN, 20));
		lblSeats.setBounds(410, 313, 61, 22);
		frameSortCars.getContentPane().add(lblSeats);
		
		radioButtonLessThanHP = new JRadioButton("Less Than");
		radioButtonLessThanHP.setFont(new Font("Futura", Font.PLAIN, 13));
		radioButtonLessThanHP.setBounds(697, 355, 96, 23);
		frameSortCars.getContentPane().add(radioButtonLessThanHP);
		
		radioButtonMoreThanHP = new JRadioButton("More Than");
		radioButtonMoreThanHP.setFont(new Font("Futura", Font.PLAIN, 13));
		radioButtonMoreThanHP.setBounds(792, 355, 106, 23);
		frameSortCars.getContentPane().add(radioButtonMoreThanHP);
		
		radioButtonNoPrefHP = new JRadioButton("Any H. P.");
		radioButtonNoPrefHP.setSelected(true);
		radioButtonNoPrefHP.setFont(new Font("Futura", Font.PLAIN, 13));
		radioButtonNoPrefHP.setBounds(897, 355, 100, 23);
		frameSortCars.getContentPane().add(radioButtonNoPrefHP);
		
		ButtonGroup buttonGroupHP = new ButtonGroup();
		buttonGroupHP.add(radioButtonLessThanHP);
		buttonGroupHP.add(radioButtonMoreThanHP);
		buttonGroupHP.add(radioButtonNoPrefHP);
		
		
		textFieldHP = new JTextField();
		textFieldHP.setText("0");
		textFieldHP.setColumns(10);
		textFieldHP.setBounds(801, 314, 150, 26);
		frameSortCars.getContentPane().add(textFieldHP);
		
		JLabel HorsePower = new JLabel("H. Power");
		HorsePower.setHorizontalAlignment(SwingConstants.CENTER);
		HorsePower.setFont(new Font("Futura", Font.PLAIN, 20));
		HorsePower.setBounds(704, 316, 84, 16);
		frameSortCars.getContentPane().add(HorsePower);
		
		radioButtonLessThanWeight = new JRadioButton("Less Than");
		radioButtonLessThanWeight.setFont(new Font("Futura", Font.PLAIN, 13));
		radioButtonLessThanWeight.setBounds(390, 463, 96, 23);
		frameSortCars.getContentPane().add(radioButtonLessThanWeight);
		
		JLabel labelWeight = new JLabel("Pullable Kg");
		labelWeight.setHorizontalAlignment(SwingConstants.CENTER);
		labelWeight.setFont(new Font("Futura", Font.PLAIN, 20));
		labelWeight.setBounds(387, 422, 106, 26);
		frameSortCars.getContentPane().add(labelWeight);
		
		radioButtonMoreThanWeight = new JRadioButton("More Than");
		radioButtonMoreThanWeight.setFont(new Font("Futura", Font.PLAIN, 13));
		radioButtonMoreThanWeight.setBounds(485, 463, 106, 23);
		frameSortCars.getContentPane().add(radioButtonMoreThanWeight);
		
		textFieldWeight = new JTextField();
		textFieldWeight.setText("0");
		textFieldWeight.setColumns(10);
		textFieldWeight.setBounds(505, 423, 150, 26);
		frameSortCars.getContentPane().add(textFieldWeight);
		
		radioButtonNoPrefWeight = new JRadioButton("Any Kg");
		radioButtonNoPrefWeight.setSelected(true);
		radioButtonNoPrefWeight.setFont(new Font("Futura", Font.PLAIN, 13));
		radioButtonNoPrefWeight.setBounds(590, 463, 86, 23);
		frameSortCars.getContentPane().add(radioButtonNoPrefWeight);
		
		ButtonGroup buttonGroupWeight = new ButtonGroup();
		buttonGroupWeight.add(radioButtonLessThanWeight);
		buttonGroupWeight.add(radioButtonMoreThanWeight);
		buttonGroupWeight.add(radioButtonNoPrefWeight);
		
		radioButtonLessThanWheels = new JRadioButton("Less Than");
		radioButtonLessThanWheels.setFont(new Font("Futura", Font.PLAIN, 13));
		radioButtonLessThanWheels.setBounds(18, 463, 96, 23);
		frameSortCars.getContentPane().add(radioButtonLessThanWheels);
		
		radioButtonMoreThanWheels = new JRadioButton("More Than");
		radioButtonMoreThanWheels.setFont(new Font("Futura", Font.PLAIN, 13));
		radioButtonMoreThanWheels.setBounds(113, 463, 106, 23);
		frameSortCars.getContentPane().add(radioButtonMoreThanWheels);
		
		radioButtonNoPrefWheels = new JRadioButton("Any Wheels");
		radioButtonNoPrefWheels.setSelected(true);
		radioButtonNoPrefWheels.setFont(new Font("Futura", Font.PLAIN, 13));
		radioButtonNoPrefWheels.setBounds(218, 463, 109, 23);
		frameSortCars.getContentPane().add(radioButtonNoPrefWheels);
		
		ButtonGroup buttonGroupWheels = new ButtonGroup();
		buttonGroupWheels.add(radioButtonLessThanWheels);
		buttonGroupWheels.add(radioButtonMoreThanWheels);
		buttonGroupWheels.add(radioButtonNoPrefWheels);
		
		JLabel labelWheels = new JLabel("Wheels");
		labelWheels.setFont(new Font("Futura", Font.PLAIN, 20));
		labelWheels.setBounds(29, 422, 84, 23);
		frameSortCars.getContentPane().add(labelWheels);
		
		textFieldWheels = new JTextField();
		textFieldWheels.setText("0");
		textFieldWheels.setColumns(10);
		textFieldWheels.setBounds(128, 423, 150, 26);
		frameSortCars.getContentPane().add(textFieldWheels);
		
		radioButtonLessThanSeatHeight = new JRadioButton("Less Than");
		radioButtonLessThanSeatHeight.setFont(new Font("Futura", Font.PLAIN, 13));
		radioButtonLessThanSeatHeight.setBounds(687, 463, 96, 23);
		frameSortCars.getContentPane().add(radioButtonLessThanSeatHeight);
		
		JLabel labelSeatHeight = new JLabel("Seat Height ");
		labelSeatHeight.setHorizontalAlignment(SwingConstants.CENTER);
		labelSeatHeight.setFont(new Font("Futura", Font.PLAIN, 20));
		labelSeatHeight.setBounds(689, 417, 129, 30);
		frameSortCars.getContentPane().add(labelSeatHeight);
		
		radioButtonMoreThanSeatHeight = new JRadioButton("More Than");
		radioButtonMoreThanSeatHeight.setFont(new Font("Futura", Font.PLAIN, 13));
		radioButtonMoreThanSeatHeight.setBounds(782, 463, 106, 23);
		frameSortCars.getContentPane().add(radioButtonMoreThanSeatHeight);
		
		textFieldSeatHeight = new JTextField();
		textFieldSeatHeight.setText("0");
		textFieldSeatHeight.setColumns(10);
		textFieldSeatHeight.setBounds(817, 422, 150, 26);
		frameSortCars.getContentPane().add(textFieldSeatHeight);
		
		radioButtonNoPrefSeatHeight = new JRadioButton("Any Height");
		radioButtonNoPrefSeatHeight.setSelected(true);
		radioButtonNoPrefSeatHeight.setFont(new Font("Futura", Font.PLAIN, 13));
		radioButtonNoPrefSeatHeight.setBounds(887, 463, 110, 23);
		frameSortCars.getContentPane().add(radioButtonNoPrefSeatHeight);
		
		ButtonGroup buttonGroupSeatHeight = new ButtonGroup();
		buttonGroupSeatHeight.add(radioButtonLessThanSeatHeight);
		buttonGroupSeatHeight.add(radioButtonMoreThanSeatHeight);
		buttonGroupSeatHeight.add(radioButtonNoPrefSeatHeight);
		
		
		
		
		radioButtonTypeB = new JRadioButton("B");
		radioButtonTypeB.setFont(new Font("Futura", Font.PLAIN, 13));
		radioButtonTypeB.setBounds(461, 558, 42, 23);
		frameSortCars.getContentPane().add(radioButtonTypeB);
		
		radioButtonTypeC = new JRadioButton("C");
		radioButtonTypeC.setFont(new Font("Futura", Font.PLAIN, 13));
		radioButtonTypeC.setBounds(504, 558, 42, 23);
		frameSortCars.getContentPane().add(radioButtonTypeC);
		
		radioButtonTypeD = new JRadioButton("Any Engine");
		radioButtonTypeD.setSelected(true);
		radioButtonTypeD.setFont(new Font("Futura", Font.PLAIN, 13));
		radioButtonTypeD.setBounds(549, 558, 106, 23);
		frameSortCars.getContentPane().add(radioButtonTypeD);
		
		radioButtonTypeA = new JRadioButton("A");
		radioButtonTypeA.setFont(new Font("Futura", Font.PLAIN, 13));
		radioButtonTypeA.setBounds(418, 558, 42, 23);
		frameSortCars.getContentPane().add(radioButtonTypeA);
		
		
		ButtonGroup buttonGroupEngine = new ButtonGroup();
		buttonGroupEngine.add(radioButtonTypeA);
		buttonGroupEngine.add(radioButtonTypeB);
		buttonGroupEngine.add(radioButtonTypeC);
		buttonGroupEngine.add(radioButtonTypeD);
		
		JLabel labelEngineType = new JLabel("Engine Type");
		labelEngineType.setHorizontalAlignment(SwingConstants.CENTER);
		labelEngineType.setFont(new Font("Futura", Font.PLAIN, 20));
		labelEngineType.setBounds(467, 521, 120, 25);
		frameSortCars.getContentPane().add(labelEngineType);
		
		radioButtonNoPreferenceMake = new JRadioButton("Any Make");
		radioButtonNoPreferenceMake.setSelected(true);
		radioButtonNoPreferenceMake.setFont(new Font("Futura", Font.PLAIN, 13));
		radioButtonNoPreferenceMake.setBounds(261, 205, 96, 23);
		frameSortCars.getContentPane().add(radioButtonNoPreferenceMake);
		
		radioButtonNoPreferenceModel = new JRadioButton("Any Model");
		radioButtonNoPreferenceModel.setSelected(true);
		radioButtonNoPreferenceModel.setFont(new Font("Futura", Font.PLAIN, 13));
		radioButtonNoPreferenceModel.setBounds(261, 256, 106, 23);
		frameSortCars.getContentPane().add(radioButtonNoPreferenceModel);
		
		JButton buttonConfirmSearch = new JButton("Search");
		buttonConfirmSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enteredMake = textFieldMake.getText();
				enteredModel = textFieldModel.getText();
				cost = Double.valueOf(textFieldPrice.getText());
				km = Float.valueOf(textFieldKMPerLitre.getText());
				year = Integer.valueOf(textFieldYear.getText());
				seats = Integer.valueOf(textFieldSeats.getText());
				HP = Integer.valueOf(textFieldHP.getText());
				weight = Double.valueOf(textFieldWeight.getText());
				wheels = Integer.valueOf(textFieldWheels.getText());
				height = Integer.valueOf(textFieldSeatHeight.getText());
		
				frameSortCars.dispose();
				SortingCarsResults.startChecking();	
		
			
			}
		});
		buttonConfirmSearch.setBounds(478, 634, 94, 29);
		frameSortCars.getContentPane().add(buttonConfirmSearch);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setForeground(Color.DARK_GRAY);
		separator_1.setBounds(373, 193, 10, 400);
		frameSortCars.getContentPane().add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(Color.DARK_GRAY);
		separator_2.setBounds(7, 289, 985, 20);
		frameSortCars.getContentPane().add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setForeground(Color.DARK_GRAY);
		separator_3.setBounds(675, 193, 10, 400);
		frameSortCars.getContentPane().add(separator_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setForeground(Color.DARK_GRAY);
		separator_4.setBounds(9, 390, 985, 20);
		frameSortCars.getContentPane().add(separator_4);
		
		separator_5 = new JSeparator();
		separator_5.setForeground(Color.DARK_GRAY);
		separator_5.setBounds(376, 498, 305, 20);
		frameSortCars.getContentPane().add(separator_5);
		
		
	}
}
