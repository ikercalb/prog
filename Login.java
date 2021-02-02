 package Erronka2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPasswordField passwordField;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		//
		
		try {
			FileInputStream fis = new FileInputStream ("Langileak.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			Object o = (langilea_class)ois.readObject();
			erabiltzaile_berria.langileaarray.add((langilea_class) o);
			while(o != null) {
				 o = (langilea_class)ois.readObject();
				 erabiltzaile_berria.langileaarray.add((langilea_class) o);
			}
			
			ois.close();

		}catch(IOException | ClassNotFoundException ioe) {
			
		}	
		
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Sartu");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//erabiltzaile_berria.langileaarray
				for(int i=0;i<erabiltzaile_berria.langileaarray.size();i++) {
					if(textField.getText().equals(erabiltzaile_berria.langileaarray.get(i).getErabiltzailea())&&(passwordField.getText().equals(erabiltzaile_berria.langileaarray.get(i).getPasahitza()))){
					
						if(erabiltzaile_berria.langileaarray.get(i).getMota().equals("admin")) {
							menu frame = new menu();
							frame.setVisible(true);
							dispose();
						} 
						if(erabiltzaile_berria.langileaarray.get(i).getMota().equals("Harrera")) {
							harrera_menua frame = new harrera_menua();
							frame.setVisible(true);
							dispose();
						}
						if(erabiltzaile_berria.langileaarray.get(i).getMota().equals("Mekanikaria")) {
							mekaniko_menua frame = new mekaniko_menua();
							frame.setVisible(true);
							dispose();
						}
					}
					
					else {
							JOptionPane.showMessageDialog(null,(String)"txarto dago","Pasahitza edo erabiltzailea txarto dago",
									JOptionPane.INFORMATION_MESSAGE,null);
						
					}
				} 
			}
		});
		btnNewButton.setBounds(323, 205, 90, 35);
		contentPane.add(btnNewButton);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(168, 167, 174, 24);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel = new JLabel("Erabiltzailea");
		lblNewLabel.setBounds(45, 129, 113, 28);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Pasahitza");
		lblNewLabel_1.setBounds(45, 168, 113, 23);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(168, 131, 174, 24);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBounds(45, 11, 356, 107);
		contentPane.add(panel);
	}

	
	


}
