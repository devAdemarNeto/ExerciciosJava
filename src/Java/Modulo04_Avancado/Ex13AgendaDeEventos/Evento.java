package Java.Modulo04_Avancado.Ex13AgendaDeEventos;

import java.time.LocalDate;
import java.time.LocalTime;

public class Evento {
    private String nome;
    private String local;
    private LocalDate data;
    private LocalTime hora;

    public Evento(String nome, String local, LocalDate data, LocalTime hora) {
        this.nome = nome;
        this.local = local;
        this.data = data;
        this.hora = hora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }
}
