package Java.Modulo03_Colecoes.Ex05PlaylistMúsicas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Musica> musicas = new ArrayList<>();

        int opcao;
        String musica;



        do {
            System.out.println("=== PLAYLIST ===");
            System.out.println("1. Adicionar musica");
            System.out.println("2. Remover musica");
            System.out.println("3. Embaralhar playlist");
            System.out.println("4. Exibir duração total da playlist");
            System.out.println("5. Listar musicas");
            System.out.println("0. Sair");
            opcao = sc.nextInt();
            sc.nextLine();
            boolean encontrado = false;

            switch (opcao){

                case 1:
                    System.out.println("Informe o titulo da musica: ");
                    String titulo = sc.nextLine();
                    System.out.println("Informe o Artista: ");
                    String artista = sc.nextLine();
                    System.out.println("Informe duração - minutos: ");
                    int minutos = sc.nextInt();
                    System.out.println("Informe duração - segundos: ");
                    int segundos = sc.nextInt();
                    int duracaoTotal = (minutos * 60) + segundos;
                    Musica novaMusica = new Musica(titulo,artista, duracaoTotal);
                    musicas.add(novaMusica);
                    break;

                case 2:
                    System.out.println("Informe a musica: ");
                    musica = sc.nextLine();
                    for (Musica m : musicas){
                        if (m.getTitulo().equals(musica)){
                            encontrado = true;
                            musicas.remove(m);
                            break;
                        }
                    }
                    if (encontrado == false){
                        System.out.println("Musica não encontrada!");
                    }
                    break;

                case 3:
                    System.out.println("Antes: " + musicas);

                    Collections.shuffle(musicas);

                    System.out.println("Depois:" + musicas);

                    break;

                case 4:
                    int totalSegundos = 0;
                    for (Musica m : musicas){
                        totalSegundos = totalSegundos + m.getDuracao();
                    }
                    int min = totalSegundos / 60;
                    int seg = totalSegundos % 60;
                    System.out.println("Duração total: " + min + ":" + seg);
                    break;

                case 5:
                    if (musicas.isEmpty()){
                        System.out.println("Playlist vazia");
                    }else {
                        for (Musica m : musicas){
                            int minuto = m.getDuracao() / 60;
                            int segundo = m.getDuracao() % 60;
                            System.out.println(m.getTitulo() + " - " + m.getArtista() + "(" + minuto + ":" + segundo + ")"  );
                        }
                    }

            }

        }while (opcao !=0);
        System.out.println("Encerrando Sistema");

        sc.close();
    }
}
