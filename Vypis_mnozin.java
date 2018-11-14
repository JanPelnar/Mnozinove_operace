package mnoziny;
import java.util.Arrays;
import static mnoziny.Doplnek_mnozin.Doplnek_mnoziny1;
import static mnoziny.Doplnek_mnozin.Doplnek_mnoziny2;
import static mnoziny.Generovani_mnozin.generovaniMnoziny;
import static mnoziny.Prunik_mnozin.Prunik_mnozin;
import static mnoziny.Rozdil_mnozin.Rozdil_mnoziny2;
import static mnoziny.Rozdil_mnozin.Rozdil_mnoziny1;
import static mnoziny.Sjednoceni_mnozin.Sjednoceni_mnozin;
public class Vypis_mnozin {
        int[] mnozina1 = generovaniMnoziny();
        int[] mnozina2 = generovaniMnoziny();
        public static void Vypis(int[] mnozina1,int[] mnozina2){
        System.out.println(Arrays.toString(mnozina1));
        System.out.println(Arrays.toString(mnozina2));
        Rozdil_mnoziny1(mnozina1,mnozina2);
        Rozdil_mnoziny2(mnozina1,mnozina2);
        Sjednoceni_mnozin(mnozina1,mnozina2);
        Prunik_mnozin(mnozina1,mnozina2);
        System.out.print("Doplněk množiny A je: ");
        Doplnek_mnoziny1(mnozina1,mnozina2);
        System.out.print("Doplněk množiny B je: ");
        Doplnek_mnoziny2(mnozina1,mnozina2);
    }
        
}
