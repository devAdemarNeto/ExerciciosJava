package Java.Modulo03_Colecoes.Ex04ListaAlunos;

// A classe implementa Comparable<Aluno> para o Java saber como ordenar
// Sem isso, Collections.sort() daria erro!
public class Aluno implements Comparable<Aluno> {
    private String nome;
    private double nota;

    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public double getNota() {
        return nota;
    }

    // Este método é OBRIGATÓRIO quando implementa Comparable
    // Ele "ensina" ao Java como comparar dois alunos
    // Aqui estamos ordenando por NOME (ordem alfabética)
    @Override
    public int compareTo(Aluno outro) {
        // compareTo de String já retorna negativo, zero ou positivo
        // Então delegamos para a comparação de String
        return this.nome.compareTo(outro.nome);
    }

    public void exibirInfo() {
        System.out.println(nome + " - Nota: " + nota);
    }
}
