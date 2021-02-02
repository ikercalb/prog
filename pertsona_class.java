package Erronka2;

import java.io.Serializable;

public abstract class pertsona_class implements Serializable{
	protected String izena;
	protected String abizena;
	protected String nan;
	

pertsona_class(){
	this.izena="";
	this.abizena="";
	this.nan="";
	
}

pertsona_class(String izena,String abizena,String nan){
	this.izena=izena;
	this.abizena=abizena;
	this.nan=nan;
	
}

public String getIzena() {
	return izena;
}

public void setIzena(String izena) {
	this.izena = izena;
}

public String getAbizena() {
	return abizena;
}

public void setAbizena(String abizena) {
	this.abizena = abizena;
}

public String getNan() {
	return nan;
}

public void setNan(String nan) {
	this.nan = nan;
}

}

