package br.com.ada.projeto.Modulo2.v2.entity;

import java.time.LocalDate;

public class PessoaFisica extends Pessoa {

    protected String rg;
    protected String cpf;
    protected LocalDate dataNascimento;

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
