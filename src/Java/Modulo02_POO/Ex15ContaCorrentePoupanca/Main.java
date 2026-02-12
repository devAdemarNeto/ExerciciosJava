package Java.Modulo02_POO.Ex15ContaCorrentePoupanca;

public class Main {
    public static void main(String[] args) {
        // === Conta Corrente ===
        System.out.println("=== Conta Corrente ===");
        ContaCorrente cc = new ContaCorrente(1000.00, 15.00);
        System.out.println("Saldo inicial: R$ " + cc.getSaldo());
        cc.cobrarTaxa();

        System.out.println();

        // === Conta Poupança ===
        System.out.println("=== Conta Poupança ===");
        ContaPoupanca cp = new ContaPoupanca(1000.00, 0.5);
        System.out.println("Saldo inicial: R$ " + cp.getSaldo());
        cp.aplicarRendimento();
    }
}
