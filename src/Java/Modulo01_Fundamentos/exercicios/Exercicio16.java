package Java.Modulo01_Fundamentos.exercicios;

/**
 * Exercício 16 - Maior e Menor do Array
 *
 * @author Ademar Neto
 * @date 29/01/2026
 * @objetivo Encontrar o maior e menor elemento de um array.
 **/

public class Exercicio16 {

    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 7, 6, 3, 8, 4, 10};
        int maior = array[0];
        int menor = array[0];
        int posicaomaior = 0;
        int posicaomenor = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maior) {
                maior = array[i];
                posicaomaior = i;

            }
            if (array[i] < menor) {
                menor = array[i];
                posicaomenor = i;
            }
        }

        System.out.println("Maior valor: " + maior + "(posição " + posicaomaior + ")");

        System.out.println("Menor valor: " + menor + "(posição " + posicaomenor + ")");

    }
}
