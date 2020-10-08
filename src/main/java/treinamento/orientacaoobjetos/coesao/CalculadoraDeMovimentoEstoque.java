package treinamento.orientacaoobjetos.coesao;

import java.math.BigDecimal;

import static treinamento.orientacaoobjetos.coesao.TipoMovimentoEstoque.ENTRADA_PRODUTO;

public class CalculadoraDeMovimentoEstoque {

    private static final BigDecimal PORCENTAGEM_PARA_MOVIMENTO_SAIDA = new BigDecimal("0,85");
    private static final BigDecimal PORCENTAGEM_PARA_MOVIMENTO_ESTORNO = new BigDecimal("0,10");

    public BigDecimal calculaValorMovimentoEstoque(MovimentoEstoque movimentoEstoque) {
        if(ENTRADA_PRODUTO.equals(movimentoEstoque.getTipoMovimento())) {
            return calculaValorMovimentoEntradaProduto(movimentoEstoque);
        }else if(TipoMovimentoEstoque.SAIDA_PRODUTO.equals(movimentoEstoque.getTipoMovimento())) {
            return calculaValorMovimentoSaidaProduto(movimentoEstoque);
        }else if(TipoMovimentoEstoque.ESTORNO_PRODUTO.equals(movimentoEstoque.getTipoMovimento())) {
            return calculaValorMovimentoEstornoProduto(movimentoEstoque);
        }else {
            throw new RuntimeException("Movimento inválido");
        }
    }

    private BigDecimal calculaValorMovimentoEntradaProduto(MovimentoEstoque movimentoEstoque) {
        return movimentoEstoque.getValor()
            .add(movimentoEstoque.getPisValor())
            .add(movimentoEstoque.getCofinsValor())
            .add(movimentoEstoque.getIcmsValor());
    }

    private BigDecimal calculaValorMovimentoSaidaProduto(MovimentoEstoque movimentoEstoque) {
        return movimentoEstoque.getValor().multiply(PORCENTAGEM_PARA_MOVIMENTO_SAIDA);
    }

    private BigDecimal calculaValorMovimentoEstornoProduto(MovimentoEstoque movimentoEstoque) {
        return movimentoEstoque.getValor().multiply(PORCENTAGEM_PARA_MOVIMENTO_ESTORNO);
    }

}


