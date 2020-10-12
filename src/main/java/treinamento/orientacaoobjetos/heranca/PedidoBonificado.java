package treinamento.orientacaoobjetos.heranca;

public class PedidoBonificado extends PedidoCompra {

    public PedidoBonificado(int quantidade) {
        super(quantidade);
    }

    public void lancarQuantidadeNoEstoque(){
        throw new RuntimeException("Não lança quantidade em estoque");
    }
}
