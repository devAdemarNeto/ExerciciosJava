package Java.Modulo03_Colecoes.Ex08AgendaTelefonica;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Contato> agenda = new HashMap<>();
        int opcao;


        do {
            System.out.println("=== Agenda Telefonica ===");
            System.out.println("1. Adicionar Contato");
            System.out.println("2. Buscar Contato ");
            System.out.println("3. listar Contatos");
            System.out.println("4. Remover palavra");
            System.out.println("0. Sair");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao){
                case 1:
                    System.out.println("Digite o nome: ");
                    String nome = sc.nextLine();
                    System.out.println("Digite o telefone: ");
                    String telefone = sc.nextLine();
                    if (agenda.containsKey(nome)){
                        System.out.println("Cntato já existe");
                    }else {
                        Contato novoContato = new Contato(nome,telefone);
                        agenda.put(nome, novoContato);
                        System.out.println("Contato salvo com sucesso!!");
                    }
                    break;

                case 2:
                    System.out.println("Digite o nome: ");
                    nome = sc.nextLine();
                    if (agenda.containsKey(nome)){
                        Contato c = agenda.get(nome);
                        c.exibirInfo();
                    }else {
                        System.out.println("Contato não encontrado!!");
                    }
                    break;

                case 3:
                    System.out.println("=== Agenda === ");
                    for (String chave : agenda.keySet()){
                        Contato c = agenda.get(chave);
                        c.exibirInfo();
                    }
                    break;

                case 4:
                    System.out.println("Digite o nome: ");
                    nome = sc.nextLine();
                    if (agenda.containsKey(nome)){
                        agenda.remove(nome);
                        System.out.println("Contato excluido com sucesso!!");
                    }else {
                        System.out.println("Contato não encontrado!!");
                    }



            }
        }while (opcao != 0);
        System.out.println("Encerrando Sistema");


    }
}
