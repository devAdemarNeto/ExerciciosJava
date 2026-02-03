package Java.Modulo01_Fundamentos.exercicios;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

/**
 * Exercício 07 - Maior de Três Números
 *
 * @author Ademar Neto
 * @date 29/01/2026
 * @objetivo Encontrar o maior entre três números.
 **/

public class Exercicio07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor1;
        int valor2;
        int valor3;

        System.out.println("Digite o primeiro numero: ");
        valor1 = sc.nextInt();

        System.out.println("Digite o segundo numero: ");
        valor2 = sc.nextInt();

        System.out.println("Digite o terceiro numero: ");
        valor3 = sc.nextInt();

        if (valor1 == valor2 && valor1 == valor3 && valor2 == valor3){
            System.out.println("Os valores são iguais");
        }
//
//        if(valor1 > valor2 && valor1 > valor3){
//            System.out.println("O maior valor é " + valor1);
//        } else if (valor2 > valor1 && valor2 > valor3) {
//            System.out.println("O maior valor é " + valor2);
//        }else {
//            System.out.println("O maior valor é " + valor3);
//        }

//        int maior;
//
//        if (valor1 > valor2) {
//            if (valor1 > valor3) {
//                maior = valor1;
//            } else {
//                maior = valor3;
//            }
//        } else {
//            if (valor2 > valor3) {
//                maior = valor2;
//            } else {
//                maior = valor3;
//            }
//        }
//
//        System.out.println("O maior valor é  " + maior);

        int maior = valor1 > valor2
                ? (valor1 > valor3 ? valor1 : valor3)
                : (valor2 > valor3 ? valor2 : valor3);

        System.out.println("O maior valor é " + maior);




    }
}
