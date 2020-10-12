package treinamento.orientacaoobjetos.heranca;

import java.util.Arrays;
import java.util.List;

public class GeradorDePedido {

    public void gerar() throws QuantidadePedidoInvalidaExeception {

        List<PedidoCompra> pedidos = Arrays.asList(criarPedidoCompra(), criarPedidoBonificado());

        for (PedidoCompra pedido : pedidos){
            pedido.validaQuantidade();
            pedido.lancarQuantidadeNoEstoque();
        }
    }

    private PedidoCompra criarPedidoCompra() {
        return new PedidoCompra(100);
    }

    private PedidoBonificado criarPedidoBonificado() {
        return new PedidoBonificado(100);
    }

}
