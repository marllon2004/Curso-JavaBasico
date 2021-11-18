package comaparacaostring;

public class ComaparacaoString {

    public static void main(String[] args) {
        String nome1 = "Marllon";
        String nome2 = "Marllon";
        String nome3 = new String("Marllon");
        String resultado;
        resultado = (nome1.equals(nome3))?"igual":"diferente";
        System.out.println(resultado);
    }
    
}
