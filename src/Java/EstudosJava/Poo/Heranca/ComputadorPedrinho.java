package Java.EstudosJava.Poo.Heranca;

import Java.EstudosJava.Poo.Encapsulamento.MSNMessenger;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        //abrindo MSN Messenger
        MSNMessenger msn = new MSNMessenger();

        //só precisa enviar e receber mensagem sem preocupação de saber como funcionar outros metodos

        msn.enviarMensagem();

        msn.receberMensagem();


        FacebookMesenger facebookMesenger = new FacebookMesenger();
        facebookMesenger.enviarMensagem();
        facebookMesenger.receberMensagem();

        Telegram telegram = new Telegram();
        telegram.enviarMensagem();
        telegram.receberMensagem();
    }
}
