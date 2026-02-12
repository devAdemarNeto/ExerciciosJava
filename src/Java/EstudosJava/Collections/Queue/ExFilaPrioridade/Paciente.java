package Java.EstudosJava.Collections.Queue.ExFilaPrioridade;

public class Paciente implements Comparable<Paciente>{
    private String nome;
    private NivelGravidade gravidade;

    public Paciente(String nome, NivelGravidade gravidade) {
        this.nome = nome;
        this.gravidade = gravidade;
    }

    public String getNome() {
        return nome;
    }

    public NivelGravidade getGravidade() {
        return gravidade;
    }

    @Override
    public int compareTo(Paciente o) {
        return this.gravidade.getPrioridade().compareTo(o.gravidade.getPrioridade());
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "nome='" + nome + '\'' +
                ", gravidade=" + gravidade +
                ", minutosEspera= " + gravidade.getMinutosEspera() +
                '}';
    }
}
