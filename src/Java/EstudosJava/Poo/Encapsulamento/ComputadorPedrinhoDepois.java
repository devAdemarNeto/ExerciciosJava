package Java.EstudosJava.Poo.Encapsulamento;

public class ComputadorPedrinhoDepois {

    public static void main(String[] args) {
        //abrindo MSN Messenger
        MSNMessenger msn = new MSNMessenger();

        //só precisa enviar e receber mensagem sem preocupação de saber como funcionar outros metodos

        msn.enviarMensagem();

        msn.receberMensagem();
    }
}
