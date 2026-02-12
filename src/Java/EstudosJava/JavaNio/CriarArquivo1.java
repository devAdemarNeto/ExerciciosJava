package Java.EstudosJava.JavaNio;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CriarArquivo1 {
    public static void main(String[] args) {
        String conteudo = "Ademar Neto";

        try {
            //Criar arquivo dentro do diretório
            Path pathTo = Paths.get("C:\\Users\\adema\\OneDrive\\DOCUMENTOS\\ExerciciosJava\\src\\Java\\EstudosJava\\teste.txt");
            Files.write(pathTo, conteudo.getBytes(StandardCharsets.UTF_8));
            System.out.println("Fim");

        }catch (Exception ex){
            ex.printStackTrace();

        }
    }
}
