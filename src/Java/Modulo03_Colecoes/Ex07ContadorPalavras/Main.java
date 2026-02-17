package Java.Modulo03_Colecoes.Ex07ContadorPalavras;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o texto?: ");
        String texto = sc.nextLine();
        String[] palavras = texto.toLowerCase().split(" ");

        HashMap<String, Integer> palavra = new HashMap<>();

        for (String p : palavras) {
            if (palavra.containsKey(p)) {
                // Já existe: pega o valor atual e soma 1
                int contagem = palavra.get(p);
                palavra.put(p, contagem + 1);
            } else {
                // Não existe: adiciona com valor 1
                palavra.put(p, 1);
            }
        }

        for (String chave : palavra.keySet()) {
            System.out.println(chave + ": " + palavra.get(chave));
        }


    }
}
