 package Erronka2;


public class bezero_class extends pertsona_class {

	protected int telefonoa;
	protected String helbidea;
	protected String email;
	
	public bezero_class(){

		this.telefonoa=0;
		this.helbidea="";
		this.email="";
	}

	public bezero_class(String izena,String abizena,String nan, int telefonoa, String helbidea,String email){
		super(izena, abizena, nan);
		this.telefonoa=telefonoa;
		this.helbidea=helbidea;
		this.email=email;
	}
	
	public int getTelefonoa() {
		return telefonoa;
	}


	public void setTelefonoa(int telefonoa) {
		this.telefonoa = telefonoa;
	}


	public String getHelbidea() {
		return helbidea;
	}


	public void setHelbidea(String helbidea) {
		this.helbidea = helbidea;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


}
