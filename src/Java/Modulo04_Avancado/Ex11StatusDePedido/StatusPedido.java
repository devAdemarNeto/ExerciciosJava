package Java.Modulo04_Avancado.Ex11StatusDePedido;

public enum StatusPedido {
    PENDENTE("Aguardando confirmação"),
    PREPARANDO("Em produção"),
    ENVIADO("Saiu para entrega"),
    ENTREGUE("Pedido entregue"),
    CANCELADO("Pedido cancelado");

    private final String descricao;

    StatusPedido(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
