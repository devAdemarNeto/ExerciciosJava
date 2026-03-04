package Java.Modulo04_Avancado.Ex05TransformadorDeTextos;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<String, String> maiuscula = m -> m.toUpperCase();
        Function<String, String> prefixo = p -> "Sr./Sra" + p;
        Function<String, String> rEspacos = r -> r.replaceAll("\\s+"," ");

        Consumer<String> decoracao = d -> System.out.println(">>> " + d + " <<<");
        int[] cont = {1};
        Consumer<String> imprimir = i -> {
            System.out.println(cont[0] + ". " + i);
            cont[0]++;
        };


        List<String> nomes = List.of("ana", "pedro", "  maria   silva  ");

// Aplicar Function
        nomes.forEach(n -> System.out.println(maiuscula.apply(n)));
        nomes.forEach(n -> System.out.println(prefixo.apply(n)));

// Aplicar Consumer
        nomes.forEach(decoracao);
        nomes.forEach(imprimir);

    }
}
