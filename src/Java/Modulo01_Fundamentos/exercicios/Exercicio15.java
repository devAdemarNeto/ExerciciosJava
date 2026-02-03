package Java.Modulo01_Fundamentos.exercicios;

import java.util.Scanner;

/**
 * Exercício 15 - Números Primos
 *
 * @author Ademar Neto
 * @date 29/01/2026
 * @objetivo Verificar se um número é primo e listar primos em um intervalo.
 **/
public class Exercicio15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Variáveis para guardar o intervalo
        int inicio;
        int fim;

        // Contador para saber quantos primos encontramos
        int contador = 0;

        // === PASSO 1: Pedir o intervalo ao usuário ===
        System.out.println("Digite o início do intervalo: ");
        inicio = sc.nextInt();

        System.out.println("Digite o fim do intervalo: ");
        fim = sc.nextInt();

        System.out.println("\nNúmeros primos entre " + inicio + " e " + fim + ":");

        // === PASSO 2: Loop externo - percorre cada número do intervalo ===
        // i vai de "inicio" até "fim", um por um
        for (int i = inicio; i <= fim; i++) {

            // Números menores que 2 não são primos (por definição)
            // O comando "continue" pula para o próximo número
            if (i < 2) {
                continue;
            }

            // === PASSO 3: Assumir que o número é primo ===
            // Começamos assumindo que i É primo
            // Se encontrarmos um divisor, mudamos para false
            boolean ehPrimo = true;

            // === PASSO 4: Loop interno - verifica divisores ===
            // j vai de 2 até i-1
            // Estamos verificando: "existe algum número que divide i?"
            for (int j = 2; j < i; j++) {

                // Se i dividido por j dá resto 0, então j divide i!
                // Exemplo: 6 % 2 = 0, então 2 divide 6
                if (i % j == 0) {
                    // Encontramos um divisor! Então NÃO é primo
                    ehPrimo = false;

                    // Não precisa continuar verificando, já sabemos que não é primo
                    break;
                }
            }

            // === PASSO 5: Se ninguém dividiu, é primo! ===
            // Só chegamos aqui se o for interno terminou
            // Se ehPrimo ainda é true, significa que ninguém dividiu i
            if (ehPrimo) {
                System.out.print(i + ", ");
                contador++;
            }
        }

        // === PASSO 6: Mostrar o total (FORA do loop!) ===
        System.out.println(); // Quebra de linha
        System.out.println("\nTotal: " + contador + " números primos");

        sc.close();
    }
}
