package Java.Modulo01_Fundamentos.exercicios;

import java.util.Scanner;

/**
 *  Exercício 11 - Tabuada
 *
 * @author Ademar Neto
 * @date 29/01/2026
 * @objetivo  Gerar a tabuada de um número.
 **/
public class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valor;
        double result;
        System.out.println("Digite um numero: ");
        valor = sc.nextInt();
        System.out.println("=== Tabuada do " + valor + " ===");



        System.out.println("=== Soma ===");
        for (int i = 1; i <= 10; i++) {
            result = i + valor ;
            System.out.println(valor + " + " + i + " = " + result);
        }

        System.out.println("=== Subtração ===");
        for (int i = 1; i <= 10; i++) {
            result = i - valor;
            System.out.println(valor + " - " + i + " = " + result);
        }


        System.out.println("=== Multiplicação ===");
        for (int i = 1; i <= 10; i++) {
            result = i * valor ;
            System.out.println(valor + " X " + i + " = " + result);
        }


        System.out.println("=== Divisão ===");
        for (int i = 1; i <= 10; i++) {
            result = i / valor ;
            System.out.println(valor + " / " + i + " = " + result);
        }




        sc.close();
    }
}
