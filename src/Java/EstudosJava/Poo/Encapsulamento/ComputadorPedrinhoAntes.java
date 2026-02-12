package Java.EstudosJava.Poo.Encapsulamento;

public class ComputadorPedrinhoAntes {
    public static void main(String[] args) {
        //abrindo MSN Messenger
        MSNMessenger msn = new MSNMessenger();

        //Teria que fazer todos os passos manualmente
        //msn.validarConectadoInternet();
        msn.enviarMensagem();
       // msn.salvarHistoricoMensagem();

        msn.receberMensagem();
    }
}
