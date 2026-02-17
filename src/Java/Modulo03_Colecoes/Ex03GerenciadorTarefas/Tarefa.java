package Java.Modulo03_Colecoes.Ex03GerenciadorTarefas;

public class Tarefa {
    private String descricao;
    private boolean concluida = false;

    public Tarefa(String descricao, boolean concluida) {
        this.descricao = descricao;
        this.concluida = concluida;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean getConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    public void exibirTarefa(){
        System.out.println(descricao);
    }
}
