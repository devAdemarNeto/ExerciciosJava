package Java.Modulo02_POO.AlunoEx05;

public class Aluno {
    String nome;
    double nota1;
    double nota2;
    double nota3;

    public double calcularMedia(){
        double media = (this.nota1 + this.nota2 + this.nota3) / 3;
        return media;
    }

    public void verificarAprovacao(){
        System.out.println("Aluno: " + this.nome);
        System.out.printf("Notas: %.1f, %.1f, %.1f%n", nota1, nota2, nota3);
        if (calcularMedia() >= 7){
            System.out.printf("Media: %.2f%n", calcularMedia());
            System.out.println("Situação: APROVADO ✓");
        }else {
            System.out.printf("Media: %.2f%n", calcularMedia());
            System.out.println("Situação: REPROVADO ✓");
        }
    }
}
