package Erronka2;

public abstract class PiezaLana_class {
	protected String Izena;
	protected int Prezioa;
	
 PiezaLana_class() {
	 this.Izena = "";
	 this.Prezioa = 0;
 }
 
 PiezaLana_class(String Izena, int Prezioa) {
	 
	 this.Izena = Izena;
	 this.Prezioa = Prezioa;
 }

public String getIzena() {
	return Izena;
}

public void setIzena(String izena) {
	Izena = izena;
}

public int getPrezioa() {
	return Prezioa;
}

public void setPrezioa(int prezioa) {
	Prezioa = prezioa;
}
 
}
