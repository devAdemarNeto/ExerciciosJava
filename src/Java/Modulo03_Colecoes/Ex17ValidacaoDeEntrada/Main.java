package Java.Modulo03_Colecoes.Ex17ValidacaoDeEntrada;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        double salario = 0;
        int idade = 0;
        boolean valido = false;

        System.out.println("Digite seu nome: ");
        nome = sc.nextLine();

        while (valido == false){
            try {
                System.out.println("Digite sua idade: ");
                idade = sc.nextInt();
                valido = true;
            }catch (InputMismatchException e){
                sc.nextLine();
                System.out.println("Entrada invalida!!. Digite um numero inteiro");
            }
        }

         valido = false;

        while (valido == false){
            try {
                System.out.println("Digite seu salario: ");
                salario = sc.nextDouble();
                valido = true;
            }catch (InputMismatchException e){
                sc.nextLine();
                System.out.println("Entrada invalida!!");
            }
        }

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salario: " + salario);






    }
}
