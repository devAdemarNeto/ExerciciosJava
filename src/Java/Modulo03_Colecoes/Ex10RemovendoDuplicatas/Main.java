package Java.Modulo03_Colecoes.Ex10RemovendoDuplicatas;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> linguagens = new ArrayList<>();

        linguagens.add("Java");
        linguagens.add("Python");
        linguagens.add("Java");
        linguagens.add("C++");
        linguagens.add("Python");
        linguagens.add("JavaScript");
        linguagens.add("Java");

        System.out.println("Lista original" + linguagens);


        HashSet<String> lingagensNoRep = new HashSet<>(linguagens);

        System.out.println(lingagensNoRep);
        int removidos = linguagens.size() - lingagensNoRep.size();
        System.out.println("Total removidos: " + removidos);

    }


}
