package Java.Modulo02_POO.Ex19SistemaPagamentos;

public class PagamentoBoleto implements Pagavel{
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Via Boleto: ");
        System.out.println("Valor: " + valor);
        System.out.println("Taxa(5%): " + valor * 0.05);
        System.out.println("Total: R$ " + (valor + (valor * 0.05)));
    }
}
