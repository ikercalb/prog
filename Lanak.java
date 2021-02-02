package Erronka2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Lanak extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected static String Lana="";
	protected static String Langilea="";
	protected static String Prezioa="";
	private JPanel contentPane;
	private JTextField Lana_testua;
	private JTextField Langile_testua;
	private JTextField PrezioaL_testua;

	protected static ArrayList<Lana_class> lanaarray = new ArrayList<Lana_class>();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lanak frame = new Lanak();
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
	public Lanak() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 225);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Lana");
		lblNewLabel.setBounds(10, 11, 126, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Langilea");
		lblNewLabel_1.setBounds(10, 46, 126, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Prezioa");
		lblNewLabel_2.setBounds(10, 81, 126, 14);
		contentPane.add(lblNewLabel_2);
		
		Lana_testua = new JTextField();
		Lana_testua.setBounds(146, 8, 278, 20);
		contentPane.add(Lana_testua);
		Lana_testua.setColumns(10);
		
		Langile_testua = new JTextField();
		Langile_testua.setBounds(146, 43, 278, 20);
		contentPane.add(Langile_testua);
		Langile_testua.setColumns(10);
		
		PrezioaL_testua = new JTextField();
		PrezioaL_testua.setBounds(146, 78, 278, 20);
		contentPane.add(PrezioaL_testua);
		PrezioaL_testua.setColumns(10);
		
		JButton btnNewButton = new JButton("Atzera");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pieza_lana frame = new pieza_lana();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(223, 129, 90, 35);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Gorde");				
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Lana_testua.getText().length()>0 && Langile_testua.getText().length()>0 && PrezioaL_testua.getText().length()>0) {
					int birpaza = JOptionPane.showConfirmDialog(null, (String)"Sartu dituzu datu guztiak ondo?","Leiho aldaketa",
					JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null);
						try {
					if(birpaza==0) {
						Lana_class lana = new Lana_class(Lana_testua.getText(),Langile_testua.getText(),Integer.parseInt(PrezioaL_testua.getText()));
						lanaarray.add(lana);
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
		btnNewButton_1.setBounds(334, 129, 90, 35);
		contentPane.add(btnNewButton_1);
	}

}
