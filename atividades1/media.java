package Atividades1;

import java.util.Scanner;

public class media {

    public static void main(String[] args) {
        System.out.println("Insira o valor 1");
        Scanner entrada = new Scanner(System.in);
        double valor1 = entrada.nextDouble();
        System.out.println("Insira o valor 2");
        double valor2 = entrada.nextDouble();
        double resultado = (valor1 + valor2) / 2;
        System.out.println("A média é:"+ resultado);
    }

}
