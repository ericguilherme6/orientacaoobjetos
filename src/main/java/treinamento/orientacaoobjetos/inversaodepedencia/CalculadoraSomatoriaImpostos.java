package treinamento.orientacaoobjetos.inversaodepedencia;

import java.math.BigDecimal;

public class CalculadoraSomatoriaImpostos {

    private final CalculadorPis calculadorPis;
    private final CalculadorCofins calculadorCofins;

    public CalculadoraSomatoriaImpostos(CalculadorPis calculadorPis, CalculadorCofins calculadorCofins) {
        this.calculadorPis = calculadorPis;
        this.calculadorCofins = calculadorCofins;
    }

    public BigDecimal calcula(NotaFiscal notaFiscal) {
        BigDecimal pisCalculado = calculadorPis.calcula(notaFiscal);
        BigDecimal cofinsCalculado = calculadorCofins.calcula(notaFiscal);

        return pisCalculado.add(cofinsCalculado);
    }

}
