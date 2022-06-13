enum RADNO_MESTO{MODELATOR, RIGER, ANIMATOR, ILUSTRATOR};


public class Zaposleni {
	private String ime;
	private String prezime;
	private long jmbg;
	private String datum;
	private String email;
	private Adresa adresa;
	private Softver softver;
	private RADNO_MESTO radnoMesto;
	
	public Zaposleni() {
		this.ime = "";
		this.prezime = "";
		this.jmbg = 0;
		this.datum = "";
		this.email = "";
		this.adresa = new Adresa();
		this.softver = new Softver();
		this.radnoMesto = RADNO_MESTO.MODELATOR;
	}
	
	public Zaposleni(String ime, String prezime, long jmbg, String datum, String email, Adresa adresa, Softver sa, RADNO_MESTO rm) {
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
	
	
	public long getJMBG() {
		return this.jmbg;
	}
	public void setJMBG(long jmbg) {
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
	
	
	public RADNO_MESTO getRadnoMesto() {
		return this.radnoMesto;
	}
	public void setRadnoMesto(RADNO_MESTO rm) {
		this.radnoMesto = rm;
	}
	
}
