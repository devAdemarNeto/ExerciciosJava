package Java.Modulo01_Fundamentos.exercicios;

import java.util.Scanner;

/**
 *  Exercício 10 - Menu de Opções
 *
 * @author Ademar Neto
 * @date 29/01/2026
 * @objetivo  Criar um menu interativo usando switch/case..
 **/

public class Exercicio10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("=== SISTEMA DE GESTÃO ===");
            System.out.println("1. Cadastrar");
            System.out.println("2. Consultar");
            System.out.println("3. Alterar");
            System.out.println("4. Excluir");
            System.out.println("5. Relatório");
            System.out.println("0. Sair");
            opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Você selecionou a opção: CADASTRAR");
                    break;

                case 2:
                    System.out.println("Você selecionou a opção: CONSULTAR");
                    break;

                case 3:
                    System.out.println("Você selecionou a opção: ALTERAR");
                    break;

                case 4:
                    System.out.println("Você selecionou a opção: EXCLUIR");
                    break;

                case 5:
                    System.out.println("Você selecionou a opção: RELATORIO");
                    break;

                case 0:
                    System.out.println("Você selecionou a opção: SAIR");
                    break;

                default:
                    System.out.println("Opção incorreta");
                    System.out.println("Saindo...");

            }

        }while (opcao !=0);
        System.out.println("Encerrando sintema...");

        sc.close();

    }
}
