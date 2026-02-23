package Java.Modulo03_Colecoes.Ex19LeituraDeArquivo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("src/Java/Modulo03_Colecoes/Ex19LeituraDeArquivo/dados.txt"))){
            String linha;
            while ((linha = br.readLine()) != null){
                System.out.println(linha);
            }
        } catch (FileNotFoundException e){
            System.out.println("Arquivo não encontrado");
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo");
        }finally {
            System.out.println("Encerrando o progroma");
        }


    }
}
