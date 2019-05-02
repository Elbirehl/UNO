package packageuno;

public  abstract class  Karta {
	protected String kolorea;
	
	
	public Karta (String pKolorea) {
		this.kolorea=pKolorea;
	}
	
	abstract public void kartaEgikaritu(Jokalaria pJok1);
	abstract public boolean kartaKonprobatu();
		
}
