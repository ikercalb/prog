package Erronka2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.awt.event.ActionEvent;

public class admin extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	protected static DefaultListModel<String> dlm_erabiltzailea= new DefaultListModel<String>();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					admin frame = new admin();
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
	public admin() {
		setUndecorated(true);
		if(erabiltzaile_berria.langileaarray.size()>0) {
			for(int p=0;p<erabiltzaile_berria.langileaarray.size();p++) {
				if(dlm_erabiltzailea.contains(erabiltzaile_berria.langileaarray.get(p).getErabiltzailea())){
					
				}
				else {
					dlm_erabiltzailea.addElement(erabiltzaile_berria.langileaarray.get(p).getErabiltzailea());
				}
				
			}
		}
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label_erabiltzailea = new JLabel("Erabiltzaileak");
		label_erabiltzailea.setBounds(15, 5, 116, 32);
		contentPane.add(label_erabiltzailea);
		
		JList<String> list = new JList<String>();
		list.setModel(dlm_erabiltzailea);
		list.setBounds(15, 48, 257, 202);
		contentPane.add(list);
		
		JButton btn_berria = new JButton("Berria");
		btn_berria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				erabiltzaile_berria frame = new erabiltzaile_berria();
				frame.setVisible(true);
				dispose();
			}
		});
		btn_berria.setBounds(300, 48, 90, 35);
		contentPane.add(btn_berria);
		
		JButton btn_ezabatu = new JButton("Ezabatu");
		btn_ezabatu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btn_ezabatu.setBounds(300, 94, 90, 35);
		contentPane.add(btn_ezabatu);
		
		JButton btn_atzera = new JButton("Itzuli");
		btn_atzera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					FileOutputStream fos = new FileOutputStream ("Langileak.txt");
					ObjectOutputStream oos=new ObjectOutputStream(fos);
					for(int b=0;b<erabiltzaile_berria.langileaarray.size();b++) {
						oos.writeObject(erabiltzaile_berria.langileaarray.get(b));
					}
					oos.close();

				}catch(IOException ioe) {
					
				}
				
				
				menu frame = new menu();
				frame.setVisible(true);
				dispose();
			}
		});
		btn_atzera.setBounds(300, 140, 90, 35);
		contentPane.add(btn_atzera);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			Login frame = new Login();
			frame.setVisible(true);
			dispose();
			}
		});
		btnNewButton.setBounds(301, 200, 89, 23);
		contentPane.add(btnNewButton);
		
		
	}
}
