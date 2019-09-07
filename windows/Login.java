package windows;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.io.FileNotFoundException;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

import accounts.VerifyIdentity;


import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Login {

	
	
	protected static JFrame frameLogin;
	
	private JTextField textFieldUsername;
	private JTextField textFieldPassword;

	
	public static void initialize() {
		
		Login window = new Login();
		window.frameLogin.setVisible(true);
		
		

		
	}

	public Login() { 
		contents();
		
	}
	
	private void contents() {
		
		
		frameLogin = new JFrame();
		frameLogin.setBounds(200, 50, 1000, 750);
		frameLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameLogin.getContentPane().setLayout(null);
		
		JLabel labelTitle = new JLabel("Cars & You");
		labelTitle.setForeground(Color.DARK_GRAY);
		labelTitle.setFont(new Font("Futura", Font.BOLD, 30));
		labelTitle.setHorizontalAlignment(SwingConstants.CENTER);
		labelTitle.setBounds(6, 51, 988, 45);
		frameLogin.getContentPane().add(labelTitle);
		
		JLabel labelSubtitle = new JLabel("Login");
		labelSubtitle.setForeground(Color.GRAY);
		labelSubtitle.setFont(new Font("Futura", Font.PLAIN, 20));
		labelSubtitle.setHorizontalAlignment(SwingConstants.CENTER);
		labelSubtitle.setBounds(447, 101, 75, 31);
		frameLogin.getContentPane().add(labelSubtitle);
		
		JLabel imageKey = new JLabel("");
		imageKey.setIcon(new ImageIcon(Login.class.getResource("/resources/key.png")));
		imageKey.setBounds(520, 101, 82, 31);
		frameLogin.getContentPane().add(imageKey);
		
		JLabel labelUsername = new JLabel("Username");
		labelUsername.setHorizontalAlignment(SwingConstants.CENTER);
		labelUsername.setBounds(189, 226, 265, 16);
		frameLogin.getContentPane().add(labelUsername);
		
		JLabel labelPassword = new JLabel("Password");
		labelPassword.setHorizontalAlignment(SwingConstants.CENTER);
		labelPassword.setBounds(189, 299, 265, 16);
		frameLogin.getContentPane().add(labelPassword);
		
		textFieldUsername = new JTextField();
		textFieldUsername.setBounds(423, 221, 296, 26);
		frameLogin.getContentPane().add(textFieldUsername);
		
		
		textFieldPassword = new JPasswordField();
		textFieldPassword.setBounds(423, 294, 296, 26);
		frameLogin.getContentPane().add(textFieldPassword);
		
		JButton buttonLogin = new JButton("Login");
		buttonLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String username = textFieldUsername.getText();
				String password = textFieldPassword.getText();
				
				if (username.equals("")) { JOptionPane.showMessageDialog(frameLogin, "Please enter a username"); }
				
				else if (password.equals("")) { JOptionPane.showMessageDialog(frameLogin, "Please enter a password"); }
				
				else {
					try { VerifyIdentity.loggingIn(username, password); } 
					catch (FileNotFoundException e1) { e1.printStackTrace(); }
					
					if (VerifyIdentity.getConfirmation() == true) {
						HomePage.initialize();
						frameLogin.dispose();
					}
				}
				
			}
		});
		buttonLogin.setBounds(447, 410, 117, 29);
		frameLogin.getContentPane().add(buttonLogin);
		
		JButton buttonCreateAccount = new JButton("Create Account");
		buttonCreateAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CreateAccount.initialize();
				frameLogin.dispose();
			}
		});
		buttonCreateAccount.setBounds(428, 559, 157, 29);
		frameLogin.getContentPane().add(buttonCreateAccount);
		
		JButton btnNewButton = new JButton("Exit Cars.com");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton.setBounds(6, 6, 117, 29);
		frameLogin.getContentPane().add(btnNewButton);
		
		
	}

	
	
	
}
