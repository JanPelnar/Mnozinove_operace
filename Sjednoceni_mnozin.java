package mnoziny;
import java.util.Arrays;
public class Sjednoceni_mnozin {

    

    public static int[] Sjednoceni_mnozin(int[] mnozina1,int[] mnozina2){
    
    int odpocet = 0;
    int i = 0;
        int[] sjednoceni = new int[mnozina1.length + mnozina2.length];
            while(odpocet < mnozina1.length){
                sjednoceni[odpocet] = mnozina1[odpocet];
                odpocet++;
            }
            while(odpocet < (mnozina1.length + mnozina2.length)){
                sjednoceni[odpocet] = mnozina2[i];
                i++;
                odpocet++;
            }
              int index = 0; 
              int pozice = 0; 
        while(pozice < (mnozina1.length + mnozina2.length)){ 
                  i = 0;   
            int maximum = sjednoceni[index]; 
            while(i < (mnozina1.length + mnozina2.length)){ 
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
        while(pozice < (mnozina1.length + mnozina2.length-1)){
            if(sjednoceni[pozice] == sjednoceni[pozice+1]){
                sjednoceni[pozice] = -31;
                zdvojennych++;
            }
            pozice++;
            
        }
        int[] sp = new int[mnozina1.length + mnozina2.length - zdvojennych];      
        index = 0; 
        pozice = 0; 
        while(pozice < (mnozina1.length+mnozina2.length)){ 
                  i = 0;   
            int maximum = sjednoceni[index]; 
            while(i < (mnozina1.length + mnozina2.length)){ 
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
        while(pozice < (mnozina1.length + mnozina2.length - zdvojennych)){
            sp[pozice] = sjednoceni[pozice];
            pozice++;
        }
        System.out.println(Arrays.toString(sp));
        return sp;
        }
    }        
