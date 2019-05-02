package packageuno;
import java.util.Scanner;
public class Teklatua {

    private static Scanner sc;
    private static Teklatua nireTeklatua;
    
private Teklatua() {
    this.sc= new Scanner(System.in);
}
public static Teklatua getNireTeklatua() {
    if(nireTeklatua==null) {
   	 nireTeklatua= new Teklatua();
    }
    return nireTeklatua;
}

public static int irakurriZenb() throws NumberFormatException {
    String sar= sc.nextLine();
    int zenb= Integer.parseInt(sar);
    return zenb;
    
    
}
}
