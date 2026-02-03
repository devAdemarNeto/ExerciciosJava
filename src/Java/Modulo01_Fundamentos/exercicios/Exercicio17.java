package Java.Modulo01_Fundamentos.exercicios;

import java.util.Arrays;

/**
 * Exercício 17 - Inversão de Array
 *
 * @author Ademar Neto
 * @date 29/01/2026
 * @objetivo Inverter a ordem dos elementos de um array.
 **/

public class Exercicio17 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Array original" + Arrays.toString(array));

        int i = 0;
        int j = array.length - 1;

        while (i < j){
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;

        }
        System.out.println("Array invertido" + Arrays.toString(array));
    }
}
