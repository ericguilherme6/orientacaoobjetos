package treinamento.orientacaoobjetos.encapsulamento;

public class Duplicata {

    private double valor;
    private MeioDePagamento forma;

    public Duplicata(double valor, MeioDePagamento forma) {
        this.valor = valor;
        this.forma = forma;
    }

    public double getValor() {
        return valor;
    }

    public MeioDePagamento getForma() {
        return forma;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Duplicata)) {
            return false;
        }
        Duplicata outro = (Duplicata) obj;
        if (forma != outro.forma
            || Double.doubleToLongBits(valor) != Double
            .doubleToLongBits(outro.valor)) {
            return false;
        }

        return true;
    }

}
