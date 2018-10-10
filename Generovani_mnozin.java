package mnoziny;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
public class Generovani_mnozin {
    
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();
    
    
    public void generovani(){
        System.out.println("Zadejte počet prvků množiny, rozmezí je od 10 do 20");
        int pocetPrvku1 = 0;
        while (pocetPrvku1<10||pocetPrvku1>20){
                    pocetPrvku1 = sc.nextInt();
        }
        int odpocet = 0;
        ArrayList<Integer> mnozina1 = new ArrayList<Integer>(pocetPrvku1);
        while (odpocet<pocetPrvku1){
            mnozina1.add(rd.nextInt(50)-30);
            odpocet++;
        }
        System.out.println(mnozina1);
        }
    }
