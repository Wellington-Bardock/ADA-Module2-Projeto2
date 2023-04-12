package br.com.ada.projeto.Modulo2.v2.enums;

public enum TipoCliente {

    PESSOA_FISICA(1),
    PESSOA_JURIDICA(2);

    private final Integer tpCliente;

    TipoCliente(Integer tpCliente) {
        this.tpCliente = tpCliente;

    }

    public Integer getTpCliente() {
        return tpCliente;
    }
}
