package Java.EstudosJava.Collections.Set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CollectionTreeSet {

    public static void main(String[] args) {

        // Ordena em ordem alfabetica
        Set inscritos = new TreeSet();
        inscritos.add("Marcos");
        inscritos.add("Lucas");
        inscritos.add("Antonio");
        inscritos.add("Mirela");
        inscritos.add("Alessandra");
        inscritos.add("Felipe");
        inscritos.add("Sofia");

        Set inscritosAprovados = new HashSet();
        inscritos.add("Marcos");
        inscritos.add("Lucas");
        inscritos.add("Antonio");
        inscritos.add("Mirela");
        inscritos.add("Alessandra");
        inscritos.add("Felipe");
        inscritos.add("Sofia");

        Set aprovados = new TreeSet(inscritos);

    }
}
