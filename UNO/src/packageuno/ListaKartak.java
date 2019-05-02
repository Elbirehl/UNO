package packageuno;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class ListaKartak {
	private ArrayList<Karta> lista;

	public ListaKartak() {
		this.lista=new ArrayList<Karta>();
	}

	public void gehituKarta(Karta pKarta) {
		lista.add(pKarta);
	}
	
	private Iterator<Karta> getIteradorea(){
		return this.lista.iterator();
	}
	
	public Karta hartuKarta() {
        Karta k =null;
        boolean aurkitua=false;
        while (this.lista.size()>0 || aurkitua==true) {
            int i=0;
             k = this.lista.get(i);
            lista.remove(i);
            i=i+1;
            
        }
        return k;
        
    }

		/*Random rand = new Random();
		int n = rand.nextInt(lista.size()) + 1;
		Karta k = lista.get(n);
		lista.remove(n);
		return k;*/
		
	public int getTamaina() {
		
		return this.lista.size();
	}
	
	public Karta get(int i) {
		return lista.get(i);
	}
	
	public Karta azkenKarta() {
	 int azkena=0;
	 azkena= this.lista.size();
	 return this.lista.get(azkena);
	}
}
