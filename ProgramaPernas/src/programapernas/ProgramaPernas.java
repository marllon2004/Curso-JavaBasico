package programapernas;

import java.util.Scanner;

public class ProgramaPernas {

    public static void main(String[] args) {
        int pernas;
        String tipo;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Quantidade de Pernas: ");
        pernas = teclado.nextInt();
        
        switch(pernas){
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bípede";
                break;
            case 3:
                tipo = "Tripé";
                break;
            case 4:
                tipo = "Quadrúpede";
                break;
            case 6:
                tipo = "Aranha";
                break;
            default:
                tipo = "ET";
        }
        System.out.println("Isso é um(a) "+tipo);
    }
    
}
