package vetor04;

import java.util.Arrays;

public class Vetor04 {

    public static void main(String[] args) {
        int vetor[] = {3, 7, 6, 1, 9, 4, 2};
        
        for(int valor: vetor){
            System.out.print(valor +" ");
        }
        System.out.println("");
        int p = Arrays.binarySearch(vetor, 1); //busca o valor na posição
        
        System.out.println("Encontrei o valor na posição " +p);
    }
    
}
