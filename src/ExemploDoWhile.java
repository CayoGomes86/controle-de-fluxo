import java.util.Random;
public class ExemploDoWhile {
    public static void main(String[] args) {
        System.out.println("Discando...");
        int tentativas = 0;
        do{
            
        System.out.println("Chamando...");
        
        tentativas = tentativas + 1;
        
        }while(tocando() && tentativas < 5);
        
        if(tentativas == 5){
            System.out.println("Encaminhado para Caixa de Mensagens");
        }else{
            System.out.println("Alô!!!");

        }

    
    }
    public static boolean tocando(){
        boolean atendeu = new Random().nextInt(3) == 1;
        return !atendeu;

    }
}
