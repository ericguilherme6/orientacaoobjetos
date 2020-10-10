package treinamento.orientacaoobjetos.encapsulamento;

import java.util.List;

public class GeradorDeDuplicatasAPagar {

    public void gerar(List<Contas> contas, Fatura fatura) {

        contas
            .forEach(conta -> {
                Duplicata duplicata = new Duplicata(conta.getValor(), MeioDePagamento.CARTAO);
                fatura.getDuplicatas().add(duplicata);
            }); 

        if(fatura.getValor() > 0){
            fatura.setPago(true);
        }else {
            fatura.setPago(false);
        }
    }
}

