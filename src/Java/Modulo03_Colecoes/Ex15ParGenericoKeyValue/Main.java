package Java.Modulo03_Colecoes.Ex15ParGenericoKeyValue;

public class Main {
    public static void main(String[] args) {
        Par<String, Integer> par1 = new Par<>("Idade", 38);
        Par<String, String> par2 = new Par<>("País", "Brasil");
        Par<String, Double> par3 = new Par<>("Preço", 9.99);

        par1.exibir();
        par2.exibir();
        par3.exibir();

    }
}
