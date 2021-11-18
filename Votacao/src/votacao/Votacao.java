package votacao;

import java.util.Scanner;

public class Votacao {

    public static void main(String[] args) {
        int nasc, idade;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Nata de Nascimento: ");
        nasc = teclado.nextInt();
        
        idade = 2021 - nasc;
        
        if(idade < 16){
            System.out.println("Não Vota!");
        }
        else if(idade >= 16 && idade < 18 || idade > 70){
        System.out.println("Voto Opcional!");
        }
        else{
            System.out.println("Voto Obrigatório!");
        }
}
}