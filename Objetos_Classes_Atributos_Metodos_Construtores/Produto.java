package Objetos_Classes_Atributos_Metodos_Construtores;

public class Produto {
    //atributos
    int codBarras;
    String nome;
    float preco;

    //constructor
    Produto(int codBarras, String nome, float preco) {
        this.codBarras = codBarras;
        this.nome = nome;
        this.preco = preco;
    }
    //metodos
    void imprimirDados() {
        System.out.println("COD:" + codBarras);
        System.out.println("Nome: " + nome);
        System.out.println("R$: " + preco);
    }
    
    float subtotal(int quantidade){
        return quantidade * preco;
    }
    
    
    
}


