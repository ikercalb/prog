package Erronka2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class registro1 extends JFrame implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField bilatu_testua;
	private JTextField bilatu_testua2;
	protected static DefaultListModel<String> dlm_Nan= new DefaultListModel<String>();
	protected static DefaultListModel<String> dlm_matrikula= new DefaultListModel<String>();
	protected static ArrayList<bezero_class> bezeroarrayr = new ArrayList<bezero_class>();
	protected static ArrayList<autoa_class> autoaarrayr = new ArrayList<autoa_class>();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					registro1 frame = new registro1();
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
	public registro1() {
		setUndecorated(true);
		try {
			FileInputStream fis = new FileInputStream ("Bezeroa.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			Object o = (bezero_class)ois.readObject();
			bezeroarrayr.add((bezero_class) o);
			while(o != null) {
				 o = (bezero_class)ois.readObject();
				 bezeroarrayr.add((bezero_class) o);
			}
			
			ois.close();

		}catch(IOException | ClassNotFoundException ioe) {
			
		}	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 540, 420);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn_bilatu = new JButton("Bilatu");
		btn_bilatu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_bilatu.setBounds(172, 40, 90, 35);
		contentPane.add(btn_bilatu);
		
		JButton btn_sortu = new JButton("Sortu");
		btn_sortu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bezero_sortu frame = new bezero_sortu();
				frame.setVisible(true);
				dispose();
			}
		});
		btn_sortu.setBounds(172, 86, 90, 35);
		contentPane.add(btn_sortu);
		
		JButton btn_bilatu2 = new JButton("Bilatu");
		btn_bilatu2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_bilatu2.setBounds(421, 40, 90, 35);
		contentPane.add(btn_bilatu2);
		
		JButton btn_sortu2 = new JButton("Sortu");
		btn_sortu2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				autoa_sortu frame = new autoa_sortu();
				frame.setVisible(true);
				dispose();
			}
		});
		btn_sortu2.setBounds(421, 86, 90, 35);
		contentPane.add(btn_sortu2);
		
		JButton btn_atzera = new JButton("Itzuli");
		btn_atzera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				harrera_menua frame = new harrera_menua();
				frame.setVisible(true);
				dispose();
			}
		});
		btn_atzera.setBounds(223, 333, 89, 35);
		contentPane.add(btn_atzera);
		
		JButton btn_OT = new JButton("Sartu OT");
		btn_OT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OT1 frame = new OT1();
				frame.setVisible(true);
				dispose();
			}
		});
		btn_OT.setBounds(322, 333, 89, 35);
		contentPane.add(btn_OT);
		
		bilatu_testua = new JTextField();
		bilatu_testua.setBounds(10, 41, 136, 34);
		contentPane.add(bilatu_testua);
		bilatu_testua.setColumns(10);
		
		bilatu_testua2 = new JTextField();
		bilatu_testua2.setBounds(275, 41, 136, 34);
		contentPane.add(bilatu_testua2);
		bilatu_testua2.setColumns(10);
		
		JLabel Label_nan = new JLabel("Bezeroa NAN, NIE edo IFK");
		Label_nan.setBounds(10, 16, 155, 14);
		contentPane.add(Label_nan);
		
		JLabel Label_autoa = new JLabel("Autoa matrikula");
		Label_autoa.setBounds(275, 16, 136, 14);
		contentPane.add(Label_autoa);
		
		JList<String> list = new JList<String>();
		list.setModel(dlm_Nan);
		list.setBounds(10, 86, 136, 222);
		contentPane.add(list);
		
		JList<String> list_1 = new JList<String>();
		list_1.setModel(dlm_matrikula);
		list_1.setBounds(275, 86, 136, 222);
		contentPane.add(list_1);
		
		JButton btn_atzera_1 = new JButton("Faktura");
		btn_atzera_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				faktura_aukeratu frame = new faktura_aukeratu();
				frame.setVisible(true);
				dispose();
			}
		});
		btn_atzera_1.setBounds(422, 333, 89, 35);
		contentPane.add(btn_atzera_1);
		
		if(bezero_sortu.bezeroarray.size()>0) {
			for(int p=0;p<bezero_sortu.bezeroarray.size();p++) {
				if(dlm_Nan.contains(bezero_sortu.bezeroarray.get(p).getNan())){
					
				}
				else {
					dlm_Nan.addElement(bezero_sortu.bezeroarray.get(p).getNan());
				}
			}
		}
		if(registro1.bezeroarrayr.size()>0) {
			for(int p=0;p<registro1.bezeroarrayr.size();p++) {
				if(dlm_Nan.contains(registro1.bezeroarrayr.get(p).getNan())){
					
				}
				else {
					dlm_Nan.addElement(registro1.bezeroarrayr.get(p).getNan());
				}
			}
		}
		if(autoa_sortu.autoaarray.size()>0) {
			for(int p=0;p<autoa_sortu.autoaarray.size();p++) {
				if(dlm_matrikula.contains(autoa_sortu.autoaarray.get(p).getMatrikula())){
					
				}
				else {
					dlm_matrikula.addElement(autoa_sortu.autoaarray.get(p).getMatrikula());
				}
			}
		}
		if(registro1.autoaarrayr.size()>0) {
			for(int p=0;p<registro1.autoaarrayr.size();p++) {
				if(dlm_matrikula.contains(registro1.autoaarrayr.get(p).getMatrikula())){
					
				}
				else {
					dlm_matrikula.addElement(registro1.autoaarrayr.get(p).getMatrikula());
				}
			}
		}
	}
}
