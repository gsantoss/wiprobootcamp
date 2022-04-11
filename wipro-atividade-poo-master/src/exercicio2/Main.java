package exercicio2;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.setNomeAluno("Guilherme");
        aluno1.setMatricula("teste2024");

        if(aluno1.vaiRecuperacao(50.0, 30.0, 5.0)){
            System.out.println("O aluno " + aluno1.getNomeAluno() + " da matricula " + aluno1.getMatricula() + " vai pra recuperação!");
        } else {
            System.out.println("O aluno " + aluno1.getNomeAluno() + " da matricula " + aluno1.getMatricula() + " não vai pra recuperação!");
        }
    }
}
