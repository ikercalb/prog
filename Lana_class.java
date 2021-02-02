package Erronka2;

public class Lana_class extends PiezaLana_class {
	protected String Langile;
	
 Lana_class(){
	 this.Langile = "";
 }
 
 Lana_class(String Lana, String Langile,int prezioa){
	 super(Lana,prezioa);
	 this.Langile = Langile;
 }


public String getLangile() {
	return Langile;
}

public void setLangile(String Langile) {
	this.Langile = Langile;
}
 
}
