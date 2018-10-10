public class Sjednoceni_mnozin {
    int pocetPrvku1 = 1;
    int pocetPrvku2 = 2;
    int[] mnozina1 = new int[pocetPrvku1];
    int[] mnozina2 = new int[pocetPrvku2];    
    
    
    
    int odpocet = 0;
    int i = 0;
    public void Sjednoceni_mnozin(){
        mnozina1[0] = 5;
        mnozina2[0] = 9;
        mnozina2[1] = 1;
        int[] sjednoceni = new int[pocetPrvku1 + pocetPrvku2];
            while(odpocet < pocetPrvku1){
                sjednoceni[odpocet] = mnozina1[odpocet];
                odpocet++;
            }
            while(odpocet < (pocetPrvku1 + pocetPrvku2)){
                sjednoceni[odpocet] = mnozina2[i];
                odpocet++;
                i++;
                System.out.println(odpocet);
                System.out.println(sjednoceni);
            }
        }
    }        

