public class ResultadoEscolar {
    public static void main(String[] args) {
        double nota = 7.1;

       /* if(nota >= 7){
            System.out.println("APROVADO");
        }else if((nota >= 4) && (nota < 7)){
            System.out.println("RECUPERAÇÃO");
        }else{
            System.out.println("REPROVADO");
        }
        */
       String resultado = nota >= 7 ? "APROVADO" : nota >= 4 && nota < 7 ? "RECUPERAÇÃO" : "REPROVADO";
       System.out.println(resultado);
    }
}
