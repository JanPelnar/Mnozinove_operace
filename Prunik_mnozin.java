

package withkaja;

import java.util.Arrays;

public class Prunik_mnozin {
    public static int[] Prunik_mnozin(int[] mnozina1,int[] mnozina2){
        int odpocet = 0;
        int i = 0;
            int[] prunik = new int[mnozina1.length + mnozina2.length];
                while(odpocet < mnozina1.length){
                    prunik[odpocet] = mnozina1[odpocet];
                    odpocet++;
                }
                while(odpocet < (mnozina1.length + mnozina2.length)){
                    prunik[odpocet] = mnozina2[i];
                    i++;
                    odpocet++;
                }
                  int index = 0; 
                  int pozice = 0; 
            while(pozice < (mnozina1.length + mnozina2.length)){ 
                      i = 0;   
                int maximum = prunik[index]; 
                while(i < (mnozina1.length + mnozina2.length)){ 
                    if(prunik[i] < maximum){ 
                        maximum = prunik[i]; 
                        prunik[i] = prunik[index]; 
                        prunik[index] = maximum; 
                    } 
                    i++; 
                } 
                pozice++; 
                index++;       
            }

            int dvj = 0;

            
            pozice = 0;
            prunik[prunik.length-1] = -31;
            while(pozice < (prunik.length-1)){
                    if(prunik[pozice] != prunik[pozice+1]){
                    prunik[pozice] = -31;
                    
                }
              
                pozice++;
                
            }
            pozice =0;
            while(pozice<(prunik.length-1)){
            if(prunik[pozice] == prunik[pozice+1]){
                      prunik[pozice] = -31;
                     
                    
                }
            pozice++;
            }
            pozice = 0;
            while(pozice<prunik.length){
                if(prunik[pozice] == -31){
                    dvj++;
                }
                pozice++;
            }
            index = 0; 
            pozice = 0; 
            while(pozice < (prunik.length)){ 
                      i = 0;   
                int maximum = prunik[index]; 
                while(i < (prunik.length)){ 
                    if(prunik[i] < maximum){ 
                        maximum = prunik[i]; 
                        prunik[i] = prunik[index]; 
                        prunik[index] = maximum; 
                    } 
                    i++; 
                } 
                pozice++; 
                index++;       
            }
            int[] pr = new int[prunik.length -dvj];
            pozice = 0;
            while(pozice < pr.length){
                pr[pozice] = prunik[pozice];
                pozice++;
            }
            System.out.println(Arrays.toString(pr));
        return pr;
    }
}
