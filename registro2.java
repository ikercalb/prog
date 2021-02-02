package Erronka2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class registro2 extends JFrame {

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
					registro2 frame = new registro2();
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
	public registro2() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Aukeratu egin beharreko lana ");
		lblNewLabel.setBounds(10, 12, 397, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Itzuli");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mekaniko_menua frame = new mekaniko_menua();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(201, 214, 90, 35);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Sartu OT2");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OT2 frame = new OT2();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(315, 214, 97, 35);
		contentPane.add(btnNewButton_1);
		
		JList<String> list = new JList<String>();
		list.setBounds(20, 37, 118, 166);
		contentPane.add(list);
		
		JList<String> list_1 = new JList<String>();
		list_1.setBounds(160, 37, 250, 166);
		contentPane.add(list_1);
	}
}
