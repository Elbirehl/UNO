
package packageuno;

public class LauHartu extends KartaHartu {
	public LauHartu(String pKolorea, String pMota) {
		super(pKolorea,pMota);
		this.mota = "Lau Hartu";
	}
	
	public void kartaEgikaritu(Jokalaria pJok1) {
		for(int i=0;i <= 4;i++){
			pJok1.hartuKartaBat();
		}
	}
}
