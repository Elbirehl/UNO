package packageuno;

public class KartaHartu extends Bereziak {
	public KartaHartu(String pKolorea) {
		super(pKolorea);
	}
	
	 public void kartaEgikaritu(Jokalaria pJok1) {
		 pJok1.hartuKartaBat();
	 }
	 public boolean kartaKonprobatu() {
			Mahaia mahaia = Mahaia.getMahaia();
			Karta azkenKarta = mahaia.azkenKarta();
			if(this.kolorea == azkenKarta.kolorea ||azkenKarta instanceof KartaHartu) {
				return true;
			}
			return false;
	}
}
