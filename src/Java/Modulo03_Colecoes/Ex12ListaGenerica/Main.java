package Java.Modulo03_Colecoes.Ex12ListaGenerica;

public class Main {
    public static void main(String[] args) {
        // Testando com Strings
        System.out.println("=== MinhaLista de Strings ===");
        MinhaLista<String> nomes = new MinhaLista<>();
        nomes.adicionar("Java");
        nomes.adicionar("Python");
        nomes.adicionar("JavaScript");
        nomes.tamanho();
        nomes.buscar(1);
        nomes.remover(0);
        nomes.tamanho();

        System.out.println();

        // Testando com Integers
        System.out.println("=== MinhaLista de Integers ===");
        MinhaLista<Integer> numeros = new MinhaLista<>();
        numeros.adicionar(10);
        numeros.adicionar(20);
        numeros.adicionar(30);
        numeros.tamanho();
        numeros.buscar(2);
        numeros.remover(0);
        numeros.tamanho();
    }
}
