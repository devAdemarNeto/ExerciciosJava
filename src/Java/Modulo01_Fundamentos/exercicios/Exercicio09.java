package Java.Modulo01_Fundamentos.exercicios;


import java.util.Scanner;

/**
 *  Exercício 09 - Calculadora de Desconto
 *
 * @author Ademar Neto
 * @date 29/01/2026
 * @objetivo  Aplicar descontos progressivos baseados no valor da compra.
 **/
public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        double valor;
//        double valordesc;
//        double valortotal;
//
//
//        System.out.println("Digite o valor da compra: ");
//        valor = scanner.nextDouble();
//
//        if (valor <= 100){
//            System.out.println("Desconto aplicado: " +  0 +"%");
//            System.out.println("Valor do desconto: R$" + 0);
//            System.out.println("Valor final: " + valor);
//        } else if (valor > 100 && valor <= 500) {
//
//            valordesc =  (valor * 0.10);
//            valortotal = valor - valordesc;
//            System.out.println("Desconto aplicado: " +  10 +"%");
//            System.out.println("Valor do desconto: R$" + valordesc);
//            System.out.println("Valor final: " + valortotal);
//        } else if (valor > 500 && valor <= 1000) {
//            valordesc =  (valor * 0.15);
//            valortotal = valor - valordesc;
//            System.out.println("Desconto aplicado: " +  15 +"%");
//            System.out.println("Valor do desconto: R$" + valordesc);
//            System.out.println("Valor final: " + valortotal);
//        } else {
//            valordesc =  (valor * 0.20);
//            valortotal = valor - valordesc;
//            System.out.println("Desconto aplicado: " +  20 +"%");
//            System.out.println("Valor do desconto: R$" + valordesc);
//            System.out.println("Valor final: " + valortotal);
//        }

// verão mais limpa

        double valor;
        System.out.println("Digite o valor da compra: ");
        valor = scanner.nextDouble();


        double desconto = 0;

        if (valor <= 100) {
            desconto = 0;
        } else if (valor <= 500) {
            desconto = 0.10;
        } else if (valor <= 1000) {
            desconto = 0.15;
        } else {
            desconto = 0.20;
        }

        double valorDesconto = valor * desconto;
        double valorFinal = valor - valorDesconto;

        System.out.printf("Desconto aplicado: %.0f%%%n", desconto * 100);
        System.out.printf("Valor do desconto: R$ %.2f%n", valorDesconto);
        System.out.printf("Valor final: R$ %.2f%n", valorFinal);


        scanner.close();
    }




}
