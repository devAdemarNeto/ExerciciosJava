package Java.EstudosJava.Poo.Polimorfismo;

public class MSN extends ServicoMensagemInstantanea{
    public void enviarMensagem(){
        System.out.println("Enviando mensagem pelo MSN Messenger");
    }
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo MSN Messenger");
    }
}
