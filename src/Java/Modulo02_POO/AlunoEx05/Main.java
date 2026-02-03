package Java.Modulo02_POO.AlunoEx05;

public class Main {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Ademar";
        aluno1.nota1 = 8.0;
        aluno1.nota2 = 7.5;
        aluno1.nota3 = 9.0;

        aluno1.calcularMedia();
        aluno1.verificarAprovacao();
    }


}
