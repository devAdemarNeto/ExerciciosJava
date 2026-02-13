package Java.Modulo02_POO.Ex20SistemaDeBiblioteca;

public class Main {
    public static void main(String[] args) {
        // Criando livros
        Livro livro1 = new Livro("Harry Potter", "J.K. Rowling", true);
        Livro livro2 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", true);

        // Criando leitor
        Leitor leitor = new Leitor("Ademar", "003.503.022-43");

        // Criando bibliotecário
        Bibliotecario biblio = new Bibliotecario("Carlos", "111.222.333-44", "BIB001");

        // Criando objeto empréstimo
        Emprestimo emprestimo = new Emprestimo();

        // Teste 1: Emprestar livro
        System.out.println("=== Emprestando Harry Potter ===");
        emprestimo.emprestar(livro1, leitor);

        // Teste 2: Tentar emprestar o mesmo livro
        System.out.println("\n=== Tentando emprestar Harry Potter de novo ===");
        emprestimo.emprestar(livro1, leitor);

        // Teste 3: Emprestar outro livro
        System.out.println("\n=== Emprestando O Senhor dos Anéis ===");
        emprestimo.emprestar(livro2, leitor);

        // Teste 4: Devolver livro
        System.out.println("\n=== Devolvendo Harry Potter ===");
        emprestimo.devolver(livro1, leitor);

        // Teste 5: Emprestar novamente
        System.out.println("\n=== Emprestando Harry Potter novamente ===");
        emprestimo.emprestar(livro1, leitor);
    }
}
