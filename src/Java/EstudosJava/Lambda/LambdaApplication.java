package Java.EstudosJava.Lambda;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface OperacaoMatematica{
    int calcular(int a, int b);
}

interface ManipuladorDeString{
    String manipular(String str);
}
public class LambdaApplication {
    public static void main(String[] args) {
        // (parâmetro) -> expressão
        //(parâmetro) -> {blocos de código}

        OperacaoMatematica soma = new OperacaoMatematica() {
            @Override
            public int calcular(int a, int b) {
                return  a + b;
            }
        };
        System.out.println(soma.calcular(5,3));

        OperacaoMatematica somaFL = (a,b) -> a + b;
        System.out.println(somaFL.calcular(5,3));


        //Manipulação de String

        ManipuladorDeString maiuscula = new ManipuladorDeString() {
            @Override
            public String manipular(String str) {
                return str.toUpperCase();
            }
        };
        System.out.println("Manipulação de string sem lambda" + maiuscula.manipular("Javanauta"));

        // Com lambda
        ManipuladorDeString maiusculaFL = str -> str.toUpperCase();

        // usando filter

        List<String> palavras = Arrays.asList("Java", "PH", "JavaScript");

        List<String> palavrasFiltradas = new ArrayList<>();
        for (String palavra :  palavras){
            if (palavra.length() > 5){
                palavrasFiltradas.add(palavra);
            }
        }

        System.out.println("Palavras com mais de 5 letras sem fução lambda: " + palavrasFiltradas);

        List<String> palavrasFiltradasFL = palavras.stream().filter(p -> p.length() > 5).toList();

        System.out.println("Palavras com mais de 5 letras com fução lambda: " + palavrasFiltradasFL);







    }
}
