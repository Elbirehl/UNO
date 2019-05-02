package packageuno;

public class Mahaia {

	private ListaKartak lista;
	private static Mahaia nireMahaia=null;
	
	private Mahaia() {
		this.lista= new ListaKartak();	}
	
	public static Mahaia getMahaia() {
		if(nireMahaia==null) {
			nireMahaia= new Mahaia();
		}
		return nireMahaia;
	}
	public Karta azkenKarta() {
		return this.lista.azkenKarta();
	}
	public void gehituKarta(Karta azkenKarta) {
		this.lista.gehituKarta(azkenKarta);
	}
}
