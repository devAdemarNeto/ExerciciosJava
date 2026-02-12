package Java.Modulo02_POO.Ex15ContaCorrentePoupanca;

public class ContaCorrente extends Conta {
    private double taxaManutencao;

    public ContaCorrente(double saldo, double taxaManutencao) {
        super(saldo);
        this.taxaManutencao = taxaManutencao;
    }

    public double getTaxaManutencao() {
        return taxaManutencao;
    }

    // Método que desconta a taxa de manutenção do saldo
    public void cobrarTaxa() {
        double saldoAtual = getSaldo();
        saldoAtual = saldoAtual - taxaManutencao;
        setSaldo(saldoAtual);
        System.out.println("Taxa de manutenção cobrada: R$ " + taxaManutencao);
        System.out.println("Saldo após taxa: R$ " + getSaldo());
    }
}
