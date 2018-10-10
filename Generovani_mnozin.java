
package mnoziny;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
public class Generovani_mnozin {
    
    Scanner sc = new Scanner(System.in);
    
    
    public void generovani(){
        System.out.println("Zadejte počet prvků množiny, rozmezí je od 10 do 20");
        int pocetPrvku = sc.nextInt();
        int odpocet = 0;
        if (pocetPrvku>=10 && pocetPrvku<=20){
        int[] mnozina = new int[pocetPrvku];
        while (odpocet<pocetPrvku){
            mnozina[odpocet] = 
            odpocet++;
        }
        }
        else {
            System.out.println("počet prvků nesplňuje požadavky");
        }
        
    }
}
