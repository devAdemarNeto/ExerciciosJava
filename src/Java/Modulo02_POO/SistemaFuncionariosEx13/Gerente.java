package Java.Modulo02_POO.SistemaFuncionariosEx13;

public class Gerente extends Funcionario {

    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }


    @Override
    public void calcularSalario() {
        super.calcularSalario();
        double bonus =  getSalarioBase() * 0.5;
        double salarioTotal = getSalarioBase() + bonus;
        System.out.println("Bônus (50%) : R$ " + bonus);
        System.out.println("Salario Total: R$" + salarioTotal);

    }
}
