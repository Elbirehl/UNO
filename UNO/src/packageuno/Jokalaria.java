package packageuno;

import java.util.ArrayList;

public class Jokalaria {
	private ListaKartak eskua = new ListaKartak();
	
	public Jokalaria () {
		this.hartuEskuIniziala();
	}
	
	public void hartuEskuIniziala() {
		ListaKartak b = new ListaKartak();
		for (int i= 0; i < 7; i++)
		{
			eskua.gehituKarta(b.hartuKarta());
		}
	}
	
	public void hartuKartaBat() {
		ListaKartak b = new ListaKartak();
		eskua.gehituKarta(b.hartuKarta());
	}
	
	public void imprimatuEskua() {
		for (int i= 0; i < eskua.getTamaina(); i++) {
			inprimatuKartaBat(i);
			//System.out.print("Karta ["+i+"]: "+eskua.get(i).toString());
			if(i+1 < eskua.getTamaina())
			{
				System.out.print(", ");
			}
		}
	}
	
	public void inprimatuKartaBat(int i) {
		System.out.println("Karta: " + eskua.get(i));
	}
	
	
	public int eskuarenTamaina() {
		return this.eskua.getTamaina();
	}
	public Karta kartaAukeratu(int posizioa) {
		return this.eskua.get(posizioa);
	}
}

