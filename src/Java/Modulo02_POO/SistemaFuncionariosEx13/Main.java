package Java.Modulo02_POO.SistemaFuncionariosEx13;

public class Main {
    public static void main(String[] args) {
        // Testando Gerente
        Gerente gerente = new Gerente("João", 5000.00);
        System.out.println("=== " + gerente.getNome() + " (Gerente) ===");
        gerente.calcularSalario();

        System.out.println();

        // Testando Vendedor
        Vendedor vendedor = new Vendedor("Maria", 2000.00, 10);
        System.out.println("=== " + vendedor.getNome() + " (Vendedor) ===");
        vendedor.calcularSalario();
    }
}
