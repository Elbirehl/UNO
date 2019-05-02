package packageuno;

public class KartaHartu extends Bereziak {
	public KartaHartu(String pKolorea,String pMota) {
		super(pKolorea,pMota);
		this.mota = "KartaHartu";
	}
	
	 public void kartaEgikaritu(Jokalaria pJok1) {
		 for(int i=0;i <= 2;i++){
				pJok1.hartuKartaBat();
			}
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
