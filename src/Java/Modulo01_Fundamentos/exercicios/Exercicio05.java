package Java.Modulo01_Fundamentos.exercicios;

import java.util.Scanner;

/**
 *  Exercício 05 - Troca de Valores
 *
 * @author Ademar Neto
 * @date 29/01/2026
 * @objetivo Trocar os valores de duas variáveis sem usar uma terceira.
 **/

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        System.out.println("Digite o valor de A: ");
        a = sc.nextInt();
        System.out.println("Digite o valor de B: ");
        b = sc.nextInt();

        System.out.println("Antes da troca: ");
        System.out.println("A = " + a + ", " + "B = " + b );

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Antes da troca: ");
        System.out.println("A = " + a + ", " + "B = " + b );


    }
}
