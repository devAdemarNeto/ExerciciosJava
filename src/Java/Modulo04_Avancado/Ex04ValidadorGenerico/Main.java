package Java.Modulo04_Avancado.Ex04ValidadorGenerico;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<String> naoVazio = v -> !v.isEmpty();
        Predicate<String> menosTres = t -> t.length() >= 3;
        Predicate<String> semNum = s -> !s.matches(".*\\d.*");

        Predicate<Integer> positivo = p -> p > 0;
        Predicate<Integer> par = pa -> pa % 2 == 0;
        Predicate<Integer> maiorDez = md -> md > 10;

        System.out.println("Java - não vazio E >= 3: " + naoVazio.and(menosTres).test("Java"));
        System.out.println("Ab - não vazio E >= 3: " + naoVazio.and(menosTres).test("Ab"));
        System.out.println("20 - positivo E par: " + positivo.and(par).test(20));

    }
}
