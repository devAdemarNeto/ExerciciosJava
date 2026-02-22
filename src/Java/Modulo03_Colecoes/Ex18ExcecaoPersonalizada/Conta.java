package Java.Modulo03_Colecoes.Ex18ExcecaoPersonalizada;

public class Conta {
    double saldo;

    public void sacar(double valor) throws SaldoInsuficienteException{
        if (saldo < valor){
            throw new SaldoInsuficienteException("Saldo insuficiente");
        }
    }
}
