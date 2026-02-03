package Java.Modulo01_Fundamentos.exercicios;

import java.util.Scanner;

/**
 * Exercício XX - Calculadora Simples
 *
 * @author Ademar Neto
 * @date 29/01/2026
 * @objetivo Criar uma calculadora que realize as 4 operações básicas.
 **/

public class Exercicio01 {

    public static void main(String[] args) {
        int num1;
        int num2;
        int result;
        int opcao;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        num1 = scanner.nextInt();
        System.out.println("Digite o segundo numero: ");
        num2 = scanner.nextInt();
        System.out.println("Digite a operação (1 = +, 2 = -, 3 = *, 4 = /): ");
        opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                result = num1 + num2;
                System.out.println(result);
                break;

            case 2:
                result = num1 - num2;
                System.out.println(result);
                break;

            case 3:
                result = num1 * num2;
                System.out.println(result);
                break;

            case 4:
                result = num1 / num2;
                System.out.println(result);
                break;

            default:
                System.out.println("Opção incorreta");

        }

        scanner.close();

    }
}
