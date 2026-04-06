public class ExemploForArray {
    public static void main(String[] args) {
        
        String [] alunos = {"Beatriz", "Rodrigo", "Cesár", "Paulo"};
        System.out.println("USANDO FOR");
        for(int i = 0; i < alunos.length; i ++){
            System.out.println("Para o aluno no índice " + (i + 1) + ": " + alunos[i]);
        }// lembrando que os índices em array sempre começam em zero.

        System.out.println("USANDO FOREACH");
        for (String aluno : alunos){
            System.out.println("Nome do aluno: " + aluno);
        }
    }
}
