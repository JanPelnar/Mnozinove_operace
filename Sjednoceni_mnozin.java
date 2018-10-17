
package withkaja;
import java.util.Arrays;
public class Sjednoceni_mnozin {
    int pocetPrvku1 = 3;
    int pocetPrvku2 = 2;
    int[] mnozina1 = new int[pocetPrvku1];
    int[] mnozina2 = new int[pocetPrvku2];    
    
    
    
    int odpocet = 0;
    int i = 0;
    public int[] Sjednoceni_mnozin(){
        mnozina1[0] = 5;
        mnozina1[1] = 5;
        mnozina1[2] = 6;
        mnozina2[0] = 8;
        mnozina2[1] = 1;
        int[] sjednoceni = new int[pocetPrvku1 + pocetPrvku2];
            while(odpocet < pocetPrvku1){
                sjednoceni[odpocet] = mnozina1[odpocet];
                odpocet++;
            }
            while(odpocet < (pocetPrvku1 + pocetPrvku2)){
                sjednoceni[odpocet] = mnozina2[i];
                i++;
                odpocet++;
            }
              int index = 0; 
              int pozice = 0; 
        while(pozice < (pocetPrvku1 + pocetPrvku2)){ 
                  i = 0;   
            int maximum = sjednoceni[index]; 
            while(i < (pocetPrvku1 + pocetPrvku2)){ 
                if(sjednoceni[i] < maximum){ 
                    maximum = sjednoceni[i]; 
                    sjednoceni[i] = sjednoceni[index]; 
                    sjednoceni[index] = maximum; 
                } 
                i++; 
            } 
            pozice++; 
            index++;       
        }
        pozice = 0;
        int zdvojennych = 0;
        while(pozice < (pocetPrvku1 + pocetPrvku2-1)){
            if(sjednoceni[pozice] == sjednoceni[pozice+1]){
                sjednoceni[pozice] = -21;
                zdvojennych++;
            }
            pozice++;
            
        }
        int[] sp = new int[pocetPrvku1 + pocetPrvku2 - zdvojennych];      
        index = 0; 
        pozice = 0; 
        while(pozice < (pocetPrvku1+pocetPrvku2)){ 
                  i = 0;   
            int maximum = sjednoceni[index]; 
            while(i < (pocetPrvku1 + pocetPrvku2)){ 
                if(sjednoceni[i] < maximum){ 
                    maximum = sjednoceni[i]; 
                    sjednoceni[i] = sjednoceni[index]; 
                    sjednoceni[index] = maximum; 
                } 
                i++; 
            } 
            pozice++; 
            index++;       
        }
        pozice = 0;
        while(pozice < (pocetPrvku1 + pocetPrvku2 - zdvojennych)){
            sp[pozice] = sjednoceni[pozice];
            pozice++;
        }
        return sp;
        }
    }        



