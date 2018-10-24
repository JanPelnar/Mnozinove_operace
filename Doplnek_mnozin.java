
package withkaja;
import java.util.Arrays;
public class Doplnek_mnozin {
            int i;
            int index; 
            int pozice; 
    public void Doplnek_mnoziny1(int[] mnozina1){
            i = 0;
            index = 0; 
            pozice = 0; 
            while(pozice < (mnozina1.length)){ 
                      i = 0;   
                int maximum = mnozina1[index]; 
                while(i < (mnozina1.length)){ 
                    if(mnozina1[i] < maximum){ 
                        maximum = mnozina1[i]; 
                        mnozina1[i] = mnozina1[index]; 
                        mnozina1[index] = maximum; 
                    } 
                    i++; 
                } 
                pozice++; 
                index++;       
            }
            System.out.println(Arrays.toString(mnozina1));
            pozice = 0;
            while(pozice<(mnozina1.length-1)){
            if(mnozina1[pozice] == mnozina1[pozice+1]){
                      mnozina1[pozice] = -21;
                     
                    
                }
            pozice++;
            }
            System.out.println(Arrays.toString(mnozina1));

}

}
