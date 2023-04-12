package br.com.ada.projeto.Modulo2.v2.entity;

public class ContaPoupanca extends Conta{

    protected PessoaFisica cliente;

    public PessoaFisica getCliente() {
        return cliente;
    }

    public void setCliente (PessoaFisica cliente) {
        this.cliente = cliente;
    }

}
