package Java.Modulo01_Fundamentos.exercicios;

/**
 * Exercício 13 - Sequência de Fibonacci
 *
 * @author Ademar Neto
 * @date 29/01/2026
 * @objetivo  Gerar os N primeiros termos da sequência de Fibonacci.
 **/

public class Exercicio13 {

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.println("Quantos termos deseja? ");
        int n = sc.nextInt();

        // Validação - precisa de pelo menos 1 termo
        if (n <= 0) {
            System.out.println("Erro: Digite um número maior que zero!");
        } else {
            System.out.println("Sequência de Fibonacci:");

            int a = 0;      // primeiro termo
            int b = 1;      // segundo termo
            int proximo;

            for (int i = 0; i < n; i++) {
                // Exibe o termo atual
                if (i == n - 1) {
                    System.out.print(a);  // último termo sem vírgula
                } else {
                    System.out.print(a + ", ");
                }

                // Calcula o próximo termo
                proximo = a + b;
                a = b;
                b = proximo;
            }
            System.out.println();  // quebra de linha no final
        }

        sc.close();
    }
}
