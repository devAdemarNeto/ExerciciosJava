package Java.Modulo04_Avancado.Ex08EstatisticasDeVendas;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<Venda> vendas = new ArrayList<>();
        vendas.add(new Venda("Televisão", 4850.00, 2));
        vendas.add(new Venda("Sofá", 2460.00, 1));
        vendas.add(new Venda("Ventilador", 200.00, 10));
        vendas.add(new Venda("Liquidificador", 86.00, 18));

        System.out.println("=== Relatório de Vendas ===");

        double totalFaturamento = vendas.stream()
                .mapToDouble(v -> v.getValor())
                .sum();
        System.out.println("Faturamento total: R$" + totalFaturamento );

        int quantidadeVendas = vendas.stream()
                .mapToInt(q -> q.getQuantidade())
                .sum();
        System.out.println("Qauntidade Vendida: " + quantidadeVendas);

        double tiketMedio = vendas.stream()
                .mapToDouble(t -> t.getValor())
                .average()
                .orElse(0);
        System.out.println("Tiket Medio: R$ " + tiketMedio );

        Optional<Venda> maior = vendas.stream()
                .max((a,b) -> Double.compare(a.getValor(), b.getValor()));
        maior.ifPresent(m -> System.out.println("Maior Valor: " + m.getValor() ));


        Optional<Venda> menor = vendas.stream()
                .min((a,b) -> Double.compare(a.getValor(), b.getValor()));
        menor.ifPresent( m -> System.out.println("Menor Valor: " + m.getValor()));
    }
}
