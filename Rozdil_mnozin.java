package mnoziny;

import java.util.Arrays;

public class Rozdil_mnozin {
 public static int[] Rozdil_mnoziny1(int[] mnozina1,int[] mnozina2){
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
            i = 0;
            while (i<mnozina1.length-1){
                if (mnozina1[i] == mnozina1[i+1]){
                    mnozina1[i] = -31;
                }
                
                i++;
            }
            
            
            i = 0;
            index = 0;
            int vyskyt = 0;
            int pocetCisel = 0;
            while (mnozina1.length>i){
                while (mnozina2.length>index){
                    if(mnozina1[i] == mnozina2[index]){
                        vyskyt++;
                    }
                    index++;
                    }
                
                if (vyskyt==0 && mnozina1[i] != -31){
                    pocetCisel++;
                     }
                
                vyskyt = 0;
                i++;
                index = 0;
            }
            
            int[] rozdil1 = new int[pocetCisel];
            i = 0;
            index = 0;
            vyskyt = 0;
            int rozdilIndex = 0;
            while (mnozina1.length>i){
                while (mnozina2.length>index){
                    if(mnozina1[i] == mnozina2[index]){
                        vyskyt++;
                    }
                    index++;
                }
                if (vyskyt==0 && mnozina1[i] != -31){
                    rozdil1[rozdilIndex] = mnozina1[i];
                    rozdilIndex++;
                     }
                i++;
                vyskyt = 0;
                index = 0;
            }
            System.out.println("Rozdíl množiny A = " + Arrays.toString(rozdil1));
            return rozdil1;
 }
 
 public static int[] Rozdil_mnoziny2(int[] mnozina1,int[] mnozina2){
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
            i = 0;
            while (i<mnozina2.length-1){
                if (mnozina2[i] == mnozina2[i+1]){
                    mnozina2[i] = -31;
                }
                
                i++;
            }
            
            
            i = 0;
            index = 0;
            int vyskyt = 0;
            int pocetCisel = 0;
            while (mnozina2.length>i){
                while (mnozina1.length>index){
                    if(mnozina2[i] == mnozina1[index]){
                        vyskyt++;
                    }
                    index++;
                    }
                
                if (vyskyt==0 && mnozina2[i] != -31){
                    pocetCisel++;
                     }
                
                vyskyt = 0;
                i++;
                index = 0;
            }
            
            int[] rozdil2 = new int[pocetCisel];
            i = 0;
            index = 0;
            vyskyt = 0;
            int rozdilIndex = 0;
            while (mnozina2.length>i){
                while (mnozina1.length>index){
                    if(mnozina2[i] == mnozina1[index]){
                        vyskyt++;
                    }
                    index++;
                }
                if (vyskyt==0 && mnozina2[i] != -31){
                    rozdil2[rozdilIndex] = mnozina2[i];
                    rozdilIndex++;
                     }
                i++;
                vyskyt = 0;
                index = 0;
            }
            System.out.println("Rozdíl množiny B = " + Arrays.toString(rozdil2));
            return rozdil2;
 }
}
