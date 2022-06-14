package gui;
public class Softver {
	private String naziv;
	private Cetkica cetkica;
	private String modifikator;
	private String format;
	private String alat;
	private Render render;
	
	public Softver() {
		this.naziv = "";
		this.cetkica = new Cetkica();
		this.modifikator = "";
		this.format = "";
		this.alat = "";
		this.render = new Render();
	}
	
	public Softver(String naziv, Cetkica cetkica, String modifikator, String format, String alat, Render render) {
		this.naziv = naziv;
		this.cetkica = cetkica;
		this.modifikator = modifikator;
		this.format = format;
		this.alat = alat;
		this.render = render;
	}
	
	public String getNaziv() {
		return this.naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	
	public Cetkica getCetkica() {
		return this.cetkica;
	}
	public void setCetkica(Cetkica cetkica) {
		this.cetkica = cetkica;
	}

	public String getModifikator() {
		return this.modifikator;
	}
	public void setModifikator(String modifikator) {
		this.modifikator = modifikator;
	}
	
	public String getFormat() {
		return this.format;
	}
	public void setFormat(String format) {
		this.format = format;
	}
	
	public String getAlat() {
		return this.alat;
	}
	public void setAlat(String alat) {
		this.alat = alat;
	}
	
	public Render getRender() {
		return this.render;
	}
	public void setRender(Render render) {
		this.render = render;
	}
}
