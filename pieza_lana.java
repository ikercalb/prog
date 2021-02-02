package Erronka2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class pieza_lana extends JFrame {

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
					pieza_lana frame = new pieza_lana();
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
	public pieza_lana() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 196);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton gorde = new JButton("Lana");
		gorde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Lanak frame = new Lanak();
				frame.setVisible(true);
				dispose();
			}
		});
		gorde.setBounds(280, 11, 144, 72);
		contentPane.add(gorde);
		
		JButton btnNewButton = new JButton("Pieza");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Piezak frame = new Piezak();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(10, 11, 144, 72);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Atzera");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menu frame = new menu();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(173, 111, 90, 35);
		contentPane.add(btnNewButton_1);

	}
}
