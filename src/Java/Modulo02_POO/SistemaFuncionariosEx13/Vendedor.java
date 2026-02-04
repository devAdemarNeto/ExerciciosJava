package Java.Modulo02_POO.SistemaFuncionariosEx13;

public class Vendedor extends Funcionario {
    private int totalVendas;

    public Vendedor(String nome, double salarioBase, int totalVendas) {
        super(nome, salarioBase);
        this.totalVendas = totalVendas;
    }

    public int getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(int totalVendas) {
        this.totalVendas = totalVendas;
    }

    @Override
    public void calcularSalario() {
        super.calcularSalario();
        double comissao = totalVendas * 50; // R$50 por venda
        double salarioTotal = getSalarioBase() + comissao;
        System.out.println("Comissão (" + totalVendas + " vendas x R$50): R$ " + comissao);
        System.out.println("Salário Total: R$ " + salarioTotal);
    }
}
