package treinamento.orientacaoobjetos.acoplamento;

import treinamento.orientacaoobjetos.acoplamento.execucao.Execucao01;
import treinamento.orientacaoobjetos.acoplamento.execucao.Execucao02;
import treinamento.orientacaoobjetos.acoplamento.execucao.Execucao03;
import treinamento.orientacaoobjetos.acoplamento.execucao.Execucao04;

public class GeradorPedidoDeCompra {

    private final Execucao01 execucao01;
    private final Execucao02 execucao02;
    private final Execucao03 execucao03;
    private final Execucao04 execucao04;

    public GeradorPedidoDeCompra(Execucao01 execucao01,
                                 Execucao02 execucao02,
                                 Execucao03 execucao03,
                                 Execucao04 execucao04) {
        this.execucao01 = execucao01;
        this.execucao02 = execucao02;
        this.execucao03 = execucao03;
        this.execucao04 = execucao04;
    }

    public PedidoCompra gerar(Produto produto, double quantidade){

        PedidoCompra pedidoCompra = new PedidoCompra(produto, quantidade);

        execucao01.execute(pedidoCompra);
        execucao02.execute(pedidoCompra);
        execucao03.execute(pedidoCompra);
        execucao04.execute(pedidoCompra);

        return pedidoCompra;
    }


}
