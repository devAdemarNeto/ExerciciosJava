package Java.Modulo02_POO.EncapsulamentoEx07;

public class ContaBancaria {
    private String titular;
    private double saldo;
    private String numeroConta;

    public String getTitular(){
        return titular;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo){
        if (saldo >= 0){
            this.saldo = saldo;
        }
    }

    public String getNumeroConta(){
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta){
        this.numeroConta = numeroConta;
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
