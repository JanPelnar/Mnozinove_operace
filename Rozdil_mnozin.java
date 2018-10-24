package mnoziny;

import java.util.Arrays;

public class Rozdil_mnozin {
     public void Rozdil_mnoziny1(int[] mnozina1,int[] mnozina2){
              int i = 0;
              int index = 0; 
              int pozice = 0; 
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
              i = 0;
              index = 0; 
              pozice = 0; 
                 while(pozice < (mnozina2.length)){ 
                  i = 0;   
            int maximum = mnozina2[index]; 
            while(i < (mnozina2.length)){ 
                if(mnozina2[i] < maximum){ 
                    maximum = mnozina2[i]; 
                    mnozina2[i] = mnozina2[index]; 
                    mnozina2[index] = maximum; 
                } 
                i++; 
            } 
            pozice++;
            index++;
        }
            System.out.println(Arrays.toString(mnozina2));
            i = 0;
            while (i<mnozina1.length-1){
                if (mnozina1[i] == mnozina1[i+1]){
                    mnozina1[i+1] = -21;
                }
                i++;
            }
                
            i = 0;
            int[] rozdil = new int[mnozina1.length];
            index = 0;
            int vyskyt = 0;
            int indexRozdilu = 0;
            while(mnozina1.length>i){
                while (mnozina2.length>index){
                    if (mnozina1[i] == mnozina2[index]){
                        vyskyt++;
                       
                    }
                    index++;
                    
                }
                if (vyskyt == 0 && mnozina1[i] != -21){
                    rozdil[indexRozdilu] = mnozina1[i];
                    indexRozdilu++;
                }
                i++;
                vyskyt = 0;
                index = 0;
            }
            indexRozdilu=0;
            while (rozdil[indexRozdilu]!=0 && rozdil[indexRozdilu+1]!=0){
            System.out.print("{"+rozdil[indexRozdilu]+"} ");
            indexRozdilu++;}
     }
}
