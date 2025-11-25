package OperacoesAritimeticas;

public class Operacoes {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        int resultado;
        
        //operaçãoes aritméticas basicas
        System.out.println("Soma: " + (num1 + num2)); //15
        System.out.println("Subtração: " + (num1 - num2));//5
        System.out.println("Multiplicação: " + (num1 * num2));//50
        System.out.println("Divisão:" + (num1 / num2));//2
        System.out.println("Resto da divisão: " + (num1 % num2));//0
        

        //incremento e decremento pré-fixados
        resultado = ++num1; //num 1 é um incremento para 11 antes da atribuição
        System.out.println("Pré-decremento: " + resultado);

        resultado = --num2; //num2 é incrementado para 4 antes da atribuição
        System.out.println("Pré-decremento: " + resultado);
        
        
        
        
        //incremento e decremento pos-fixados
        resultado = num1++; //atribui 11 ao resultado, depois incrementa n1 para 12
        System.out.println("Pos-decremento: " + resultado);
        
        resultado = num2++; //atribui 4 ao resultado, depois incrementa n1 para 3
        System.out.println("Pos-decremento: " + resultado);
    
    }
}
