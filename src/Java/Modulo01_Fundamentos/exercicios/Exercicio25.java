package Java.Modulo01_Fundamentos.exercicios;

import java.util.Scanner;

/**
 * Exercício 25 - Mini Sistema de Cadastro
 *
 * @author Ademar Neto
 * @date 31/01/2026
 * @objetivo riar um sistema CRUD simples usando arrays e métodos.
 **/

public class Exercicio25 {
    static String[] nomes = new String[10];
    static int[] idades = new int[10];
    static String[] emails = new String[10];
    static int totalCadastrados = 0;


    public static void exibirMenu() {
        System.out.println("=== SISTEMA DE CADASTRO DE CLIENTES ===");
        System.out.println("1. CADASTRAR CLIENTE");
        System.out.println("2. LISTAR CLIENTE ");
        System.out.println("3. BUSCAR CLIENTE");
        System.out.println("4. ALTERAR DADOS DO CLIENTE");
        System.out.println("5. EXCLUIR CLIENTE");
        System.out.println("0. SAIR");
        System.out.print("Escolha a operação: ");
    }

    public static void cadastrar() {
        Scanner sc = new Scanner(System.in);

        if (totalCadastrados >= 10) {
            System.out.println("Limite de cadastros atingido!");
            return;
        }

        System.out.print("Nome: ");
        nomes[totalCadastrados] = sc.nextLine();

        System.out.print("Idade: ");
        idades[totalCadastrados] = sc.nextInt();
        sc.nextLine();  // limpa buffer

        System.out.print("Email: ");
        emails[totalCadastrados] = sc.nextLine();

        totalCadastrados++;
        System.out.println("Cadastrado com sucesso!");
    }

    public static void listar(){

        if (totalCadastrados == 0){
            System.out.println("Lista esta vazia");
            return;
        }


        for (int i = 0; i < totalCadastrados; i++) {
            System.out.println("Nome: "+ nomes[i] + ", "+ "Idade: " + ", " +  idades[i]+ ", " + "Email: " + emails[i]);

        }

    }

    public static void buscar(String nome){
        boolean encontrado = false;
        for (int i = 0; i < totalCadastrados; i++) {
            if (nomes[i].equals(nome)){
                System.out.println("Nome: "+ nomes[i] + ", "+ "Idade: " + ", " +  idades[i]+ ", " + "Email: " + emails[i]);
                encontrado = true;
            }
        }
        if (!encontrado){
            System.out.println("Cliente não encontrado!");
        }
    }

    public static void alterar(){
        if (totalCadastrados == 0){
            System.out.println("Lista esta vazia");
            return;
        }


        for (int i = 0; i < totalCadastrados; i++) {
            System.out.println(i + ": " + "Nome: "+ nomes[i] + ", "+ "Idade: " + ", " +  idades[i]+ ", " + "Email: " + emails[i]);

        }

        System.out.println("Qual cliente deseja alterar: ");
        Scanner sc = new Scanner(System.in);
        int indice = sc.nextInt();
        sc.nextLine();
        if (indice < 0 || indice >= totalCadastrados){
            System.out.println("Indice inválido");
        }else{
            System.out.println("Digite o novo nome: ");
            String novoNome = sc.nextLine();
            nomes[indice] = novoNome;

            System.out.println("Digite o nova idade: ");
            int novaIdade = sc.nextInt();
            idades[indice] = novaIdade;

            System.out.println("Digite o novo email: ");
            String novoEmail = sc.nextLine();
            emails[indice] = novoEmail;

            System.out.println("Alterado com sucesso!!");
        }

    }

    public static void deletar(){
        if (totalCadastrados == 0){
            System.out.println("Lista esta vazia");
            return;
        }


        for (int i = 0; i < totalCadastrados; i++) {
            System.out.println(i + ": " + "Nome: "+ nomes[i] + ", "+ "Idade: " + ", " +  idades[i]+ ", " + "Email: " + emails[i]);

        }

        System.out.println("Qual cliente deseja deletar: ");
        Scanner sc = new Scanner(System.in);
        int indice = sc.nextInt();
        sc.nextLine();
        if (indice < 0 || indice >= totalCadastrados) {
            System.out.println("Indice inválido");
        }else {

            for (int i = indice; i < totalCadastrados - 1; i++) {
                nomes[i] = nomes[i+1];
                idades[i] = idades[i+1];
                emails[i] = emails[i+1];
            }
            totalCadastrados--;
            System.out.println("Cliente exculido com sucesso");
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int opcao;

        do{
            exibirMenu();
            opcao = sc.nextInt();

            switch (opcao){

                case 1:
                    cadastrar();
                    break;

                case 2:
                    listar();
                    break;

                case 3:
                    System.out.print("Digite o nome: ");
                    String nomeBusca = sc.next();
                    buscar(nomeBusca);
                    break;

                case 4:
                    alterar();
                    break;

                case 5:
                    deletar();
                    break;

            }


        }while (opcao !=0);

    }

}
