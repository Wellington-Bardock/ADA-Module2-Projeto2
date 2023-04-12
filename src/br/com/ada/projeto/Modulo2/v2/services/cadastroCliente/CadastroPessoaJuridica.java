package br.com.ada.projeto.Modulo2.v2.services.cadastroCliente;

import br.com.ada.projeto.Modulo2.v2.entity.Pessoa;
import br.com.ada.projeto.Modulo2.v2.entity.PessoaJuridica;

public class CadastroPessoaJuridica implements CadastroPessoa {

    public Pessoa cadastroPessoaJuridica(String nome, String cnpj) {

        PessoaJuridica pessoaJuridica = new PessoaJuridica();

        pessoaJuridica.setNome(nome);
        pessoaJuridica.setCnpj(cnpj);

        return pessoaJuridica;

    }

}
