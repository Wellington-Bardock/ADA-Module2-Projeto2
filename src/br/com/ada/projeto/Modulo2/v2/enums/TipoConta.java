package br.com.ada.projeto.Modulo2.v2.enums;

public enum TipoConta {

    CONTA_CORRENTE(1),
    CONTA_POUPANCA(2),
    CONTA_INVESTIMENTO(3);

    private final Integer tpConta;

    TipoConta(Integer tpConta) {

        this.tpConta = tpConta;

    }

    public Integer getTpConta() {
        return tpConta;
    }
}
