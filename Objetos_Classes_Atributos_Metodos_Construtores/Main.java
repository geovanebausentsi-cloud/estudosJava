package Objetos_Classes_Atributos_Metodos_Construtores;

public class Main {

    public static void main(String[] args) {
        // Correção: Aspas no nome e 'f' no preço
        Produto prod1 = new Produto(254578, "Desodorante Ipe", 5.50f);
        Produto prod2 = new Produto(254579, "Desodorante Rexona", 6.50f);

        // Testando se funcionou
        prod1.imprimirDados();
        prod2.imprimirDados();
        
        float subtotal = prod1.subtotal(10);
        System.out.println("Subtotal:" + prod1.nome + " = R$" + subtotal);
        
        float subtotal2 = prod2.subtotal(15);
        System.out.println("Subtotal:" + prod2.nome + " = R$" + subtotal2);
        
    }
}