import java.util.InputMismatchException;
import java.util.Scanner;
public class ExemploTryCatch {
    public static void main(String[] args) {
        String nome, sobrenome;
        int idade;
        double altura;
        Scanner scan = new Scanner(System.in);
        try{
            System.out.println("***** Sobre Mim *****");
            System.out.println(" ");
            System.out.print("Seu nome: ");
            nome = scan.nextLine();
            System.out.print("Seu sobrenome: ");
            sobrenome = scan.nextLine();
            System.out.print("Sua idade: ");
            idade = scan.nextInt();
            System.out.print("Sua altura: ");
            altura = scan.nextDouble();

            scan.close();

            System.out.println(" ");
            System.out.println("***********************************************************");

            System.out.println("Nome completo: " + nome + " " + sobrenome + ".");
            System.out.println("Idade: " + idade + " anos.");
            System.out.println("Altura: " + altura + " m.");

        }catch(InputMismatchException e){
            System.out.println("********* ERRO *********");
            System.out.println("Confimar os valores nos campos idade ou altura.");
            System.out.println("Idade deve ter valores númericos;");
            System.out.println("Valor de altura deve estar com vírgula.");
        }
        

        
    }
}
