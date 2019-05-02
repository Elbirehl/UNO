
package packageuno;

public class LauHartu extends KartaHartu {
	public LauHartu(String pKolorea) {
		super(pKolorea);
	}
	
	public void kartaEgikaritu(Jokalaria pJok1) {
		for(int i=0;i <= 4;i++){
			pJok1.hartuKartaBat();
		}
	}
}
