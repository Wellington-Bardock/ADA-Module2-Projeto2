package br.com.ada.projeto.Modulo2.v2.factory;

import br.com.ada.projeto.Modulo2.v2.services.cadastroCliente.CadastroPessoaFisica;
import br.com.ada.projeto.Modulo2.v2.services.cadastroCliente.CadastroPessoa;
import br.com.ada.projeto.Modulo2.v2.services.cadastroCliente.CadastroPessoaJuridica;

public class CadastroPessoaFactory {

    public static CadastroPessoa getCadastroPessoa (Integer tpCliente) {

        CadastroPessoa cadastroPessoa;

        if (tpCliente.equals(1)) {

            cadastroPessoa = new CadastroPessoaFisica();


        } else if (tpCliente.equals(2)) {

            cadastroPessoa = new CadastroPessoaJuridica();

        } else {

            throw new RuntimeException("Opção Inválida!");

        } return cadastroPessoa;

    }

}
