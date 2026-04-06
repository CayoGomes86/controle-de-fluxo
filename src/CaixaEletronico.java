public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 100;
        double saque = 89.90;

        if (saldo > saque){
            saldo = saldo - saque;
            System.out.printf("Novo saldo: %.2f", saldo);
        }else{
            System.out.println("Saldo insuficiente");
        }
        
    }
}
