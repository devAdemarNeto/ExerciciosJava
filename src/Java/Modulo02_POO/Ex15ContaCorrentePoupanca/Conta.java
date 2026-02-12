package Java.Modulo02_POO.Ex15ContaCorrentePoupanca;

public class Conta {
    private double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor){
        if (valor <= 0){
            System.out.println("Valor inválido");
        }else {
            saldo = saldo + valor;
            System.out.println("Deposito de R$" + valor + " Realizado com sucesso!");
            System.out.println("Saldo atual: R$" + saldo);
        }

    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido");
        } else if (saldo < valor) {
            System.out.println("Saque de R$ " + valor + " não permitido. Saldo insuficiente");
        } else {
            saldo = saldo - valor;
            System.out.println("Saque de R$ " + valor + " Realizado com sucesso!");
            System.out.println("Saldo atual: R$" + saldo);
        }
    }
}
