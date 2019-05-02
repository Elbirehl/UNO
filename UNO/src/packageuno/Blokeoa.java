package packageuno;

public class Blokeoa extends Bereziak {
	public Blokeoa(String pKolorea) {
		super(pKolorea);
	}
	
	 public void kartaEgikaritu(Jokalaria pJok1) {
		 Mahaia mahaia = Mahaia.getMahaia();
		 mahaia.gehituKarta(this);
	 }
	 public boolean kartaKonprobatu() {
			Mahaia mahaia = Mahaia.getMahaia();
			Karta azkenKarta = mahaia.azkenKarta();
			if(this.kolorea == azkenKarta.kolorea ||azkenKarta instanceof Blokeoa) {
				return true;
			}
			return false;
	}
}
