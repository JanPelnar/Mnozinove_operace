package withkaja;

public class Doplnek_mnozin {
            static int i;
            static int index; 
            static int pozice; 
    public static int[] Doplnek_mnoziny1(int[] mnozina1,int[] mnozina2){
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
                      mnozina1[pozice] = -31;
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
                      mnozina2[pozice] = -31;
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

            index = 0;
            pozice = 0;
            boolean sub = true;
            while(pozice < mnozina1.length && sub == true){
                sub = false;
                index = 0;
                while(index < mnozina2.length){
                    if(mnozina2[index] == mnozina1[pozice]){
                        sub = true;
                    }
                    index++;
                }
                if(sub != true){
                    System.out.println("Není podmnožinou");
                }
                pozice++;
            }
            int pocetCisel = 0;
            int[] rozdil = new int[pocetCisel];
            if(sub == true){
                            i = 0;
            index = 0;
            int vyskyt = 0;
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
                    rozdil[rozdilIndex] = mnozina2[i];
                    rozdilIndex++;
                     }
                i++;
                vyskyt = 0;
                index = 0;
            }

            }


return rozdil; 
    }
    public static int[] Doplnek_mnoziny2(int[] mnozina1,int[] mnozina2){
                  
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
                      mnozina1[pozice] = -31;
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
                      mnozina2[pozice] = -31;
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
            index = 0;
            pozice = 0;
            boolean sub = true;
            while(pozice < mnozina2.length && sub == true){
                sub = false;
                index = 0;
                while(index < mnozina1.length && sub == false){
                    if(mnozina1[index] == mnozina2[pozice]){
                        sub = true;
                    }
                    index++;
                }
                if(sub != true){
                    System.out.println("Není podmnožinou");
                }
                pozice++;
            }
            int pocetCisel = 0;
            int[] rozdil = new int[pocetCisel];
            if(sub == true){
                   i = 0;
            index = 0;
            int vyskyt = 0;
            
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
                    rozdil[rozdilIndex] = mnozina1[i];
                    rozdilIndex++;
                     }
                i++;
                vyskyt = 0;
                index = 0;
            }
            
        }
            return rozdil;
    }
}
    
