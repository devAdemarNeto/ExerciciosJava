package Java.Modulo01_Fundamentos.exercicios;

import java.util.Scanner;

/**
 * Exercício 24 - Conversor de Bases Numéricas
 *
 * @author Ademar Neto
 * @date 31/01/2026
 * @objetivo Converter números entre bases decimal, binário e hexadecimal.
 **/

public class Exercicio24 {

    // === MÉTODO 1: Decimal para Binário ===
    // Divide o número por 2 repetidamente e coleta os restos
    public static String decimalParaBinario(int decimal) {
        if (decimal == 0) {
            return "0";
        }

        StringBuilder binario = new StringBuilder();
        int numero = decimal;

        while (numero > 0) {
            int resto = numero % 2; // O resto é 0 ou 1
            binario.insert(0, resto); // Insere no início da string
            numero = numero / 2; // Divide por 2
        }

        return binario.toString();
    }

    // === MÉTODO 2: Decimal para Hexadecimal ===
    // Divide o número por 16 repetidamente e coleta os restos
    public static String decimalParaHexadecimal(int decimal) {
        if (decimal == 0) {
            return "0";
        }

        // Caracteres hexadecimais: 0-9 e A-F
        String hexDigitos = "0123456789ABCDEF";
        StringBuilder hexadecimal = new StringBuilder();
        int numero = decimal;

        while (numero > 0) {
            int resto = numero % 16; // O resto vai de 0 a 15
            char digito = hexDigitos.charAt(resto); // Converte para 0-9 ou A-F
            hexadecimal.insert(0, digito); // Insere no início
            numero = numero / 16; // Divide por 16
        }

        return hexadecimal.toString();
    }

    // === MÉTODO 3: Binário para Decimal ===
    // Multiplica cada dígito pela potência de 2 correspondente
    public static int binarioParaDecimal(String binario) {
        int decimal = 0;
        int potencia = 0; // Começamos da potência 0 (da direita para esquerda)

        // Percorre o binário de trás para frente
        for (int i = binario.length() - 1; i >= 0; i--) {
            char digito = binario.charAt(i);

            if (digito == '1') {
                // 2 elevado à potência atual
                decimal = decimal + (int) Math.pow(2, potencia);
            }

            potencia++;
        }

        return decimal;
    }

    // === MÉTODO 4: Hexadecimal para Decimal ===
    // Multiplica cada dígito pela potência de 16 correspondente
    public static int hexadecimalParaDecimal(String hexadecimal) {
        String hexDigitos = "0123456789ABCDEF";
        int decimal = 0;
        int potencia = 0;

        // Converte para maiúsculo para padronizar
        String hex = hexadecimal.toUpperCase();

        // Percorre de trás para frente
        for (int i = hex.length() - 1; i >= 0; i--) {
            char digito = hex.charAt(i);

            // Encontra o valor numérico do dígito (0-15)
            int valor = hexDigitos.indexOf(digito);

            // Multiplica pela potência de 16
            decimal = decimal + valor * (int) Math.pow(16, potencia);

            potencia++;
        }

        return decimal;
    }

    // === MÉTODO: Exibir Menu ===
    public static void exibirMenu() {
        System.out.println("\n=== CONVERSOR DE BASES NUMÉRICAS ===");
        System.out.println("1. Decimal para Binário");
        System.out.println("2. Decimal para Hexadecimal");
        System.out.println("3. Binário para Decimal");
        System.out.println("4. Hexadecimal para Decimal");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            exibirMenu();
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o número decimal: ");
                    int dec1 = sc.nextInt();
                    String bin = decimalParaBinario(dec1);
                    System.out.println(dec1 + " em binário: " + bin);
                    break;

                case 2:
                    System.out.print("Digite o número decimal: ");
                    int dec2 = sc.nextInt();
                    String hex = decimalParaHexadecimal(dec2);
                    System.out.println(dec2 + " em hexadecimal: " + hex);
                    break;

                case 3:
                    System.out.print("Digite o número binário: ");
                    String binario = sc.next();
                    int dec3 = binarioParaDecimal(binario);
                    System.out.println(binario + " em decimal: " + dec3);
                    break;

                case 4:
                    System.out.print("Digite o número hexadecimal: ");
                    String hexadecimal = sc.next();
                    int dec4 = hexadecimalParaDecimal(hexadecimal);
                    System.out.println(hexadecimal + " em decimal: " + dec4);
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        sc.close();
    }
}
