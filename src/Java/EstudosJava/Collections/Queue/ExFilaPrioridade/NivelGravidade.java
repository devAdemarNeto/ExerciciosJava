package Java.EstudosJava.Collections.Queue.ExFilaPrioridade;

public enum NivelGravidade {
    EMERGENCIA (0 ,0),
    URGENCIA (1 ,60),
    POUCO_URGENTE (2 ,120),
    NAO_URGENTE (3 ,240);
    private Integer prioridade;
    private Integer minutosEspera;
    private NivelGravidade (Integer prioridade, Integer minutosEspera){
        this.prioridade = prioridade;
        this.minutosEspera = minutosEspera;
    }

    public Integer getPrioridade() {
        return prioridade;
    }

    public Integer getMinutosEspera() {
        return minutosEspera;
    }
}
