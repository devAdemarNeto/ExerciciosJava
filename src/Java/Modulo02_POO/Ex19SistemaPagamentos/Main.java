package Java.Modulo02_POO.Ex19SistemaPagamentos;

public class Main {
    public static void main(String[] args) {
        double valor = 100.00;
        System.out.println("Processando pagamento de R$ " + valor + "...\n");

        // Via Cartão
        PagamentoCartao cartao = new PagamentoCartao();
        cartao.processarPagamento(valor);

        System.out.println();

        // Via Pix
        PagamentoPix pix = new PagamentoPix();
        pix.processarPagamento(valor);

        System.out.println();

        // Via Boleto
        PagamentoBoleto boleto = new PagamentoBoleto();
        boleto.processarPagamento(valor);
    }
}
