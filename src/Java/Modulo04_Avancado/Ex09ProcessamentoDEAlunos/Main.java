package Java.Modulo04_Avancado.Ex09ProcessamentoDEAlunos;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<>();
        alunos.add(new Aluno("Ademar",7.5,"Engenharia de Software"));
        alunos.add(new Aluno("Thamily",8.5,"Desgin"));
        alunos.add(new Aluno("Cleonice",9,"Corte e costura"));
        alunos.add(new Aluno("Carla",9.5,"Serviço Social"));
        alunos.add(new Aluno("Filippe",10,"Engenharia Ambiental"));

        alunos.stream()
                .filter(ap -> ap.getNota()>=7)
                .sorted((a,b) -> Double.compare(b.getNota(), a.getNota()))
                .forEach(p -> System.out.println("Nome: " + p.getNome() + " Nota: "  + p.getNota()));

        alunos.stream()
                .filter(c -> c.getCurso().equals("Engenharia de Software"))
                .forEach(c -> System.out.println("Curso: " + c.getCurso()));


        Double media = alunos.stream()
                .filter(c -> c.getCurso().equals("Corte e costura") )
                .mapToDouble(m -> m.getNota())
                .average()
                .orElse(0);
        System.out.println("Media: " + media);




    }
}
