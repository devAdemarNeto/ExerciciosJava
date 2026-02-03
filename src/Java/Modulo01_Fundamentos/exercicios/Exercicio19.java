package Java.Modulo01_Fundamentos.exercicios;

import java.util.Arrays;

/**
 Exercício 19 - Ordenação Simples (Bubble Sort)
 *
 * @author Ademar Neto
 * @date 29/01/2026
 * @objetivo  Implementar o algoritmo Bubble Sort.
 **/

public class Exercicio19 {

    public static void main(String[] args) {
        int[] arrayOriginal = {18, 75, 91, 12 ,47, 95, 35};
        int contador = 0;

        System.out.println("Array original: "+ Arrays.toString(arrayOriginal));

        System.out.println("Ordenando ...");
        for (int i = 0; i < arrayOriginal.length; i++) {
            for (int j = 0; j < arrayOriginal.length -1 -i; j++) {
                contador++;
                if(arrayOriginal[j] > arrayOriginal[j + 1]){
                    int temp = arrayOriginal[j];
                    arrayOriginal[j] = arrayOriginal[j + 1];
                    arrayOriginal[j + 1] = temp;

                }


                System.out.println("Passo " + contador +  ": " + Arrays.toString(arrayOriginal));

            }

        }
        System.out.println("Array ordenado: "+ Arrays.toString(arrayOriginal));


    }


}
