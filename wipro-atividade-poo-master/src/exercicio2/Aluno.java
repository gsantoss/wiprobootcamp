package exercicio2;

public class Aluno {
    private String nomeAluno;
    private String matricula;
    private Double peso1 = 1.5;
    private Double peso2 = 2.0;

    private Double media(Double notaProva1, Double notaProva2, Double notaTrabalho){
        Double mediaPonderada;
        return mediaPonderada = ((notaProva1*this.peso1)+(notaProva2*this.peso1)+(notaTrabalho*this.peso2))/(this.peso1+this.peso2);
    }
    public Boolean vaiRecuperacao(Double notaProva1, Double notaProva2, Double notaTrabalho){
        if(media(notaProva1,notaProva2, notaTrabalho) < 7){
            return true;
        }
        return false;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

}
