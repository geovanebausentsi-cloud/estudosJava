package EstruturasCondicionais;

public class EstruturasCondicionaisSwitchCase {

    public static void main(String[] args) {
        
        //switch case
        
        String cor = "vermelho";

        switch (cor) {
            case "amarelo":
                System.out.println("Cor amarela");
                break;
            case "verde":
                System.out.println("Cor verde");
                break;
            case "azul":
                System.out.println("Cor azul");
                break;
            case "laranja":
                System.out.println("Cor laranja");
                break;  
            default: 
                 System.out.println("não tem essa cor");
        }
    }

}
