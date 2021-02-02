package Erronka2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class harrera_menua extends JFrame {

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
					harrera_menua frame = new harrera_menua();
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
	public harrera_menua() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 565, 143);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn_harrera = new JButton("Erregistro harrera");
		btn_harrera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				registro1 frame = new registro1();
				frame.setVisible(true);
				dispose();
			}
		});
		btn_harrera.setBounds(10, 49, 165, 35);
		contentPane.add(btn_harrera);
		
		JButton btn_itxi = new JButton("Itxi");
		btn_itxi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btn_itxi.setBounds(420, 49, 119, 35);
		contentPane.add(btn_itxi);
		
		JButton btn_faktura = new JButton("Faktura");
		btn_faktura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				faktura_aukeratu frame = new faktura_aukeratu();
				frame.setVisible(true);
				dispose();
			}
		});
		btn_faktura.setBounds(185, 49, 165, 35);
		contentPane.add(btn_faktura);
		
		JLabel Label_izena = new JLabel("Kaixo \u201CErabiltzailearen izena\u201D");
		Label_izena.setBounds(10, 11, 285, 27);
		contentPane.add(Label_izena);
	}

}
