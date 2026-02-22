package Java.Modulo03_Colecoes.Ex13OrdenacaoProdutos;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Arroz", 5.35));
        produtos.add(new Produto("feijão", 8.50));
        produtos.add(new Produto("macarrãp", 5.50));
        produtos.add(new Produto("café", 15.50));

        Collections.sort(produtos);

        for (Produto p : produtos) {
            System.out.println(p.getNome() + " - R$ " + p.getPreco());
        }

    }
}
