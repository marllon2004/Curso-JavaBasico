package vetor02;

import java.util.Scanner;

public class Vetor02 {

    public static void main(String[] args) {
        String mes[] = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        int tot[] = {31, 28, 31, 30, 31, 30, 31, 30, 31, 30, 31, 30};
        int ano;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Qual ano estamos? ");
        ano = teclado.nextInt();
        
        if(ano % 4 == 0){ //Se ano for bissexto, fevereiro tem 29 dias 
            tot[1] = 29; 
            for(int i = 0; i < mes.length; i++){
                System.out.println("Mês: "+ mes[i]);
                System.out.println("Total de dias: "+ tot[i]);
                System.out.println("----------------------------");
            }
        }else{ //Se não, fevereiro tem 28 dias
            for(int i = 0; i < mes.length; i++){
                System.out.println("Mês: "+ mes[i]);
                System.out.println("Total de dias: "+ tot[i]);
                System.out.println("----------------------------");
            }
        }
    }
    
}
