package withkaja;

import java.util.Arrays;
public class Doplnek_mnozin {
            int i;
            int index; 
            int pozice; 
    public void Doplnek_mnoziny1(int[] mnozina1,int[] mnozina2){
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
            
            pozice = 0;
            int zdvojennych = 0;
            while(pozice<(mnozina1.length-1)){
            if(mnozina1[pozice] == mnozina1[pozice+1]){
                      mnozina1[pozice] = -21;
                      zdvojennych++;
                    
                }
            pozice++;
            }
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
            int[] newMnozina1 = new int[mnozina1.length - zdvojennych];
            pozice = 0;
            while(pozice < (mnozina1.length - zdvojennych)){
                newMnozina1[pozice] = mnozina1[pozice];
                pozice++;
            }
            System.out.println(Arrays.toString(newMnozina1));

            
            
            
            
            
            
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
            
            pozice = 0;
            zdvojennych = 0;
            while(pozice<(mnozina2.length-1)){
            if(mnozina2[pozice] == mnozina2[pozice+1]){
                      mnozina2[pozice] = -21;
                      zdvojennych++;
                    
                }
            pozice++;
            }
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
            int[] newMnozina2 = new int[mnozina2.length - zdvojennych];
            pozice = 0;
            while(pozice < (mnozina2.length - zdvojennych)){
                newMnozina2[pozice] = mnozina2[pozice];
                pozice++;
            }
            System.out.println(Arrays.toString(newMnozina2));
            index = 0;
            pozice = 0;
            boolean sub = true;
            while(pozice < mnozina1.length && sub == true){
                sub = false;
                while(index < mnozina2.length){
                    if(mnozina1[pozice] == mnozina2[index]){
                        sub = true;
                    }
                    index++;
                }
                if(sub != true){
                    System.out.println("Není podmnožinou");
                }
                pozice++;
            }
            if(sub == true){
                
            }
}
    public void Doplnek_mnoziny2(int[] mnozina1,int[] mnozina2){
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
            
            pozice = 0;
            int zdvojennych = 0;
            while(pozice<(mnozina1.length-1)){
            if(mnozina1[pozice] == mnozina1[pozice+1]){
                      mnozina1[pozice] = -21;
                      zdvojennych++;
                    
                }
            pozice++;
            }
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
            int[] newMnozina1 = new int[mnozina1.length - zdvojennych];
            pozice = 0;
            while(pozice < (mnozina1.length - zdvojennych)){
                newMnozina1[pozice] = mnozina1[pozice];
                pozice++;
            }
            System.out.println(Arrays.toString(newMnozina1));

            
            
            
            
            
            
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
            
            pozice = 0;
            zdvojennych = 0;
            while(pozice<(mnozina2.length-1)){
            if(mnozina2[pozice] == mnozina2[pozice+1]){
                      mnozina2[pozice] = -21;
                      zdvojennych++;
                    
                }
            pozice++;
            }
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
            int[] newMnozina2 = new int[mnozina2.length - zdvojennych];
            pozice = 0;
            while(pozice < (mnozina2.length - zdvojennych)){
                newMnozina2[pozice] = mnozina2[pozice];
                pozice++;
            }
            System.out.println(Arrays.toString(newMnozina2));
            index = 0;
            pozice = 0;
            boolean sub = true;
            while(pozice < mnozina2.length && sub == true){
                sub = false;
                while(index < mnozina1.length){
                    if(mnozina2[pozice] == mnozina1[index]){
                        sub = true;
                    }
                    index++;
                }
                if(sub != true){
                    System.out.println("Není podmnožinou");
                }
                pozice++;
            }
            if(sub == true){
                
            }
}

}
