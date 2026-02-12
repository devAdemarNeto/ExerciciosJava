package Java.EstudosJava.Collections.Deque;

import java.util.Deque;
import java.util.LinkedList;

public class CollectionDeque {
    // em pilhas o ultimo a ser adicionado é primeiro a ser retirado
    //permitindo a inserção e remoção de elementos tanto no início quanto no fim.

    public static void main(String[] args) {
        Deque<String> itensPrateleira = new LinkedList<>();
        //ver add vs push
        itensPrateleira.push("item 01");

        itensPrateleira.push("item 02");
        //itensPrateleira.add("item 02"); //testar

        itensPrateleira.push("item 03");

        itensPrateleira.push("item 04"); //testar
        //itensPrateleira.add("item 04"); //testar

        imprimir(itensPrateleira);

        System.out.println("Visualizando os itens conforme sequencia primeiro / ultimo");
        String itemFrenteTop = itensPrateleira.getFirst(); //recupera MAS não remove
        String itemFundoBaixo = itensPrateleira.getLast(); //recupera MAS não remove, caso pilha vazia, lança uma exceção

        System.out.println("Item da frente ou no topo:" + itemFrenteTop);
        System.out.println("Item da fundo ou em baixo:" +itemFundoBaixo);

        System.out.println("Obtendo (removendo) os itens conforme sequencia primeiro / ultimo");

        itemFrenteTop = itensPrateleira.poll(); //recupera E não remove
        itemFundoBaixo = itensPrateleira.peekLast(); //recupera MAS não remove, caso pilha vazia, retorna null

        System.out.println("Item da frente ou no topo:" + itemFrenteTop);
        System.out.println("Item da fundo ou em baixo:" +itemFundoBaixo);

        imprimir(itensPrateleira);
    }


    static void imprimir(Deque<String> itensPrateleira){
        System.out.println("** Imprimindo os itens da plateleira **");
        for(String item: itensPrateleira){
            System.out.println(item);
        }
    }
}
