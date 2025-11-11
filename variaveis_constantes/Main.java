package variaveis_constantes;//localização

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Voce é capaz se ser um programador java?");
        String resposta = entrada.next();

        System.out.println("Qual sua idade?");
        int idade = entrada.nextInt();

        System.out.println("Digite seu bloco?");
        char bloco = entrada.next().charAt(0);

        System.out.println("Você passa por inseguranças alimentares?");
        boolean TrueOrFalse = entrada.nextBoolean();

        System.out.println("Qual seu salário?");
        float salario = entrada.nextFloat();

        System.out.println("Digite um numero grande com virgula");
        double numeroGrandeCVirgula = entrada.nextDouble();

        System.out.printf("Programado: %s, idade: %d, bloco: %c, insegurança alimentar: %b, salario: %.2f, numero grande %.2f",
                resposta, idade, bloco, TrueOrFalse, salario, numeroGrandeCVirgula);
    }
}

//ficar bastante atento a entrada de dados do usuario nos numeros decimais principalmente 
//boolean: %b (Formata o valor como true ou false)
//int / Integer	%d ou %i (Formata o valor como um número inteiro decimal)
//String: %s (Formata o valor como uma string.)
//char:	%c (Formata o valor como um caractere.)
//double / float: %f (Formata o valor como um número de ponto flutuante (decimal)).
