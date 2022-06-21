package gui;



public class Zaposleni {
	private String ime;
	private String prezime;
	private String jmbg;
	private String datum;
	private String email;
	private Adresa adresa;
	private Softver softver;
	private String radnoMesto;
	
	public Zaposleni() {
		this.ime = "";
		this.prezime = "";
		this.jmbg = "";
		this.datum = "";
		this.email = "";
		this.adresa = new Adresa();
		this.softver = new Softver();
		this.radnoMesto ="";
	}
	
	public Zaposleni(String ime, String prezime, String jmbg, String datum, String email, Adresa adresa, Softver sa, String rm) {
		this.ime = ime;
		this.prezime = prezime;
		this.jmbg = jmbg;
		this.datum = datum;
		this.email = email;
		this.adresa = adresa;
		this.softver = sa;
		this.radnoMesto = rm;
	}
	
	public String getIme() {
		return this.ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	
	
	public String getPrezime() {
		return this.prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	
	
	public String getJMBG() {
		return this.jmbg;
	}
	public void setJMBG(String jmbg) {
		this.jmbg = jmbg;
	}
	
	
	public String getDatum() {
		return this.datum;
	}
	public void setDatum(String datum) {
		this.datum = datum;
	}
	
	
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public Adresa getAdresa() {
		return this.adresa;
	}
	public void setAdresa(Adresa adresa) {
		this.adresa = adresa;
	}
	
	
	public Softver getSoftver() {
		return this.softver;
	}
	public void setSoftver(Softver softver) {
		this.softver = softver;
	}
	
	
	public String getRadnoMesto() {
		return this.radnoMesto;
	}
	public void setRadnoMesto(String rm) {
		this.radnoMesto = rm;
	}
	@Override
	public String toString() {
		return "Zaposleni [ime=" + ime + ", prezime=" + prezime + ", jmbg=" + jmbg + ", datum=" + datum + ", email="
				+ email + ", adresa=" + adresa + ", softver=" + softver + ", radnoMesto=" + radnoMesto + "]";
	}
}
