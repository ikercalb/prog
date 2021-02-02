package Erronka2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;

public class OT1 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OT1 frame = new OT1();
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
	public OT1() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 410);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Gorde");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(450, 306, 124, 35);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Itzuli");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				registro1 frame = new registro1();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(242, 306, 124, 35);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Erabilgailua (vehiculo)");
		lblNewLabel.setBounds(250, 30, 213, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Auto");
		lblNewLabel_1.setBounds(250, 94, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Auto");
		lblNewLabel_2.setBounds(250, 119, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Auto");
		lblNewLabel_3.setBounds(250, 144, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_5 = new JLabel("Langilea");
		lblNewLabel_5.setBounds(46, 94, 77, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("IdLana");
		lblNewLabel_6.setBounds(46, 119, 77, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Data");
		lblNewLabel_7.setBounds(46, 144, 77, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Arazoak");
		lblNewLabel_8.setBounds(46, 180, 77, 14);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("LAN AGINDUA (OT) 1");
		lblNewLabel_9.setBounds(46, 30, 185, 58);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_12 = new JLabel("Bezeroa");
		lblNewLabel_12.setBounds(250, 55, 213, 14);
		contentPane.add(lblNewLabel_12);
		
		textField_1 = new JTextField();
		textField_1.setBounds(250, 177, 213, 35);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton_3 = new JButton("Sartu");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setBounds(473, 176, 101, 35);
		contentPane.add(btnNewButton_3);
		
		JList<String> list_1 = new JList<String>();
		list_1.setBounds(250, 223, 213, 58);
		contentPane.add(list_1);
		
		JButton btnNewButton_4 = new JButton("Ezabatu");
		btnNewButton_4.setBounds(473, 222, 101, 35);
		contentPane.add(btnNewButton_4);
	}
}
