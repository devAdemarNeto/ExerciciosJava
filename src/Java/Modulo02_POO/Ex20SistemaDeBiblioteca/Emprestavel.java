package Java.Modulo02_POO.Ex20SistemaDeBiblioteca;

public interface Emprestavel {
    void emprestar(Livro livro,Leitor leitor);
    void devolver (Livro livro, Leitor leitor);
}
