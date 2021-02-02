package Erronka2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.awt.event.ActionEvent;


public class Faktura extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Faktura frame = new Faktura();
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
	public Faktura() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 539);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_2 = new JButton("Ezabatu");
		btnNewButton_2.setBounds(319, 226, 90, 35);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("????");
		btnNewButton_3.setBounds(77, 454, 104, 35);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Itzuli");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				faktura_aukeratu frame = new faktura_aukeratu();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton_4.setBounds(191, 454, 104, 35);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("PDF Sortu");
		btnNewButton_5.setBounds(305, 454, 104, 35);
		contentPane.add(btnNewButton_5);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 226, 171, 124);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(191, 226, 104, 125);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(191, 362, 104, 35);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(191, 408, 104, 35);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(305, 408, 104, 35);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Totala");
		lblNewLabel.setBounds(120, 372, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("BEZ-a");
		lblNewLabel_1.setBounds(120, 418, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Totala");
		lblNewLabel_2.setBounds(305, 383, 86, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\u20AC");
		lblNewLabel_3.setBounds(191, 201, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Lanak");
		lblNewLabel_4.setBounds(10, 201, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("OT lan agindua");
		lblNewLabel_5.setBounds(10, 146, 86, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Datuak ibilgailua");
		lblNewLabel_6.setBounds(10, 121, 86, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Datuak bezeroa");
		lblNewLabel_7.setBounds(10, 96, 86, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Auto");
		lblNewLabel_8.setBounds(191, 96, 233, 14);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Auto");
		lblNewLabel_9.setBounds(191, 121, 233, 14);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Auto");
		lblNewLabel_10.setBounds(191, 146, 233, 14);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Datuak rekord autoak");
		lblNewLabel_11.setBounds(10, 11, 141, 14);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Faktura zkia");
		lblNewLabel_12.setBounds(10, 36, 141, 14);
		contentPane.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Auto");
		lblNewLabel_13.setBounds(191, 11, 233, 14);
		contentPane.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("Auto");
		lblNewLabel_14.setBounds(191, 36, 233, 14);
		contentPane.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("Data");
		lblNewLabel_15.setBounds(10, 61, 141, 14);
		contentPane.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel(""+LocalDate.now());
		lblNewLabel_16.setBounds(191, 61, 233, 14);
		contentPane.add(lblNewLabel_16);
	}
}
