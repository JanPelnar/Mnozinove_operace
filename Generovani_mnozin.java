package mnoziny;
import java.util.Scanner;
import java.util.Random;
public class Generovani_mnozin {

    Scanner sc = new Scanner(System.in);
    Random rd = new Random();
    public void generovaniPrvniMnoziny(){
        System.out.println("Zadejte počet prvků množiny, rozmezí je od 10 do 20");
        int pocetPrvku1 = 0;
        while (pocetPrvku1<10||pocetPrvku1>20){
                    pocetPrvku1 = sc.nextInt();
        }
        int odpocet = 0;
        int[] mnozina1 = new int[pocetPrvku1];
        while (odpocet<pocetPrvku1){
            mnozina1[odpocet]=rd.nextInt(30)-20;
            odpocet++;
        }
        System.out.println(mnozina1);
        }
    }
