package withkaja;
import static withkaja.Doplnek_mnozin.Doplnek_mnoziny1;
import static withkaja.Doplnek_mnozin.Doplnek_mnoziny2;
import static withkaja.Prunik_mnozin.Prunik_mnozin;
import static withkaja.Sjednoceni_mnozin.Sjednoceni_mnozin;
import static withkaja.Rozdil_mnozin.Rozdil_mnoziny1;
import static withkaja.Rozdil_mnozin.Rozdil_mnoziny2;   
import static withkaja.Generovani_mnozin.generovaniMnoziny;
import static withkaja.Vypis_mnozin.Vypis;
public class Main_class {

    public static void main(String[] args) {
        int[] mnozina1 = generovaniMnoziny();
        int[] mnozina2 = generovaniMnoziny();
        Vypis(Doplnek_mnoziny1(mnozina1,mnozina2));

    }
}
