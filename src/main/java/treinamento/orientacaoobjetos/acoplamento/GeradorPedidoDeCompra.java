package treinamento.orientacaoobjetos.acoplamento;

import java.util.List;

import treinamento.orientacaoobjetos.acoplamento.execucao.Execucao;

public class GeradorPedidoDeCompra {

    private List<Execucao> execucoes;

    public GeradorPedidoDeCompra(List<Execucao> execucoes) {
        this.execucoes = execucoes;
    }

    public PedidoCompra gerar(Produto produto, double quantidade){

        PedidoCompra pedidoCompra = new PedidoCompra(produto, quantidade);

        execucoes
            .forEach(execucao -> execucao.execute(pedidoCompra));

        return pedidoCompra;
    }


}
