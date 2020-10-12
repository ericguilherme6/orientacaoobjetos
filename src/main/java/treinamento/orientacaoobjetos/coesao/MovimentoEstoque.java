package treinamento.orientacaoobjetos.coesao;

import java.math.BigDecimal;
import java.util.Calendar;

import treinamento.orientacaoobjetos.coesao.calculadores.CalculadorEntradaProduto;
import treinamento.orientacaoobjetos.coesao.calculadores.CalculadorSaidaProduto;

import static treinamento.orientacaoobjetos.coesao.TipoMovimentoEstoque.ENTRADA_PRODUTO;

public class MovimentoEstoque {

    private int id;
    private String descricao;
    private TipoMovimentoEstoque tipoMovimentoEstoque;
    private Calendar dataLancamento;
    private BigDecimal valor;
    private BigDecimal pisValor;
    private BigDecimal cofinsValor;
    private BigDecimal icmsValor;

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public TipoMovimentoEstoque getTipoMovimento() {
        return tipoMovimentoEstoque;
    }

    public Calendar getDataLancamento() {
        return dataLancamento;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setTipoMovimentoEstoque(TipoMovimentoEstoque tipoMovimentoEstoque) {
        this.tipoMovimentoEstoque = tipoMovimentoEstoque;
    }

    public void setDataLancamento(Calendar dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public BigDecimal getPisValor() {
        return pisValor;
    }

    public void setPisValor(BigDecimal pisValor) {
        this.pisValor = pisValor;
    }

    public BigDecimal getCofinsValor() {
        return cofinsValor;
    }

    public void setCofinsValor(BigDecimal cofinsValor) {
        this.cofinsValor = cofinsValor;
    }

    public BigDecimal getIcmsValor() {
        return icmsValor;
    }

    public void setIcmsValor(BigDecimal icmsValor) {
        this.icmsValor = icmsValor;
    }

    public BigDecimal calculaValor() {
        if(ENTRADA_PRODUTO.equals(getTipoMovimento())) {
            return CalculadorEntradaProduto.calculaValorMovimentoEntradaProduto(this);
        }

        if(TipoMovimentoEstoque.SAIDA_PRODUTO.equals(getTipoMovimento())) {
            return CalculadorSaidaProduto.calculaValorMovimentoSaidaProduto(this);
        }

        throw new RuntimeException("Movimento inválido");
    }
}
