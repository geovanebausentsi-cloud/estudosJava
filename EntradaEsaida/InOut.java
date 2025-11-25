
package EntradaEsaida;
import java.util.Scanner;

public class InOut {
    public static void main(String [] arg){
        
        System.out.println("Insira uma palavra: ");
        
        Scanner entrada = new Scanner(System.in);
        String palavra = entrada.next();
        
        System.out.println("A Palavra digitada foi: " + palavra);
        
        
    } 
}
