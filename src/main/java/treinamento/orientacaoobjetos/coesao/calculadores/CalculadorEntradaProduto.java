package treinamento.orientacaoobjetos.coesao.calculadores;

import java.math.BigDecimal;

import treinamento.orientacaoobjetos.coesao.MovimentoEstoque;

public class CalculadorEntradaProduto {

    public static BigDecimal calculaValorMovimentoEntradaProduto(MovimentoEstoque movimentoEstoque) {
        return movimentoEstoque.getValor()
            .add(movimentoEstoque.getPisValor())
            .add(movimentoEstoque.getCofinsValor())
            .add(movimentoEstoque.getIcmsValor());
    }

}
