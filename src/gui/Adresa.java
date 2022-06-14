package gui;
public class Adresa {
		private String ulica;
		private int broj;
		private String grad;
	
		
		public Adresa() {
			this.ulica = "";
			this.broj = 0;
			this.grad = "";
		}
		
		public Adresa(String ulica, int broj, String grad) {
			this.ulica = ulica;
			this.broj = broj;
			this.grad = grad;
		}
		
		public String getUlica() {
			return this.ulica;
		}
		public void setUlica(String ulica) {
			this.ulica = ulica;
		}
		
		public int getBroj() {
			return this.broj;
		}
		public void setBroj(int broj) {
			this.broj = broj;
		}
		
		public String getGrad() {
			return this.grad;
		}
		public void setGrad(String grad) {
			this.grad = grad;
		}
}
