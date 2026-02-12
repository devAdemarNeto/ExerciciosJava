package Java.EstudosJava.Collections.Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class CollectionLinkedHashSet {
    public static void main(String[] args) {

        // LinkedHashSet a ordem de inserção tem relevancia

        Set inscritos = new LinkedHashSet();

        inscritos.add("Marcos");
        inscritos.add("Lucas");
        inscritos.add("Antonio");
        inscritos.add("Mirela");
        inscritos.add("Alessandra");
        inscritos.add("Felipe");
        inscritos.add("Sofia");
// opa Lucas já fez a sua inscrição
        inscritos.add("Lucas");





    }
}
