package Java.Modulo03_Colecoes.Ex02AgendaContatos;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Contatos> contatos = new ArrayList<>();


        int opcao;
        String item;

        do {
            System.out.println("=== AGENDA DE CONTATOS ===");
            System.out.println("1. Adicionar Contato");
            System.out.println("2. Listar Contatos");
            System.out.println("3. Buscar por Nome");
            System.out.println("4. Remover Contato");
            System.out.println("0. Sair");
            opcao = sc.nextInt();
            sc.nextLine();
            boolean encontrado = false;

            switch (opcao){
                case 1:
                    System.out.println("Informe o nome:");
                    String nome = sc.nextLine();
                    System.out.println("Informe seu telefone");
                    String telefone = sc.nextLine();
                    System.out.println("Informe o seu e-mail");
                    String email = sc.nextLine();
                    Contatos novoContato = new Contatos(nome,telefone,email);
                    contatos.add(novoContato);
                    break;

                case 2:
                    if (contatos.isEmpty()){
                        System.out.println("Lista está vazia");
                    }else {
                        for (Contatos c : contatos){
                            c.exibirInfo();

                        }
                    }
                    break;


                case 3:
                    System.out.println("Informe o nome do usuário: ");
                    item = sc.nextLine();
                    for (Contatos c : contatos){
                        if (c.getNome().equals(item)){
                            encontrado = true;
                            c.exibirInfo();
                            break;
                        }
                    }

                    if (encontrado == false){
                        System.out.println("Usuário não encontrado");
                    }
                    break;

                case 4:
                    System.out.println("Informe o nome do usuário: ");
                    item = sc.nextLine();
                    for (Contatos c : contatos){
                        if (c.getNome().equals(item)){
                            encontrado = true;
                            contatos.remove(c);
                            break;
                        }

                    }

                    if (encontrado == false){
                        System.out.println("Usuario não encontrado");
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
