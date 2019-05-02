package packageuno;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.net.URL;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
import java.util.Random;
public class Baraja {

	private ListaKartak lista;
	private static Baraja instantziaBakarra=null;
	
	private Baraja () {
		this.lista= new ListaKartak();}
		// KARTEN LISTA SORTU
		//hfjjtitit
		public void galderakKonfiguratu(){
			
			String[] zatiak= new String[2];

			InputStream fitx = this.getClass().getClassLoader().getResourceAsStream("C:\\KartaGuztiak.txt");

			InputStreamReader in= new InputStreamReader(fitx);//("C:\\archivo.txt");
			
			Scanner sc; 
			
			sc = new Scanner(in);
			String galderaErantzuna = sc.nextLine();
			zatiak= galderaErantzuna.split("  ");
		 	String kolorea = zatiak[0];
			String zenbakia = zatiak[1];	
		}
		
	public static Baraja getNireInstatziaBakarra() {
		if(instantziaBakarra==null) {
			instantziaBakarra= new Baraja();
		}
		return instantziaBakarra;
	}
	
	public void jokatuPartida(int pJokalariKop) { 
		//TODO 
	}
	 
	
	/*public void errekorrituBaraja() { Karta kartaBat=null; Iterator<Karta>
	  itr=this.getIteradorea();
	  }
	 
	
	/*  public void kartakBanatu() { 
	 	Jokalari1 pJok1=null; 
	 	Jokalari2 pJok2=null;
	  	Karta kartaBat=null;
	   	int kop=0; 
	   	Iterator<Karta> itr=this.getIteradorea();
	  	while (itr.hasNext() || kop<=7) { 
	  		kartaBat=itr.next();
	  		pJok1.hartuKarta(kartaBat);
	  	 	kartaBat= itr.next();
	  	 	 kop=kop+1; }
	  }
	 */
}
