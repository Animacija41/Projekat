package gui;
public class Render {
	private String naziv;
	private String materijal;
	private String kamera;
	private String svetlo;
	private String objekat;
	
	public Render() {
		this.naziv = "";
		this.materijal = "";
		this.kamera = "";
		this.svetlo = "";
		this.objekat = "";
	}
	
	public Render(String naziv, String materijal, String kamera, String svetlo, String objekat) {
		this.naziv = naziv;
		this.materijal = materijal;
		this.kamera = kamera;
		this.svetlo=svetlo;
		this.objekat=objekat;
	}
	
	public String getNaziv() {
		return this.naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	
	public String getMaterijal() {
		return this.materijal;
	}
	public void setMaterijal(String materijal) {
		this.materijal = materijal;
	}
	
	public String getKamera() {
		return this.kamera;
	}
	public void setKamera(String kamera) {
		this.kamera = kamera;
	}
	
	public String getSvetlo() {
		return this.svetlo;
	}
	public void setSvetlo(String svetlo) {
		this.svetlo = svetlo;
	}
	
	public String getObjekat() {
		return this.objekat;
	}
	public void setObjekat(String objekat) {
		this.objekat = objekat;
	}

	@Override
	public String toString() {
		return "Render [naziv=" + naziv + ", materijal=" + materijal + ", kamera=" + kamera + ", svetlo=" + svetlo
				+ ", objekat=" + objekat + "]";
	}
	
}
