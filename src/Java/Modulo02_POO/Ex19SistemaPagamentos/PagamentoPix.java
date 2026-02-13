package Java.Modulo02_POO.Ex19SistemaPagamentos;

public class PagamentoPix implements Pagavel{
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Via Pix: ");
        System.out.println("Valor: " + valor);
        System.out.println("Taxa(): " +  0.0);
        System.out.println("Total: R$ " + valor);
    }
}
