package Java.Modulo02_POO.Ex03ContaBancaria;

public class Main {

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.titular = "Ademar";
        conta.numeroConta = 12345;

        conta.depositar(1000);
        conta.sacar(300);
        conta.sacar(800);  // Deve falhar (saldo insuficiente)
        conta.consultarSaldo();
    }
}
