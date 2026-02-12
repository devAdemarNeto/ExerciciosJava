package Java.Modulo02_POO.Ex15ContaCorrentePoupanca;

public class ContaPoupanca extends Conta {
    private double rendimentoMensal;  // Em porcentagem (ex: 0.5 = 0.5%)

    public ContaPoupanca(double saldo, double rendimentoMensal) {
        super(saldo);
        this.rendimentoMensal = rendimentoMensal;
    }

    public double getRendimentoMensal() {
        return rendimentoMensal;
    }

    // Método que aplica o rendimento mensal ao saldo
    public void aplicarRendimento() {
        double rendimento = getSaldo() * (rendimentoMensal / 100);
        double novoSaldo = getSaldo() + rendimento;
        setSaldo(novoSaldo);
        System.out.println("Rendimento (" + rendimentoMensal + "%): R$ " + rendimento);
        System.out.println("Saldo após rendimento: R$ " + getSaldo());
    }
}
