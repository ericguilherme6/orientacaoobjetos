package treinamento.orientacaoobjetos.inversaodepedencia;

import java.math.BigDecimal;
import java.util.Collection;

public class NotaFiscal {

    private BigDecimal valorPis;
    private BigDecimal valorLiquido;
    private BigDecimal valorCofins;

    public BigDecimal getValorPis() {
        return valorPis;
    }

    public void setValorPis(BigDecimal valorPis) {
        this.valorPis = valorPis;
    }

    public BigDecimal getValorLiquido() {
        return valorLiquido;
    }

    public void setValorLiquido(BigDecimal valorLiquido) {
        this.valorLiquido = valorLiquido;
    }

    public BigDecimal getValorCofins() {
        return valorCofins;
    }

    public void setValorCofins(BigDecimal valorCofins) {
        this.valorCofins = valorCofins;
    }
}
