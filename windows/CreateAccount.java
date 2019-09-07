package windows;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import accounts.Accounts;
import accounts.VerifyIdentity;

import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class CreateAccount {

	private JFrame frameCreateAccount;
	
	private JTextField textFieldUsername;
	private JTextField textFieldPassword;
	
	public String enteredUsername;
	public String enteredPassword;
	

	public static void initialize() {
		
		CreateAccount window = new CreateAccount();
		window.frameCreateAccount.setVisible(true);
	}

	public CreateAccount() { contents(); }

	private void contents() {
		
		frameCreateAccount = new JFrame();
		frameCreateAccount.setBounds(200, 50, 1000, 750);
		frameCreateAccount.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameCreateAccount.getContentPane().setLayout(null);
		
		JLabel labelTitle = new JLabel("Cars & You");
		labelTitle.setForeground(Color.DARK_GRAY);
		labelTitle.setFont(new Font("Futura", Font.BOLD, 30));
		labelTitle.setHorizontalAlignment(SwingConstants.CENTER);
		labelTitle.setBounds(6, 51, 988, 45);
		frameCreateAccount.getContentPane().add(labelTitle);
		
		JLabel labelSubtitle = new JLabel("Create Account");
		labelSubtitle.setForeground(Color.GRAY);
		labelSubtitle.setFont(new Font("Futura", Font.PLAIN, 20));
		labelSubtitle.setHorizontalAlignment(SwingConstants.CENTER);
		labelSubtitle.setBounds(407, 101, 157, 31);
		frameCreateAccount.getContentPane().add(labelSubtitle);
		
		JLabel imageKey = new JLabel("");
		imageKey.setHorizontalAlignment(SwingConstants.CENTER);
		imageKey.setIcon(new ImageIcon(CreateAccount.class.getResource("/resources/teamwork.png")));
		imageKey.setBounds(547, 101, 57, 31);
		frameCreateAccount.getContentPane().add(imageKey);
		
		JLabel labelUsername = new JLabel("Username");
		labelUsername.setHorizontalAlignment(SwingConstants.CENTER);
		labelUsername.setBounds(189, 226, 265, 16);
		frameCreateAccount.getContentPane().add(labelUsername);
		
		JLabel labelPassword = new JLabel("Password");
		labelPassword.setHorizontalAlignment(SwingConstants.CENTER);
		labelPassword.setBounds(189, 299, 265, 16);
		frameCreateAccount.getContentPane().add(labelPassword);
		
		textFieldUsername = new JTextField();
		textFieldUsername.setBounds(423, 221, 296, 26);
		frameCreateAccount.getContentPane().add(textFieldUsername);
		
		
		textFieldPassword = new JPasswordField();
		textFieldPassword.setBounds(423, 294, 296, 26);
		frameCreateAccount.getContentPane().add(textFieldPassword);
		
		JButton buttonLogin = new JButton("Create");
		buttonLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = textFieldUsername.getText();
				String password = textFieldPassword.getText();
				
				if (username.equals("")) { JOptionPane.showMessageDialog(frameCreateAccount, "Please enter a username"); }
				
				else if (password.equals("")) { JOptionPane.showMessageDialog(frameCreateAccount, "Please enter a password"); }
				
				else {
					JOptionPane.showMessageDialog(frameCreateAccount, "Successfully Created an Account!");
					try { new Accounts(username, password); } 
					catch (IOException e1) { e1.printStackTrace(); }
				}
			}
		});
		buttonLogin.setBounds(447, 410, 117, 29);
		frameCreateAccount.getContentPane().add(buttonLogin);
		
		JButton buttonCreateAccount = new JButton("Return to Login");
		buttonCreateAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login.initialize();
				frameCreateAccount.dispose();
			}
		});
		buttonCreateAccount.setBounds(428, 559, 157, 29);
		frameCreateAccount.getContentPane().add(buttonCreateAccount);
		
	}

}
