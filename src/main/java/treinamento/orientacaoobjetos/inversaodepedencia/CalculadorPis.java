package treinamento.orientacaoobjetos.inversaodepedencia;

import java.math.BigDecimal;

public class CalculadorPis {

    public BigDecimal calcula(NotaFiscal notaFiscal) {
        return notaFiscal.getValorLiquido()
            .add(notaFiscal.getValorPis());
    }
}
