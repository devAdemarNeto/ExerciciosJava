package Java.Modulo04_Avancado.Ex06FiltrarEListarProdutos;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("arroz", 5.69, "Cesta Básica"));
        produtos.add(new Produto("feijão", 8.59,"Cesta Básica"));
        produtos.add(new Produto("macarrão", 4.52,"Cesta Cásica"));
        produtos.add(new Produto("Televisão", 5899.00, "Eletrônico"));
        produtos.add(new Produto("sabão", 7.86,"Cesta Cásica" ));
        produtos.add(new Produto("Celular", 4898.00, "Eletrônico"));

        produtos.stream()
                .filter(p -> p.getPreco() > 50)
                .forEach(p -> System.out.println(p.getNome() + " - R$ " + p.getPreco()));

        produtos.stream()
                .filter(p -> p.getCategoria().equals("Eletrônico"))
                .forEach(p -> System.out.println(p.getNome() + " - R$ " + p.getPreco()));


        long total = produtos.stream()
                .filter(p -> p.getPreco() <= 30)
                .count();
                 System.out.println("Total abaixo de R$ 30: " + total);
    }
}
