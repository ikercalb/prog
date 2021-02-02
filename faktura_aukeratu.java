package Erronka2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class faktura_aukeratu extends JFrame {

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
					faktura_aukeratu frame = new faktura_aukeratu();
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
	public faktura_aukeratu() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 230);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JList<String> list = new JList<String>();
		list.setBounds(10, 11, 257, 162);
		contentPane.add(list);
		
		JButton btn_aukeratu = new JButton("Aukeratu");
		btn_aukeratu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Faktura frame = new Faktura();
				frame.setVisible(true);
				dispose();
			}
		});
		btn_aukeratu.setBounds(307, 11, 90, 35);
		contentPane.add(btn_aukeratu);
		
		JButton btn_itzuli = new JButton("Itzuli");
		btn_itzuli.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				harrera_menua frame = new harrera_menua();
				frame.setVisible(true);
				dispose();
			}
		});
		btn_itzuli.setBounds(307, 138, 90, 35);
		contentPane.add(btn_itzuli);
	}
}
