package Java.Modulo04_Avancado.Ex09ProcessamentoDEAlunos;

public class Aluno {
    private String nome;
    private double nota;
    private String curso;

    public Aluno(String nome, double nota, String curso) {
        this.nome = nome;
        this.nota = nota;
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
