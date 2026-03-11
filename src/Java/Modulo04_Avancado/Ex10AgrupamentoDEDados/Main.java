package Java.Modulo04_Avancado.Ex10AgrupamentoDEDados;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Funcionario("Ademar", "TI", 5000.00));
        funcionarios.add(new Funcionario("Thamily", "TI", 6000.00));
        funcionarios.add(new Funcionario("Cleonice", "RH", 4500.00));
        funcionarios.add(new Funcionario("Carla", "RH", 3800.00));
        funcionarios.add(new Funcionario("Filippe", "Financeiro", 7000.00));
        funcionarios.add(new Funcionario("Reinaldo", "Financeiro", 5500.00));

        // Agrupar por departamento
        Map<String, List<Funcionario>> porDepto = funcionarios.stream()
                .collect(Collectors.groupingBy(f -> f.getDepartamento()));
        porDepto.forEach((depto, lista) -> {
            System.out.println(depto + ": ");
            lista.forEach(f -> System.out.println("  - " + f.getNome()));
        });

        // Contar por departamento
        Map<String, Long> contarFunc = funcionarios.stream()
                .collect(Collectors.groupingBy(f -> f.getDepartamento(),
                        Collectors.counting()
                ));
        System.out.println("\nFuncionários por departamento: " + contarFunc);

        // Média salarial por departamento
        Map<String, Double> mediaSalarial = funcionarios.stream()
                .collect(Collectors.groupingBy(f -> f.getDepartamento(),
                        Collectors.averagingDouble(f -> f.getSalario())
                ));
        System.out.println("Média salarial: " + mediaSalarial);

        // Maior salário por departamento
        Map<String, Optional<Funcionario>> maiorSalario = funcionarios.stream()
                .collect(Collectors.groupingBy(f -> f.getDepartamento(),
                        Collectors.maxBy((a, b) -> Double.compare(a.getSalario(), b.getSalario()))
                ));
        maiorSalario.forEach((depto, func) ->
                func.ifPresent(f -> System.out.println("Maior salário " + depto + ": " + f.getNome() + " - R$ " + f.getSalario()))
        );
    }
}
