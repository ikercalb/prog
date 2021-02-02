package Erronka2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class menu extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menu frame = new menu();
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
	public menu() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 593, 194);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Harrera");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				harrera_menua frame = new harrera_menua();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(10, 40, 130, 35);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Faktura");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				faktura_aukeratu frame = new faktura_aukeratu();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(434, 40, 130, 35);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Mekanikoa");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mekaniko_menua frame = new mekaniko_menua();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setBounds(150, 40, 130, 35);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_4 = new JButton("Administradorea");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				admin frame = new admin();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton_4.setBounds(294, 40, 130, 35);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Itxi");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_5.setBounds(434, 86, 130, 35);
		contentPane.add(btnNewButton_5);
		
		JLabel lblNewLabel = new JLabel("nombre del usuario xd");
		lblNewLabel.setBounds(197, 11, 190, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_3 = new JButton("Pieza/Lana");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pieza_lana frame = new pieza_lana();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton_3.setBounds(10, 86, 130, 35);
		contentPane.add(btnNewButton_3);
	}
}
