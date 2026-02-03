package Java.Modulo01_Fundamentos.exercicios;

import java.util.Locale;
import java.util.Scanner;

/**
 * Exercício 03 - Cálculo de IMC
 *
 * @author Ademar Neto
 * @date 29/01/2026
 * @objetivo Calcular o Índice de Massa Corporal e classificar.
 **/

public class Exercicio03 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double peso;
        double altura;
        double imc;

        System.out.println("Digite seu peso (kg): ");
        peso = sc.nextDouble();
        System.out.println("Digite sua altura (m): ");
        altura = sc.nextDouble();
        
        imc = peso / (altura * altura) ;

        System.out.printf("Seu IMC é: %.2f%n", imc);


        if (imc < 18.5){
            System.out.println("Classificação: Abaixo do peso");
        } else if (imc >= 18.5 && imc <= 24.9 ) {
            System.out.println("Classificação: Peso Normal");
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.println("Classificação: Sobrepeso");
        } else if (imc >= 30 && imc <= 34.9) {
            System.out.println("Classificação: Obesidade grau I");
        } else if (imc >= 35 && imc<= 39.0) {
            System.out.println("Classificação: Obesidade grau II");
        }else {
            System.out.println("Classificação: Obesidade grau III");
        }

    }
    
    
}
