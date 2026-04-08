import java.util.concurrent.ThreadLocalRandom;
public class ExemploWhile {
    public static void main(String[] args) {
       double mesada = 50.0;
       
       while(mesada > 0){
        double valorDoce = valorAleatorio();

        System.out.println("Doce adicionado no carrinho: " + valorDoce);
        mesada -= valorDoce;
        if (mesada <= 0){
            System.out.println("Joãozinho gastou toda sua mesada");
        }

       }
       
        
    }
    public static double valorAleatorio(){
        double valor = ThreadLocalRandom.current().nextDouble(10);
        return valor;
    }
}
