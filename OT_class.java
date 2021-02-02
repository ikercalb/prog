package Erronka2;

public class OT_class {
	protected String Idlana;
	protected String Arazoa;
	protected String Eginda;


OT_class() {
	this.Idlana = "";
	this.Arazoa = "";
	this.Eginda = "";
}

OT_class(String Idlana, String Arazoa, String Eginda) {
	this.Idlana = Idlana;
	this.Arazoa = Arazoa;
	this.Eginda = Eginda;
}

public String getIdlana() {
	return Idlana;
}

public void setIdlana(String idlana) {
	Idlana = idlana;
}

public String getArazoa() {
	return Arazoa;
}

public void setArazoa(String arazoa) {
	Arazoa = arazoa;
}

public String getEginda() {
	return Eginda;
}

public void setEginda(String eginda) {
	Eginda = eginda;
}


}