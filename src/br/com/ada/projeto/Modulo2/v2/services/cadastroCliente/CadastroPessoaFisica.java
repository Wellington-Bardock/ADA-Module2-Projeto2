package br.com.ada.projeto.Modulo2.v2.services.cadastroCliente;

import br.com.ada.projeto.Modulo2.v2.entity.Pessoa;
import br.com.ada.projeto.Modulo2.v2.entity.PessoaFisica;

import java.time.LocalDate;

public class CadastroPessoaFisica implements CadastroPessoa {

    public Pessoa cadastroPessoaFisica(String nome, LocalDate dataNascimento, String rg, String cpf) {

        PessoaFisica pessoaFisica = new PessoaFisica();

        pessoaFisica.setNome(nome);
        pessoaFisica.setRg(rg);
        pessoaFisica.setCpf(cpf);
        pessoaFisica.setDataNascimento(dataNascimento);

        return pessoaFisica;

    }

}
