package Java.Modulo02_POO.Ex20SistemaDeBiblioteca;

public class Emprestimo implements Emprestavel{

    @Override
    public void emprestar(Livro livro, Leitor leitor) {
        if (livro.getDisponivel()){
            livro.setDisponivel(false);
            leitor.livros[leitor.totalLivros] = livro.getTitulo();
            leitor.totalLivros++;
            System.out.println("Livro cadastrado com sucesso!!");
        }else {
            System.out.println("Livro indisponível");
        }
    }


    @Override
    public void devolver(Livro livro, Leitor leitor) {
        if (!livro.getDisponivel()){
            livro.setDisponivel(true);
            leitor.totalLivros--;
            leitor.livros[leitor.totalLivros] = null;
            System.out.println("Livro devolvido com sucesso!!");
        }
    }
}
