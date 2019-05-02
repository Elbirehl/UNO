package packageuno;

public class BatBederatzi extends Karta {
	//atributuak
		private int zenb;
		
		public BatBederatzi(String pKolorea, Integer pZenb) {
			super(pKolorea);
			this.zenb=pZenb;
		}
		
		@Override
		public String toString() {
			return this.zenb + " " +this.kolorea;
		}
		
		 public void kartaEgikaritu(Jokalaria pJok1) {
			Mahaia mahaia = Mahaia.getMahaia();
			mahaia.gehituKarta(this);			
		 }
		 public boolean kartaKonprobatu() {
			Mahaia mahaia = Mahaia.getMahaia();
			Karta azkenKarta = mahaia.azkenKarta();
			if(this.kolorea == azkenKarta.kolorea ||(azkenKarta instanceof BatBederatzi && ((BatBederatzi)azkenKarta).zenb == this.zenb)) {
				return true;
			}
			return false;
		 }
}
