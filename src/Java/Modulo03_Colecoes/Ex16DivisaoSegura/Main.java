package Java.Modulo03_Colecoes.Ex16DivisaoSegura;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor1;
        int valor2;

        try{
            System.out.println("Digite o primeiro numero: ");
            valor1 = sc.nextInt();
            System.out.println("Digite o segundo numero: ");
            valor2 = sc.nextInt();
            int resultado = valor1 / valor2;
            System.out.println(resultado);

        }catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero não é permitida!");
        }catch (InputMismatchException e){
            System.out.println("Erro: Entrada inválida! Digite um número.");
        }finally {
            System.out.println("Programa encerrado!");

        }
    }
}
