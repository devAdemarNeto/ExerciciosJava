package Java.Modulo01_Fundamentos.exercicios;

/**
 * Exercício 20 - Matriz Identidade
 *
 * @author Ademar Neto
 * @date 29/01/2026
 * @objetivo Criar e manipular uma matriz identidade.
 **/

public class Exercicio20 {

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        // === PASSO 1: Pedir a dimensão da matriz ao usuário ===
        System.out.println("Digite a dimensão da matriz: ");
        int n = sc.nextInt();

        // === PASSO 2: Criar a matriz quadrada (n linhas x n colunas) ===
        // int[][] significa "array de arrays" = matriz
        int[][] matriz = new int[n][n];

        // Variável para somar os elementos da diagonal (EXTRA)
        int somaDiagonal = 0;

        // === PASSO 3: Preencher a matriz ===
        // Usamos dois for: um para linhas (i), outro para colunas (j)
        for (int i = 0; i < n; i++) { // i = linha atual (0, 1, 2, ...)
            for (int j = 0; j < n; j++) { // j = coluna atual (0, 1, 2, ...)

                // === PASSO 4: Verificar se está na diagonal ===
                // Na diagonal, o índice da linha é IGUAL ao índice da coluna
                // Exemplo: [0][0], [1][1], [2][2], [3][3] são a diagonal
                if (i == j) {
                    // Está na diagonal → coloca 1
                    matriz[i][j] = 1;
                    somaDiagonal = somaDiagonal + 1; // soma para o extra
                } else {
                    // Não está na diagonal → coloca 0
                    matriz[i][j] = 0;
                }
            }
        }

        // === PASSO 5: Exibir a matriz formatada ===
        System.out.println("\nMatriz Identidade " + n + "x" + n + ":");

        for (int i = 0; i < n; i++) { // percorre cada linha
            for (int j = 0; j < n; j++) { // percorre cada coluna da linha
                System.out.print(matriz[i][j] + "  "); // print (sem ln) para mesma linha
            }
            System.out.println(); // pula para próxima linha após imprimir todas as colunas
        }

        // === PASSO 6: Mostrar a soma da diagonal (EXTRA) ===
        System.out.println("\nSoma da diagonal: " + somaDiagonal);

        sc.close();
    }
}
