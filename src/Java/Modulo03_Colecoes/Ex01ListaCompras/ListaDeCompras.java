package Java.Modulo03_Colecoes.Ex01ListaCompras;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaDeCompras {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> lista = new ArrayList<>();
        int opcao;
        String item;

        do {
            System.out.println("=== LISTA DE COMPRAS ===");
            System.out.println("1. Adicionar Item");
            System.out.println("2. Remover Item");
            System.out.println("3. Listar Itens");
            System.out.println("4. Buscar Item");
            System.out.println("0. Sair");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao){
                case 1:
                    System.out.println("Informe o nome do Item:");
                    item = sc.nextLine();
                    lista.add(item);
                    System.out.println("Item adicionado: " + item);
                    break;

                case 2:
                    System.out.println("Informe o nome do item");
                    item = sc.nextLine();
                    if (lista.contains(item)){
                        lista.remove(item);
                        System.out.println("Item removido: " + item);
                    }else {
                        System.out.println("Item não encontrado");
                    }
                    break;


                case 3:
                    if (lista.isEmpty()){
                        System.out.println("Lista vazia");

                    }else {
                        System.out.println("Lista de compras: ");
                        for (String e: lista){
                            System.out.println(e);
                        }
                    }
                    break;

                case 4:
                    System.out.println("Informe o item: ");
                    item = sc.nextLine();
                    if (lista.contains(item)){
                        System.out.println("Item " + item + " Está na lista!!");
                    }else {
                        System.out.println("Item não está na lista");
                    }
                    break;


                case 0:
                    System.out.println("Você selecionou a opção: SAIR");
                    break;

                default:
                    System.out.println("Opção incorreta");
                    System.out.println("Saindo...");

            }

        }while (opcao !=0);
        System.out.println("Encerrando sistema...");

        sc.close();
    }



}
