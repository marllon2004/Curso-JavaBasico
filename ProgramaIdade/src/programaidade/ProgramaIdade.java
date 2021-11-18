package programaidade;

import java.util.Scanner;

public class ProgramaIdade {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ano de Nascimento: ");
        int nasc = teclado.nextInt();
        
        int idade = 2021-nasc;
        
        System.out.println("Sua idade é "+ idade);
        
        if(idade >= 18){
            System.out.println("Maior de Idade");
        }
        else{
            System.out.println("Menor de Idade");
        }
    }
    
}
