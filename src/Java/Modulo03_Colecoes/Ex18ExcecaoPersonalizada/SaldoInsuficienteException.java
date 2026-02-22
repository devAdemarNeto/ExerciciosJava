package Java.Modulo03_Colecoes.Ex18ExcecaoPersonalizada;

public class SaldoInsuficienteException extends Exception{
    public SaldoInsuficienteException(String mensgem){
        super(mensgem);
    }
}
