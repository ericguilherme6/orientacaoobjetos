package treinamento.orientacaoobjetos.acoplamento.execucao;

import treinamento.orientacaoobjetos.acoplamento.PedidoCompra;

public class Execucao01 implements Execucao{

    @Override
    public void execute(PedidoCompra pedidoCompra) {
        System.out.println("Executando baixa Estoque do pedido: " + pedidoCompra.toString());
    }
}
