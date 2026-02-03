package Java.Modulo02_POO.ContaBancariaEx03;

public class ContaBancaria {
    String titular;
    double saldo;
    int numeroConta;

    public void depositar(double valor){
        if (valor <= 0){
            System.out.println("Valor inválido");
        }else {
            saldo = saldo + valor;
            System.out.println("Deposito de R$" + valor + " Realizado com sucesso!");
            System.out.println("Saldo atual: R$" + saldo);
        }

    }

    public void sacar(double valor){
        if (valor <= 0){
            System.out.println("Valor inválido");
        } else if (saldo < valor) {
            System.out.println("Saque de R$ "+ valor +" não permitido. Saldo insuficiente");
        }else {
            saldo = saldo - valor;
            System.out.println("Saque de R$ " + valor + " Realizado com sucesso!");
            System.out.println("Saldo atual: R$" + saldo);
        }

    }

    public void consultarSaldo() {
        System.out.println("Saldo atual: R$ " + saldo);
    }
}
