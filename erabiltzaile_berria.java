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
import javax.swing.JComboBox;

public class erabiltzaile_berria extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected static String Izena="";
	protected static String Abizena="";
	protected static String NAN="";
	protected static String CIF="";
	protected static String NIE="";
	protected static String Erabiltzailea="";
	protected static String pasahitza="";
	protected static String pasahitza2="";
	protected static boolean x;
	protected static char c;
	private JComboBox<String> Dokumentazio_box;
	private JPanel contentPane;
	private JTextField Erabiltzaile_testua;
	private JButton btn_sortu;
	private JTextField Abizena_testua;
	private JTextField Izena_testua;
	private JTextField Dokumentazio_testua;
	private JTextField Pasahitza1_testua;
	private JTextField Pasahitza2_testua;
	private JButton btnNewButton;
	private JComboBox Mota_box;
	protected static ArrayList<langilea_class> langileaarray = new ArrayList<langilea_class>();
	protected static ArrayList<langilea_class> langileaarrayr = new ArrayList<langilea_class>();
	private boolean nankomp=false;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					erabiltzaile_berria frame = new erabiltzaile_berria();
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
	public erabiltzaile_berria() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 410);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Label_erabiltzailea = new JLabel("Erabiltzailea");
		Label_erabiltzailea.setBounds(10, 37, 119, 14);
		contentPane.add(Label_erabiltzailea);
		
		JLabel Label_pasahitza = new JLabel("Pasahitza");
		Label_pasahitza.setBounds(10, 77, 119, 14);
		contentPane.add(Label_pasahitza);
		
		JLabel Label_pasahitza2 = new JLabel("Pasahitza Errepikatu");
		Label_pasahitza2.setBounds(10, 117, 119, 17);
		contentPane.add(Label_pasahitza2);
		
		Erabiltzaile_testua = new JTextField();
		Erabiltzaile_testua.setBounds(139, 34, 158, 20);
		contentPane.add(Erabiltzaile_testua);
		Erabiltzaile_testua.setColumns(10);
		
		btn_sortu = new JButton("Sortu");
		btn_sortu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(langileaarray.size()>0) {
					nankomp=false;
					
					for(int i=0;i<langileaarray.size() && nankomp==false ;i++) {	
					
						if(Erabiltzaile_testua.getText().equals(langileaarray.get(i).getErabiltzailea())) {
						nankomp=true;		
					
					}}
					
					
				}
				
				if(nankomp==false&&Erabiltzaile_testua.getText().length()>0 && Izena_testua.getText().length()>0 && Abizena_testua.getText().length()>0 && Dokumentazio_testua.getText().length()>0 && Pasahitza1_testua.getText().length()>0 && Pasahitza2_testua.getText().length()>0 && Pasahitza1_testua.getText().equals(Pasahitza2_testua.getText())&& KonprobatzaileaDokumentazioa()==true) {
					int birpaza = JOptionPane.showConfirmDialog(null, (String)"Sartu dituzu datu guztiak ondo?","Leiho aldaketa",
					JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null);
						try {
					if (birpaza==0) {
				langilea_class langilea= new langilea_class(Izena_testua.getText(),Abizena_testua.getText(),Dokumentazio_testua.getText(),Erabiltzaile_testua.getText(),Pasahitza1_testua.getText(),Mota_box.getSelectedItem().toString());
				langileaarray.add(langilea);
				
				langilea_class langilear= new langilea_class(Izena_testua.getText(),Abizena_testua.getText(),Dokumentazio_testua.getText(),Erabiltzaile_testua.getText(),Pasahitza1_testua.getText(),Mota_box.getSelectedItem().toString());
				langileaarrayr.add(langilear);
				
								admin frame = new admin();
								frame.setVisible(true);
								dispose();
							}
								
				else {
					JOptionPane.showMessageDialog(null,(String)"Zerbait falta zaizu!!","Ez duzu amaitu",
							JOptionPane.INFORMATION_MESSAGE,null);
					}}
			
				catch(Exception e1) {
					JOptionPane.showMessageDialog(null,(String)"txarto dago","Ez duzu amaitu",
					JOptionPane.INFORMATION_MESSAGE,null);
				}
				}
			}});
		btn_sortu.setBounds(334, 325, 90, 35);
		contentPane.add(btn_sortu);
		
		JLabel Label_mota = new JLabel("Mota");
		Label_mota.setBounds(10, 157, 119, 14);
		contentPane.add(Label_mota);
		
		Mota_box = new JComboBox();
		Mota_box.addItem("Mekanikaria");
		Mota_box.addItem("Harrera");
		Mota_box.addItem("admin");
		Mota_box.setBounds(139, 154, 158, 20);
		contentPane.add(Mota_box);
		
		Abizena_testua = new JTextField();
		Abizena_testua.setBounds(139, 234, 158, 20);
		contentPane.add(Abizena_testua);
		Abizena_testua.setColumns(10);
		
		Izena_testua = new JTextField();
		Izena_testua.setBounds(139, 194, 158, 20);
		contentPane.add(Izena_testua);
		Izena_testua.setColumns(10);
		
		Dokumentazio_testua = new JTextField();
		Dokumentazio_testua.setBounds(139, 274, 158, 20);
		contentPane.add(Dokumentazio_testua);
		Dokumentazio_testua.setColumns(10);
		
		Dokumentazio_box = new JComboBox<String>();
		Dokumentazio_box.addItem("NAN");
		Dokumentazio_box.addItem("NIE");
		Dokumentazio_box.addItem("IFK");
		Dokumentazio_box.setBounds(10, 274, 119, 20);
		contentPane.add(Dokumentazio_box);
		
		JLabel Label_abizena = new JLabel("Abizena");
		Label_abizena.setBounds(10, 237, 119, 14);
		contentPane.add(Label_abizena);
		
		JLabel Label_izena = new JLabel("Izena");
		Label_izena.setBounds(10, 197, 119, 14);
		contentPane.add(Label_izena);
		
		Pasahitza1_testua = new JTextField();
		Pasahitza1_testua.setBounds(139, 74, 158, 20);
		contentPane.add(Pasahitza1_testua);
		Pasahitza1_testua.setColumns(10);
		
		Pasahitza2_testua = new JTextField();
		Pasahitza2_testua.setBounds(139, 114, 158, 20);
		contentPane.add(Pasahitza2_testua);
		Pasahitza2_testua.setColumns(10);
		
		btnNewButton = new JButton("Itzuli");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				admin frame = new admin();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(234, 325, 90, 35);
		contentPane.add(btnNewButton);
	}
	private boolean KonprobatzaileaDokumentazioa() {//Funtzio hau konprobatuko du combo box-an zein akueratu den eta Faktura6-an JLabel-a aldatuko du 
		boolean Konpr=true; 
		if(Dokumentazio_box.getSelectedIndex()==0) {
			if(NAN_Konprobatzailea()==true) {
				Konpr=true;
			}
			else {
				Konpr=false;
			}
		}
		else if(Dokumentazio_box.getSelectedIndex()==1) {
			if(NIE_Konprobatzailea()==true) {
				Konpr=true;
			}
			else {
				
				
				Konpr=false;
			}
		}
		else if(Dokumentazio_box.getSelectedIndex()==2) {
			if(CIF_Konprobatzailea()==true) {
				Konpr=true;
			}
			else {
				Konpr=false;
			}
		}
		return Konpr;
	}
	private boolean NAN_Konprobatzailea() {//Funtzio hau konprobatuko du NAN-a aukeratzean ea 9 digito dauden, lehengo 8 digitoak zenbakiak direla, azken digitoa letra bat dela eta ea letra hori letra kontrolaren berdina dela
		NAN=Dokumentazio_testua.getText();
		int resto=0;
		char Letra = 0;
		int sum;
		char Letra_array;
		char[] letrak={'T' ,'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E' };
		
		x = true;
		if (NAN.length()==9) {
			for (int y = 0; y <=7 && x==true; y++) {
				c = NAN.charAt(y); 
				if(c>='0'&& c<='9') {
					x=true;
				}
				else {
	        	x=false;
				}
			}
			c = NAN.charAt(8); 
			if ((c >= 'A' && c <= 'Z') && x==true) {
	           x=true;
	           Letra=NAN.charAt(8);
	        }
	        else {
	        	x=false;
	        }
			sum=Integer.parseInt(erabiltzaile_berria.NAN.substring(0,8));
			resto=sum % 23;
			Letra_array=letrak[resto];
			if(Letra==Letra_array && x==true) {
				x=true;
			}
			else {
				x=false;
			}
		}
		else {
			x=false;
		}
		
			
		return x;
	}
	private boolean CIF_Konprobatzailea() {////Funtzio hau konprobatuko du CIF-a aukeratzean ea 9 digito dauden eta ea lehengoa letra dela eta beste guztiak zenbakiak
		CIF=Dokumentazio_testua.getText();
		x=true;
		if (CIF.length()==9) {
			c = CIF.charAt(0); 
			if ((c >= 'A' && c <= 'Z') && x==true) {
	           x=true;
	        }
	        else {
	        	x=false;
	        }
			for (int y = 1; y <=8 && x==true; y++) {
				c = CIF.charAt(y); 
				if(c>='0'&& c<='9') {
					x=true;
				}
				else {
					x=false;
				}
			}
		}
		else {
			x=false;
		}	
		return x;
	}
	private boolean NIE_Konprobatzailea() {//Funtzio hau konprobatuko du NIE 9 digitoak badira, X,Y edo Z-rekin hasten bada gero 7 digitoak zenbakiak badira eta azken digito letra bat dela eta letra kontroladorea den
		NIE=Dokumentazio_testua.getText();
		int resto=0;
		char Letra = 0;
		int sum;
		char Letra_array;
		char[] letrak={'T' ,'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E' };
		x=true;
		if (NIE.length()==9) {
			c = NIE.charAt(0); 
			if ((c =='X' || c <= 'Y'|| c <= 'Z') && x==true) {
	           x=true;
	        }
	        else {
	        	x=false;
	        }
			for (int y = 1; y <=7 && x==true; y++) {
				c = NIE.charAt(y); 
	        	if(c>='0'&& c<='9') {
	        		x=true;
	        	}
	        	else {
	        		x=false;
	        	}
			}
			c = NIE.charAt(8); 
			if ((c >= 'A' && c <= 'Z') && x==true) {
				 Letra=NIE.charAt(8);
				x=true;
			}
			else {
				x=false;
			}
			sum=Integer.parseInt(erabiltzaile_berria.NIE.substring(1,8));
			resto=sum % 23;
			Letra_array=letrak[resto];
			if(Letra==Letra_array && x==true) {
				x=true;
			}
			else {
				x=false;
			}
		}
		else {
			x=false;
		}
		return x;
	}
}
