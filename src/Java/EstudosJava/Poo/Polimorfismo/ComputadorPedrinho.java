package Java.EstudosJava.Poo.Polimorfismo;

import Java.EstudosJava.Poo.Encapsulamento.MSNMessenger;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        ServicoMensagemInstantanea smi = null;

         /*
            NÃO SE SABE QUAL APP
            MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM
         */
        String appEscolhido="???"; // pode escolher msn, fbm, telg

        if(appEscolhido.equals("msn"))
            smi = new MSN();
        else if(appEscolhido.equals("fbm"))
            smi = new Facebook();
        else if(appEscolhido.equals("tlg"))
            smi = new Telegram();


        smi.enviarMensagem();
        smi.receberMensagem();
    }
}
