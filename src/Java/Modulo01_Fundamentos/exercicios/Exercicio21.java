package Java.Modulo01_Fundamentos.exercicios;

import java.util.Scanner;

/**
 * Exercício 21 - Calculadora com Métodos
 *
 * @author Ademar Neto
 * @date 29/01/2026
 * @objetivo Refatorar a calculadora do Exercício 01 usando métodos.
 **/
public class Exercicio21 {

    public static double somar(double a, double b){
        return a + b;
    }
    public static double subtrair(double a, double b){
        return a - b;
    }
    public static double multiplicar(double a, double b){
        return a * b;
    }
    public static double dividir(double a, double b){

        return a / b;
    }

    public static void exibirMenu() {
        System.out.println("=== CALCULADORA ===");
        System.out.println("1. Somar");
        System.out.println("2. Subtrair");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.print("Escolha a operação: ");
    }

    public static double lerNumero(Scanner sc, String mensagem) {
        System.out.print(mensagem);
        return sc.nextDouble();
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = lerNumero(scanner, "Digite o primeiro numero: ");
        double num2 = lerNumero(scanner, "Digite o segundo numero: ");

       exibirMenu();
        int opcao = scanner.nextInt();


        switch (opcao) {
            case 1:
                System.out.println(somar(num1, num2));
                break;

            case 2:
                System.out.println(subtrair(num1,num2));
                break;

            case 3:
                System.out.println(multiplicar(num1,num2));
                break;

            case 4:
                if (num2 == 0) {
                    System.out.println("Não é possível dividir por zero!");
                } else {
                    System.out.println(dividir(num1, num2));
                }
                break;

            default:
                System.out.println("Opção incorreta");

        }
        scanner.close();
    }
}
