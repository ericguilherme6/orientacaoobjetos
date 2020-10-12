package treinamento.orientacaoobjetos.coesao;

import java.math.BigDecimal;

import treinamento.orientacaoobjetos.coesao.calculadores.CalculadorEntradaProduto;
import treinamento.orientacaoobjetos.coesao.calculadores.CalculadorSaidaProduto;

import static treinamento.orientacaoobjetos.coesao.TipoMovimentoEstoque.ENTRADA_PRODUTO;

public class CalculadoraDeMovimentoEstoque {

    public BigDecimal calculaValorMovimentoEstoque(MovimentoEstoque movimentoEstoque) {
        if(ENTRADA_PRODUTO.equals(movimentoEstoque.getTipoMovimento())) {
            return CalculadorEntradaProduto.calculaValorMovimentoEntradaProduto(movimentoEstoque);
        }

        if(TipoMovimentoEstoque.SAIDA_PRODUTO.equals(movimentoEstoque.getTipoMovimento())) {
            return CalculadorSaidaProduto.calculaValorMovimentoSaidaProduto(movimentoEstoque);
        }

        throw new RuntimeException("Movimento inválido");
    }

}


