package treinamento.orientacaoobjetos.acoplamento;

public class PedidoCompra {

    private Produto produto;
    private double quantidade;

    public PedidoCompra(Produto produto, double quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public double getQuantidade() {
        return quantidade;
    }
}
