package vetor03;

import java.util.Arrays;

public class Vetor03 {

    public static void main(String[] args) {
        double v[] = {3.5, 2.75, 9, -4.5};
        Arrays.sort(v); //Coloca o vetor em ordem
        
        for(double valor: v){
            System.out.println(valor +" ");
        }
    }
    
}
