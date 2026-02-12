package Java.Modulo02_POO.Ex02Produto;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.nome = "Notebook";
        produto.preco = 2500.00;
        produto.quantidade = 3;
        produto.exibirInfo();
    }
}
