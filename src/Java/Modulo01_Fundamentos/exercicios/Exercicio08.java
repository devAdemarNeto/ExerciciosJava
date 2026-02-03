package Java.Modulo01_Fundamentos.exercicios;

import java.util.Scanner;

/**
 *  Exercício 08 - Classificador de Triângulos
 *
 * @author Ademar Neto
 * @date 29/01/2026
 * @objetivo Verificar se três lados formam um triângulo e classificá-lo.
 **/

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ladoA;
        int ladoB;
        int ladoC;

        System.out.println("Digite o lado A: ");
        ladoA = sc.nextInt();

        System.out.println("Digite o lado B: ");
        ladoB = sc.nextInt();

        System.out.println("Digite o lado C: ");
        ladoC = sc.nextInt();

        if (ladoA >= ladoB + ladoC || ladoB >= ladoA + ladoC || ladoC >= ladoA + ladoB){
            System.out.println("Não é um triangulo");
        }else {
            if (ladoA == ladoB && ladoA == ladoC ){
                System.out.println("Os lados formam um triangulo EQUILÁTERO");
            } else if (ladoA != ladoB && ladoA != ladoC && ladoC != ladoB) {
                System.out.println("Os lados formam um triangulo ESCALENO");
            }else {
                System.out.println("Os lados formam um triangulo ISÓSCELES");
            }
        }
        sc.close();

    }



}
