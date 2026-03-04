package Java.Modulo04_Avancado.Ex07TransformarDados;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Arroz", 5.89));
        produtos.add(new Produto("Feijão", 8.50));
        produtos.add(new Produto("Macarrão", 6.89));
        produtos.add(new Produto("Carne", 41.89));

        List<String> nomes = produtos.stream()
                .map(n -> n.getNome())
                .collect(Collectors.toList());
        System.out.println("Nomes: " + nomes);

        List<Double> comDesconto = produtos.stream()
                .map(d -> d.getPreco() * 0.90)
                .collect(Collectors.toList());
        System.out.println("Com desconto: " + comDesconto);

        List<Double> dolar = produtos.stream()
                .map(c -> c.getPreco() / 5.0)
                .collect(Collectors.toList());
        System.out.println("Em dolar: " + dolar);
    }

}
