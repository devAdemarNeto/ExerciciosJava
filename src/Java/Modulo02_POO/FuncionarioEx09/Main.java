package Java.Modulo02_POO.FuncionarioEx09;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Ademar Neto");
        funcionario.setCargo("Desenvolvedor");
        funcionario.setSalario(5000.00);
        funcionario.exibirContraCheque();
        funcionario.calcularAumento(10);
    }
}
