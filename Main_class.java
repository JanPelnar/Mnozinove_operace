
package withkaja;
import java.util.Arrays;
import static withkaja.Generovani_mnozin.generovaniMnoziny;
import withkaja.Sjednoceni_mnozin;
public class Main_class {

    public static void main(String[] args) {
        int[] mnozina1 = generovaniMnoziny();
        int[] mnozina2 = generovaniMnoziny();
        Sjednoceni_mnozin x = new Sjednoceni_mnozin();
        x.Sjednoceni_mnozin(mnozina1,mnozina2);
    }
}
