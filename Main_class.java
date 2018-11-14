package mnoziny;
import static mnoziny.Generovani_mnozin.generovaniMnoziny;
public class Main_class {

    public static void main(String[] args) {
        int[] mnozina1 = generovaniMnoziny();
        int[] mnozina2 = generovaniMnoziny();
        Vypis_mnozin.Vypis(mnozina1,mnozina2);
    }
}
