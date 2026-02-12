package Java.EstudosJava.Collections.Queue;

import java.util.Collection;
import java.util.PriorityQueue;

public class FilasPrioridade {
    // Tras regras de prioridade de uma fila
    public static void main(String[] args) {
        PriorityQueue< Cliente > clientes = new PriorityQueue<>();
        clientes.add(new Cliente("Jose", 1));
        clientes.add(new Cliente("Marcos", 1));
        clientes.add(new Cliente("Maria Lucia", 0));
        clientes.add(new Cliente("Estefany", 1));
        clientes.add(new Cliente("Joaquim da Silva", 0));

        imprimirClientes(clientes);
    }
    // não se assuste com o nível de abstração, em breve você vai entender
    static void imprimirClientes(Collection clientes){
        System.out.println("***Listando os inscritos***");
        for(Object cliente: clientes){
            System.out.println(cliente);
        }
    }
}


