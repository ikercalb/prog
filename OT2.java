package Erronka2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class OT2 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OT2 frame = new OT2();
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
	public OT2() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 540, 611);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Gorde");
		btnNewButton.setBounds(74, 526, 89, 35);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Itzuli");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				registro2 frame = new registro2();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(208, 526, 89, 35);
		contentPane.add(btnNewButton_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("BAI/EZ");
		rdbtnNewRadioButton.setBounds(424, 440, 82, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JLabel lblNewLabel = new JLabel("Konponketa");
		lblNewLabel.setBounds(10, 291, 112, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("OT1 \u201Carazoa\u201D");
		lblNewLabel_1.setBounds(74, 191, 124, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("Data");
		lblNewLabel_3.setBounds(74, 166, 112, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("IdLana");
		lblNewLabel_4.setBounds(74, 141, 112, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Langilea");
		lblNewLabel_5.setBounds(74, 116, 112, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Auto");
		lblNewLabel_6.setBounds(208, 116, 199, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Auto");
		lblNewLabel_7.setBounds(208, 141, 199, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Auto");
		lblNewLabel_8.setBounds(208, 166, 199, 14);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Erabilgailua (vehiculo)");
		lblNewLabel_9.setBounds(208, 40, 199, 14);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Bezeroa");
		lblNewLabel_10.setBounds(208, 65, 199, 14);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Konponketak");
		lblNewLabel_11.setBounds(74, 65, 112, 14);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("LAN AGINDUA (OT) 2");
		lblNewLabel_12.setBounds(74, 33, 112, 28);
		contentPane.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Eginda");
		lblNewLabel_13.setBounds(424, 419, 46, 14);
		contentPane.add(lblNewLabel_13);
		
		JList<String> list = new JList<String>();
		list.setBounds(208, 191, 199, 69);
		contentPane.add(list);
		
		JButton btnNewButton_2 = new JButton("Sartu");
		btnNewButton_2.setBounds(417, 281, 89, 35);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("Sartu");
		btnNewButton_2_1.setBounds(417, 327, 89, 35);
		contentPane.add(btnNewButton_2_1);
		
		JComboBox<String> comboBox_1 = new JComboBox<String>();
		comboBox_1.setBounds(106, 281, 201, 35);
		contentPane.add(comboBox_1);
		
		JComboBox<String> comboBox_1_1 = new JComboBox<String>();
		comboBox_1_1.setBounds(106, 327, 201, 35);
		contentPane.add(comboBox_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("Piezak");
		lblNewLabel_2.setBounds(10, 337, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JList<String> list_1 = new JList<String>();
		list_1.setBounds(106, 373, 201, 132);
		contentPane.add(list_1);
		
		JList<String> list_2 = new JList<String>();
		list_2.setBounds(317, 373, 90, 132);
		contentPane.add(list_2);
		
		JButton btnNewButton_2_1_1 = new JButton("Ezabatu");
		btnNewButton_2_1_1.setBounds(417, 373, 89, 35);
		contentPane.add(btnNewButton_2_1_1);
		
		textField = new JTextField();
		textField.setBounds(317, 280, 90, 35);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(317, 327, 90, 35);
		contentPane.add(textField_1);
	}
}
