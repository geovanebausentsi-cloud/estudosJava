
package atividades;
import java.util.Scanner;

public class conversor {
    public static void main(String[] args){
        // formula F = (°C × 9/5) + 32 
        System.out.println("insira a temperatura em graus Celsius");
        Scanner entrada = new Scanner(System.in);
        double Celsius = entrada.nextDouble();
        double Fahrenheit = (Celsius * 9/5) + 32;
        System.out.println("A temperatura convertida para Fahrenheit é" + Fahrenheit);    
    }
}
