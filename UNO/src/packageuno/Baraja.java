package packageuno;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.net.URL;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
import java.util.Random;
public class Baraja {

	private ListaKartak lista;
	private static Baraja instantziaBakarra=null;
	
	private Baraja () {
		this.lista= new ListaKartak();
		}

	public static Baraja getNireInstatziaBakarra() {
		if(instantziaBakarra==null) {
			instantziaBakarra= new Baraja();
		}
		return instantziaBakarra;
	}
	public void kartakKonfiguratu(String [] arg){
		File archivo = null;
	    FileReader fr = null;
	    BufferedReader br = null;
		
		        
	      try {
	         // Apertura del fichero y creacion de BufferedReader para poder
	         // hacer una lectura comoda (disponer del metodo readLine()).
	         archivo = new File ("C:\\Users\\913567\\Desktop\\KartaGuztiak.txt");
	         fr = new FileReader (archivo);
	         br = new BufferedReader(fr);
	         
	         /*String[] zatiak= new String[2];
	 		 String galderaErantzuna= br.;
	 		 zatiak= galderaErantzuna.split(" ");
	         String kolorea = zatiak[0];
	         String strzenbakia = zatiak[1];
 		     int intzenb = Integer.parseInt(strzenbakia);*/
  
	         // Lectura del fichero
	         String linea;
	         String[] zatiak= new String[2];
	         while((linea=br.readLine())!=null)
	            System.out.println(linea);
	            linea=br.readLine();
	            zatiak= linea.split(" ");
		        String kolorea = zatiak[0];
		        String strzenbakia = zatiak[1];
	 		    int intzenb = Integer.parseInt(strzenbakia);
	         	if(intzenb!=0) {
		          BatBederatzi kBb= new BatBederatzi(kolorea,intzenb);
		          this.lista.gehituKarta(kBb);
		      }
		          else if(strzenbakia== "Alderantziz"){
		              Alderantziz kAld= new Alderantziz(kolorea,strzenbakia);
		              this.lista.gehituKarta(kAld);
		          }
		          else if(strzenbakia=="Blokeoa") {
		              Blokeoa kBlk= new Blokeoa(kolorea,strzenbakia);
		              this.lista.gehituKarta(kBlk);
		          }
		          else if(strzenbakia=="KartaHartu") {
		              KartaHartu kKH= new KartaHartu(kolorea,strzenbakia);
		              this.lista.gehituKarta(kKH);
		          }
		          else if(strzenbakia== "LauHartu") {
		              LauHartu kLauH= new LauHartu(kolorea,strzenbakia);
		              this.lista.gehituKarta(kLauH);
		          }
	      }
	      
	      catch(Exception e){
	         e.printStackTrace();
	      }finally{
	         // En el finally cerramos el fichero, para asegurarnos
	         // que se cierra tanto si todo va bien como si salta 
	         // una excepcion.
	         try{                    
	            if( null != fr ){   
	               fr.close();     
	            }                  
	         }catch (Exception e2){ 
	            e2.printStackTrace();
	         }
	      }
	      if(this.lista.getTamaina()==0) {
	          System.out.println("Baraja hutsik dago ez du sck funtzionatu");
	      }

	   }

   
    
}

		/*String[] zatiak= new String[2];

		InputStream fitx = this.getClass().getClassLoader().getResourceAsStream("KartaGuztiak.txt");

		InputStreamReader in= new InputStreamReader(fitx);
		
		Scanner sc; 
		sc = new Scanner(in);
		String galderaErantzuna = sc.nextLine();
		zatiak= galderaErantzuna.split("  ");
		String galdera = zatiak[0];
		String eranPosible1 = zatiak[1];*/
	


