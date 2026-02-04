package Java.Modulo02_POO.FuncionarioEx09;

public class Funcionario {
    private String nome;
    private String cargo;
    private double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void calcularAumento(double percentual){
    System.out.println("Aplicando aumento de " + percentual+"%");
        salario = salario + (salario * percentual / 100);
        System.out.printf("Novo Salário: R$ %.2f%n", salario);
    }


    public void exibirContraCheque(){
        System.out.println("=== CONTRA CHEQUE ===");
        System.out.println("Funcionário: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.printf("Salário: R$ %.2f%n", salario);
    }
}
