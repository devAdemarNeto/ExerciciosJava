package Java.Modulo03_Colecoes.Ex12ListaGenerica;

import java.util.ArrayList;

public class MinhaLista<T> {
    ArrayList<T> lista = new ArrayList<>();

    public void adicionar(T item){
        lista.add(item);
        System.out.println(item + " Adicionado com sucesso!!");
    }

    public void remover(int indice){

        if (lista.isEmpty()){
            System.out.println("lista vazia");
        }else{
            if (indice >= 0 && indice < lista.size()){
                lista.remove(indice);
                System.out.println("Removido com sucesso!!");
            }else {
                System.out.println("Item não encontrado");
            }
        }

    }

    public void buscar(int indice){
        if (lista.isEmpty()){
            System.out.println("lista vazia");
        }else{
            if (indice >= 0 && indice < lista.size()){
                lista.get(indice);
                System.out.println("item: " + lista.get(indice));
            }else {
                System.out.println("Item não encontrado");
            }
        }
    }

    public void tamanho(){
        System.out.println("A lista tem " + lista.size() + " elementos");
    }
}
