package treinamento.orientacaoobjetos.heranca;

import java.util.Arrays;
import java.util.List;

public class GeradorDePedido {

    public List<Pedido> gerar() throws QuantidadePedidoInvalidaExeception {

        List<Pedido> pedidos = criarPedidos();

        for(Pedido pedido : pedidos){
            pedido.validaQuantidade();
            pedido.lancarQuantidadeNoEstoque();
        }

        return pedidos;
    }

    private List<Pedido> criarPedidos() {
        Pedido pedidoCompra = new Pedido(100);
        PedidoBonificado pedidoBonificado = new PedidoBonificado(50);

        return Arrays.asList(pedidoCompra, pedidoBonificado);
    }

}
