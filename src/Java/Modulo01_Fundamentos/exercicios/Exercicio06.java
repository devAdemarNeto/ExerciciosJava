package Java.Modulo01_Fundamentos.exercicios;

import java.util.Scanner;

/**
 * Exercício 06 - Verificador Par/Ímpar
 *
 * @author Ademar Neto
 * @date 29/01/2026
 * @objetivo Verificar se um número é par ou ímpar.
 **/

public class Exercicio06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor;
        String parimpar;
        String posneg;
        System.out.println("Digite o valor: ");
        valor = sc.nextInt();

        if(valor % 2 == 0){
            parimpar = " PAR";
        }else {
            parimpar = " ÍMPAR";
        }

        if (valor < 0){
            posneg = "NEGATIVO";
        } else if (valor == 0 ) {
            posneg = "O VALOR É ZERO";

        }else {
            posneg = "POSITIVO";
        }

        System.out.println("O numero " + valor + " é" + parimpar + " e " + posneg);


    }
}
