package Java.EstudosJava.Collections.Queue.ExFilaPrioridade;

import java.util.PriorityQueue;

public class BalcaoTriagem {
    public static void main(String[] args) {
        PriorityQueue<Paciente> pacientes = new PriorityQueue<>();

        pacientes.add(new Paciente("Felipe Alves",      NivelGravidade.URGENCIA));
        pacientes.add(new Paciente("Maria Lucia",       NivelGravidade.EMERGENCIA));
        pacientes.add(new Paciente("Jose",              NivelGravidade.NAO_URGENTE));
        pacientes.add(new Paciente("Marcos",            NivelGravidade.POUCO_URGENTE));
        pacientes.add(new Paciente("Joaquim da Silva",  NivelGravidade.EMERGENCIA));

// Ordem esperada -> [Maria Lucia, Joaquim Silva, Felipe Alves, Marcos, Jose]

        while (pacientes.size() > 0){
            //System.out.println("O próximo cliente da fila sera? " + pacientes.peek());
            System.out.println("Acabamos de atender o Senhor(a) " + pacientes.poll());
        }
    }
}
