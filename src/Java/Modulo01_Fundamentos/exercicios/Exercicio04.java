package Java.Modulo01_Fundamentos.exercicios;

import java.util.Locale;
import java.util.Scanner;

/**
 * Exercício 04 - Média de Notas
 *
 * @author Ademar Neto
 * @date 29/01/2026
 * @objetivo Calcular média de notas e verificar aprovação.
 **/
public class Exercicio04 {


    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double nota1;
        double nota2;
        double nota3;
        double nota4;
        double media;

        System.out.println("Digite a primeira nota: ");
        nota1 = sc.nextDouble();
        System.out.println("Digite a segunda nota: ");
        nota2 = sc.nextDouble();
        System.out.println("Digite a terceira nota: ");
        nota3 = sc.nextDouble();
        System.out.println("Digite a quarta nota: ");
        nota4 = sc.nextDouble();

        media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.printf("Média: %.2f%n", media);

        if (media >= 7){
            System.out.println("Situação: APROVADO");
        } else if (media >= 5 && media < 7) {
            System.out.println("Situação: RECUPERAÇÃO");
        }else {
            System.out.println("Situação: REPROVADO");
        }
    }



}
