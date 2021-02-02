package Erronka2;

public class Pieza_class extends PiezaLana_class{
	protected String Hornitzailea;
	
 Pieza_class(){
	this.Hornitzailea = "";
 }

 Pieza_class(String Pieza, String Hornitzailea, int prezioa){
	super(Pieza, prezioa);
	this.Hornitzailea = Hornitzailea;
 }
 
 public String getHornitzailea() {
	return Hornitzailea;
 }

 public void setHornitzailea(String hornitzailea) {
	Hornitzailea = hornitzailea;
 }

}
