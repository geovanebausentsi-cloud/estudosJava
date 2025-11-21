package OperadoresLogicos;

import java.util.Scanner;

public class OperadoresLogicos {

    public static void main(String[] args) {
        boolean var1 = true;
        boolean var2 = false;

        System.out.println("and: " + (var1 && var2));//and  = false
        System.out.println("or: " + (var1 || var2));//or = true 
        System.out.println("xor: " + (var1 ^ var2)); //xor(^) preposições inversas var1 = false, var2 = true
        System.out.println("not: " + (!var1));//not = false

        /*Atividade:
            Escreva um programa para saber se o usuario é maior de idade:*/
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("insira sua data de nascimento");
        int dtaNasci = entrada.nextInt();
        
        if(dtaNasci >= 18){
            System.out.println("É maior de idade");
        }else{
            System.out.println("Não é maior de idade");
        }
    }
}
