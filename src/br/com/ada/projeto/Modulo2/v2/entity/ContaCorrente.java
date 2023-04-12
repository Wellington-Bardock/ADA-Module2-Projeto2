package br.com.ada.projeto.Modulo2.v2.entity;

public class ContaCorrente extends Conta{

    protected Pessoa cliente;

    public Pessoa getCliente() {
        return cliente;
    }

    public void setCliente (Pessoa cliente) {
        this.cliente = cliente;
    }

}
