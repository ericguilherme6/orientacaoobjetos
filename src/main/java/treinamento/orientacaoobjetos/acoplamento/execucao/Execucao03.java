package treinamento.orientacaoobjetos.acoplamento.execucao;

import treinamento.orientacaoobjetos.acoplamento.PedidoCompra;

public class Execucao03 implements Execucao{

    @Override
    public void execute(PedidoCompra pedidoCompra) {
        System.out.println("Salvando pedido: " + pedidoCompra.toString());
    }
}
