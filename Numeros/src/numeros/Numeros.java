package numeros;

import java.util.Scanner;

public class Numeros {

    public static void main(String[] args) {
        int n, soma = 0;
        String resp;
        
        Scanner teclado = new Scanner(System.in);
        
        do{
            System.out.print("Digite um número: ");
            n = teclado.nextInt();
            
            soma += n;
            
            System.out.println("Quer continuar? [S/N]");
            resp = teclado.next();
        }while(resp.equals("S"));
        
        System.out.println("Soma total: "+soma);
    }
    
}
