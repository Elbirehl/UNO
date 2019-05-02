package packageuno;

public class Alderantziz extends Bereziak {
	public Alderantziz(String pKolorea, String pMota) {
		super(pKolorea,pMota);
		this.mota = "Alderantziz";
	}

 public void kartaEgikaritu(Jokalaria pJok1) {
	 	Mahaia mahaia = Mahaia.getMahaia();
		mahaia.gehituKarta(this);
	 }
 public boolean kartaKonprobatu() {
		Mahaia mahaia = Mahaia.getMahaia();
		Karta azkenKarta = mahaia.azkenKarta();
		if(this.kolorea == azkenKarta.kolorea ||azkenKarta instanceof Alderantziz) {
			return true;
		}
		return false;
}
}
