package Java.Modulo02_POO.EncapsulamentoEx07;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.setTitular("Ademar");
        conta.setNumeroConta("12345");

        conta.depositar(1000);
        conta.sacar(300);
        conta.consultarSaldo();

        // Testar validação do saldo
        conta.setSaldo(-100);  // Não deve permitir!
    }
}
