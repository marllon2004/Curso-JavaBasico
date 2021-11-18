package contador01;

public class Contador01 {

    public static void main(String[] args) {
    int contador = 0;
    
    while(contador < 10){
        contador++;
        
        if(contador == 2 || contador == 3 || contador == 4){
            continue;
        }
        else if(contador == 7){
            break;
        }
        
        System.out.println("Cambalhota "+contador);
    }
    }
    
}
