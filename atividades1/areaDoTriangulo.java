package atividades;
import java.util.Scanner;

public class areaDoTriangulo {
       public static void main(String[] args) {
        System.out.println("Insira a altura:");
        Scanner entrada = new Scanner(System.in);
        double base = entrada.nextDouble();
        System.out.println("Insira a base:");
        double altura = entrada.nextDouble();
        double resultado = (base * altura) / 2;
        System.out.println("A area é:"+ resultado);
    }
}
