package Java.Modulo03_Colecoes.Ex11CaixaGenerica;

public class Main {
    public static void main(String[] args) {
        Caixa<String> caixa1 = new Caixa<>();
        caixa1.guardar("Chocolate");

        Caixa<Integer> caixa2 = new Caixa<>();
        caixa2.guardar(42);

        Caixa<Double> caixa3 = new Caixa<>();
        caixa3.guardar(3.14);

        caixa1.abri();
        caixa2.abri();
        caixa3.abri();
    }
}
