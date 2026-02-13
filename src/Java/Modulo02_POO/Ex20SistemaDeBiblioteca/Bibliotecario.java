package Java.Modulo02_POO.Ex20SistemaDeBiblioteca;

public class Bibliotecario extends Pessoa{
    String matricula;

    public Bibliotecario(String nome, String cpf, String matricula) {
        super(nome, cpf);
        this.matricula = matricula;
    }
}
