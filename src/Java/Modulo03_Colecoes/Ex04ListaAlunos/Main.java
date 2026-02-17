package Java.Modulo03_Colecoes.Ex04ListaAlunos;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        // === PASSO 1: Criar a lista e adicionar alunos ===
        ArrayList<Aluno> alunos = new ArrayList<>();
        alunos.add(new Aluno("Pedro", 9.0));
        alunos.add(new Aluno("Ana", 8.5));
        alunos.add(new Aluno("Carlos", 6.0));
        alunos.add(new Aluno("Maria", 7.5));

        // === PASSO 2: Ordenar por NOME (usa o compareTo da classe Aluno) ===
        // Collections.sort() chama o compareTo() automaticamente
        // para decidir quem vem antes de quem
        Collections.sort(alunos);

        System.out.println("=== Ordenado por Nome ===");
        for (Aluno a : alunos) {
            a.exibirInfo();
        }
        // Resultado: Ana, Carlos, Maria, Pedro (ordem alfabética)

        // === PASSO 3: Ordenar por NOTA (maior para menor) ===
        // Aqui usamos um Comparator "inline" porque queremos
        // uma ordenação DIFERENTE do compareTo padrão
        // (a, b) são dois alunos sendo comparados
        // Se b.nota > a.nota → b vem primeiro (ordem decrescente)
        Collections.sort(alunos, (a, b) -> Double.compare(b.getNota(), a.getNota()));

        System.out.println("\n=== Ordenado por Nota (maior → menor) ===");
        for (Aluno a : alunos) {
            a.exibirInfo();
        }
        // Resultado: Pedro (9.0), Ana (8.5), Maria (7.5), Carlos (6.0)

        // === PASSO 4 (BÔNUS): Ordenar por nota crescente ===
        // Basta inverter a e b!
        Collections.sort(alunos, (a, b) -> Double.compare(a.getNota(), b.getNota()));

        System.out.println("\n=== Ordenado por Nota (menor → maior) ===");
        for (Aluno a : alunos) {
            a.exibirInfo();
        }
    }
}
