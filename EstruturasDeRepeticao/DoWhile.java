package EstruturasDeRepeticao;

import java.util.Scanner;
import java.util.Random;

public class DoWhile {

    public static void main(String[] args) {

        Random random = new Random();

        int rdn = random.nextInt(10) + 1;
        int chute;

        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("Digite um numero de 1 a 10: ");
            chute = entrada.nextInt();

            if (chute == rdn) {
                System.out.println("Ganhou!!");
            } else if (chute < rdn) {
                System.out.println("O numero secreto é maior que o seu!!");
            } else {
                System.out.println("O numero secreto é menor que o seu!!");
            }

        } while (chute != rdn);
    }
}
