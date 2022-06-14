package gui;
public class Cetkica {
	private String naziv;
	private String namena;
	private String boja;

	public Cetkica() {
		this.naziv = "";
		this.namena = "";
		this.boja = "";
	}
	
	public Cetkica(String naziv, String namena, String boja) {
		this.naziv = naziv;
		this.namena = namena;
		this.boja = boja;
	}
	
	public String getNaziv() {
		return this.naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	
	public String getNamena() {
		return this.namena;
	}
	public void setNamena(String namena) {
		this.namena = namena;
	}
	
	public String getBoja() {
		return this.boja;
	}
	public void setBoja(String boja) {
		this.boja = boja;
	}
}
