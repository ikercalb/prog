package Erronka2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Piezak extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected static String Hornitzailea="";
	protected static String Pieza="";
	protected static String Prezioa="";
	private JPanel contentPane;
	private JTextField Hor_testua;
	private JTextField Pieza_testua;
	private JTextField PrezioaP_testua;
	
	protected static ArrayList<Pieza_class> piezaarray = new ArrayList<Pieza_class>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Piezak frame = new Piezak();
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
	public Piezak() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 225);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Hor_testua = new JTextField();
		Hor_testua.setBounds(115, 8, 296, 20);
		contentPane.add(Hor_testua);
		Hor_testua.setColumns(10);
		
		Pieza_testua = new JTextField();
		Pieza_testua.setBounds(115, 43, 296, 20);
		contentPane.add(Pieza_testua);
		Pieza_testua.setColumns(10);
		
		JButton btnNewButton = new JButton("Gorde");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Hor_testua.getText().length()>0 && Pieza_testua.getText().length()>0 && PrezioaP_testua.getText().length()>0) {
					int birpaza = JOptionPane.showConfirmDialog(null, (String)"Sartu dituzu datu guztiak ondo?","Leiho aldaketa",
					JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null);
						try {
					if(birpaza==0) {
						Pieza_class pieza = new Pieza_class(Hor_testua.getText(),Pieza_testua.getText(),Integer.parseInt(PrezioaP_testua.getText()));
						piezaarray.add(pieza);
						menu frame = new menu();
						frame.setVisible(true);
						dispose();
					}
						
				else {
					JOptionPane.showMessageDialog(null,(String)"Zerbait falta zaizu!!","Ez duzu amaitu",
						JOptionPane.INFORMATION_MESSAGE,null);
				
				}}
				
				catch(Exception e1) {
					JOptionPane.showMessageDialog(null,(String)"Zenbakiak sartu!!","Ez duzu amaitu",
							JOptionPane.INFORMATION_MESSAGE,null);
				}
				}
		}});
		btnNewButton.setBounds(321, 120, 90, 35);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Itzuli");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pieza_lana frame = new pieza_lana();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(207, 120, 90, 35);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("Pieza");
		lblNewLabel_1.setBounds(10, 46, 95, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Prezioa");
		lblNewLabel_2.setBounds(10, 81, 95, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("Hornitzailea");
		lblNewLabel.setBounds(10, 11, 95, 14);
		contentPane.add(lblNewLabel);
		
		PrezioaP_testua = new JTextField();
		PrezioaP_testua.setBounds(115, 78, 296, 20);
		contentPane.add(PrezioaP_testua);
		PrezioaP_testua.setColumns(10);
	}
}
