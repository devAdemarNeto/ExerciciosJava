package Java.Modulo02_POO.Ex20SistemaDeBiblioteca;

public class Leitor extends Pessoa{
    String[] livros = new String[5];
    int totalLivros = 0;

    public Leitor(String nome, String cpf) {
        super(nome, cpf);

    }
}
