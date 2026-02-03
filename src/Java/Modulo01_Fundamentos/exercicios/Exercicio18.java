package Java.Modulo01_Fundamentos.exercicios;

import java.util.Arrays;
import java.util.Scanner;

/**
 Exercício 18 - Busca em Array
 *
 * @author Ademar Neto
 * @date 29/01/2026
 * @objetivo  Implementar busca linear e verificar existência de elemento.
 **/

public class Exercicio18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] array = new String[10];
        String nome;
        String nome2;

        for (int i = 0; i < array.length; i++) {
            System.out.println("Digite um nome: ");
            nome = sc.nextLine();
            array[i] = nome;
        }

        System.out.println("Array : " + Arrays.toString(array));


        System.out.println("Digite o nome a buscar :");
        nome2 = sc.nextLine();
        int contador = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(nome2)){
                System.out.println(nome2 +" Encontrado na posição" + i);
                contador++;
            }
        }

        if (contador == 0){
            System.out.println(nome2 + " não encontrado!");
        }else {
            System.out.println(nome2 + " aparece " + contador + " vezes no array");
        }

        sc.close();


    }



}
