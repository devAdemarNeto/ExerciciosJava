package Java.Modulo04_Avancado.Ex11StatusDePedido;

public class Pedido {
    private int numeroPedido;
    private StatusPedido status;

    public Pedido(int numeroPedido, StatusPedido status) {
        this.numeroPedido = numeroPedido;
        this.status = status;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    public void avancarStatus(StatusPedido statusPedido){
        if (statusPedido.ordinal() >this.status.ordinal()  ){
            this.status = statusPedido;
            System.out.println("Status alterado com sucesso");
        }else {
            System.out.println("Não é possivel voltar para " + statusPedido);
        }
    }
}
