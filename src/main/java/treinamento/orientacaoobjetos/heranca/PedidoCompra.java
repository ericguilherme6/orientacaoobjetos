package treinamento.orientacaoobjetos.heranca;

public class PedidoCompra {

    protected int quantidade;
    protected Estoque estoque;

    public PedidoCompra(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public Estoque getEstoque() {
        return estoque;
    }

    public void setEstoque(Estoque estoque) {
        this.estoque = estoque;
    }

    public void validaQuantidade() throws QuantidadePedidoInvalidaExeception {
        if(getQuantidade() < 0){
            throw new QuantidadePedidoInvalidaExeception();
        }
    }

    public void lancarQuantidadeNoEstoque(){
        getEstoque().setQuantidade(getQuantidade());
    }
}
