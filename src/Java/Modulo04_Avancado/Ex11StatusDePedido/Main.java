package Java.Modulo04_Avancado.Ex11StatusDePedido;

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido(1, StatusPedido.PENDENTE);
        System.out.println("Pedido #" + pedido.getNumeroPedido() + " - " + pedido.getStatus() + " ("
                + pedido.getStatus().getDescricao() + ")");

        // Avançando status normalmente
        pedido.avancarStatus(StatusPedido.PREPARANDO);
        System.out.println("Pedido #" + pedido.getNumeroPedido() + " - " + pedido.getStatus() + " ("
                + pedido.getStatus().getDescricao() + ")");

        pedido.avancarStatus(StatusPedido.ENVIADO);
        System.out.println("Pedido #" + pedido.getNumeroPedido() + " - " + pedido.getStatus() + " ("
                + pedido.getStatus().getDescricao() + ")");

        pedido.avancarStatus(StatusPedido.ENTREGUE);
        System.out.println("Pedido #" + pedido.getNumeroPedido() + " - " + pedido.getStatus() + " ("
                + pedido.getStatus().getDescricao() + ")");

        // Tentando voltar (deve falhar!)
        pedido.avancarStatus(StatusPedido.PREPARANDO);
    }
}
