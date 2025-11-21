
package EstruturasDeRepeticao;
import java.util.Scanner;

public class While {
      public static void main(String[] args) {
          
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero para tabuada: ");
        int numero = entrada.nextInt(); 
          
       int multiplicador = 1;
       
        while(multiplicador <= 10){
        System.out.println(numero + " X " + multiplicador+"= "+(numero * multiplicador));       multiplicador++;
        }

    }
}
