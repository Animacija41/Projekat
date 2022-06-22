package gui;
public class Adresa {
		private String ulica;
		private String broj;
		private String grad;
	
		
		public Adresa() {
			this.ulica = "";
			this.broj = "";
			this.grad = "";
		}
		
		public Adresa(String ulica, String broj, String grad) {
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
		
		public String getBroj() {
			return this.broj;
		}
		public void setBroj(String broj) {
			this.broj = broj;
		}
		
		public String getGrad() {
			return this.grad;
		}
		public void setGrad(String grad) {
			this.grad = grad;
		}
}
