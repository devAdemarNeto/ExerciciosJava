package Java.Modulo04_Avancado.Ex02FiltroDeLista;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20));
        System.out.println("Antes: " + numeros);
        numeros.removeIf(n -> n % 2 ==1);
        System.out.println("Depois: " + numeros);

        ArrayList<String> nomes = new ArrayList<>(List.of("Ana", "Alberto", "Pedro", "Amanda"));
        System.out.println("Antes: " + nomes);
        nomes.removeIf(n -> n.startsWith("A"));
        System.out.println("Depois: " + nomes);
    }
}
