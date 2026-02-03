package Java.Modulo01_Fundamentos.exercicios;

import java.util.Scanner;

/**
 * Exercício 02 - Conversor de Temperatura
 *
 * @author Ademar Neto
 * @date 29/01/2026
 * @objetivo Converter temperaturas entre Celsius, Fahrenheit e Kelvin.
 **/
public class Exercicio02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valor;
        int opcao;
        double result;

        System.out.println("=== Conversor de Temperatura ===");
        System.out.println("1. Celsius para Fahrenheit");
        System.out.println("2. Celsius para Kelvin");
        System.out.println("3. Fahrenheit para Celsius");
        System.out.println("Escolha: ");
        opcao = sc.nextInt();




        switch (opcao){

            case  1:

                System.out.println("Digite o valor");
                valor = sc.nextDouble();
                result = (valor * 9/5) + 32;
                System.out.println(result + " ºF");
                break;

            case 2:
                System.out.println("Digite o valor");
                valor = sc.nextDouble();
                result = valor + 273.15;
                System.out.println(result + " ºK");
                break;

            case 3:
                System.out.println("Digite o valor");
                valor = sc.nextDouble();
                result = (valor - 32) * 5/9;
                System.out.println(result + " ºC");
                break;

            default:
                System.out.println("Valor incorreto");
                break;

        }

    }


}
