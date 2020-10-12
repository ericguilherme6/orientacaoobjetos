package treinamento.orientacaoobjetos.coesao.calculadores;

import java.math.BigDecimal;

import treinamento.orientacaoobjetos.coesao.MovimentoEstoque;

public class CalculadorSaidaProduto {

    private static final BigDecimal PORCENTAGEM_PARA_MOVIMENTO_SAIDA = new BigDecimal("0,85");

    public static BigDecimal calculaValorMovimentoSaidaProduto(MovimentoEstoque movimentoEstoque) {
        return movimentoEstoque.getValor().multiply(PORCENTAGEM_PARA_MOVIMENTO_SAIDA);
    }

}
