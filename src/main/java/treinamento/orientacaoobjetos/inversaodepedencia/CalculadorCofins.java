package treinamento.orientacaoobjetos.inversaodepedencia;

import java.math.BigDecimal;

public class CalculadorCofins {

    public BigDecimal calcula(NotaFiscal notaFiscal) {
        return notaFiscal.getValorLiquido()
            .add(notaFiscal.getValorCofins());
    }
}
