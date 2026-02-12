package Java.Modulo02_POO.Ex02Produto;

public class Produto {
    String nome;
    double preco;
    int quantidade;

    public double calcularTotal(){
        return preco * quantidade;
    }

    public void exibirInfo(){
        System.out.println("Produto: " + nome);
        System.out.printf("Preço unitario: R$ %.2f%n" + preco );
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Total: R$ " + calcularTotal());
    }
}
