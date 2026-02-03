package Java.Modulo01_Fundamentos.exercicios;

import java.util.Scanner;

/**
 * Exercício 12 - Fatorial
 *
 * @author Ademar Neto
 * @date 29/01/2026
 * @objetivo  Calcular o fatorial de um número.
 **/

public class Exercicio12 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = sc.nextInt();


        if (numero < 0){
            System.out.println("Erro: Fatorial não existe para numero negativos");
        }else {
            int resultado = 1;
            int contador = numero;
            while (contador > 0){
                resultado = resultado * contador;
                contador--;
            }
            System.out.println(numero + "! = " + resultado);
        }



        sc.close();
    }
}
