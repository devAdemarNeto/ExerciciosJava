package Java.EstudosJava.Collections.List;

import java.util.ArrayList;
import java.util.List;

public class CollectionsList {
    public static void main(String[] args) {
        //Generics: garante a tipagem dos elementos inseridos fica entre <>
        // Se não indicar o tipo, pode colocar qualquer tipo na lista
        List <String> linguagens = new ArrayList();
        linguagens.add("Java");
        linguagens.add("JavaScrit");
        linguagens.add(0, "C#"); //determina a posição que será salvo


        imprimir(linguagens);
        System.out.println(linguagens.isEmpty()); // verifica se está vazio
        System.out.println(linguagens.size()); //tamanhp da lista
        System.out.println(linguagens.get(1)); //busca por index
    }
    static void imprimir(List <String> lista){
        System.out.println("Imprimindo lista: ");
        for (String e: lista){
            System.out.println(e);
        }
    }
}
