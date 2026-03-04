package Java.Modulo04_Avancado.Ex01OrdenacaoComLambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Ana");
        nomes.add("Carlos");
        nomes.add("Maria");
        nomes.add("Pedro");
        nomes.add("Zara");


        Collections.sort(nomes, (a,b) -> a.compareTo(b));
        System.out.println(nomes);

        Collections.sort(nomes, (a,b) -> Integer.compare(a.length(),b.length()));
        System.out.println(nomes);

        Collections.sort(nomes, (a,b) -> Character.compare(a.charAt(a.length() -1),b.charAt(b.length()-1)));
        System.out.println(nomes);
    }
}
