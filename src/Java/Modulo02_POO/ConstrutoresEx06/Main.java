package Java.Modulo02_POO.ConstrutoresEx06;

public class Main {


    public static void main(String[] args) {
        // Usando construtor padrão
        Pessoa p1 = new Pessoa();
        p1.setNome("Ademar");
        p1.setIdade(38);
        System.out.println("Nome: " + p1.getNome());

        // Usando construtor com parâmetros
        Pessoa p2 = new Pessoa("Maria", 25, "123.456.789-00");
        System.out.println("Nome: " + p2.getNome());

    }




}
