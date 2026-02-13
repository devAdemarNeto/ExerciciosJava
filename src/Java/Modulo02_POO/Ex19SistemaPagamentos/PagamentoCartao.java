package Java.Modulo02_POO.Ex19SistemaPagamentos;

public class PagamentoCartao implements Pagavel{
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Via Cartão: ");
        System.out.println("Valor: " + valor);
        System.out.println("Taxa(2%): " + valor * 0.02);
        System.out.println("Total: R$ " + (valor + (valor * 0.02)));
    }
}
