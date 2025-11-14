package EstruturasCondicionais;

import java.util.Scanner;

public class EstruturasCondicionaisIfElse {

    public static void main(String[] args) {
        System.out.println("Pense em um numero: ");
        System.out.println("Pensou? ");
        Scanner entrada = new Scanner(System.in);
        int numero = entrada.nextInt();
        System.out.println("Agora soma mais 2");
        System.out.println("somou?");
        numero = numero+2;
        numero = numero -2;
        
        System.out.println("numero que voce pensou é: " + numero);
        
        if (numero < 10) {
            System.out.println("o numero é menor que 10");
        } else if (numero > 10) {
            System.out.println("o numero é maior que 10");
        }else if (numero > 100){
            System.out.println("o numero é maior que 100");
        }
    }

}
