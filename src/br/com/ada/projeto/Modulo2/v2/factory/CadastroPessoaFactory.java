package br.com.ada.projeto.Modulo2.v2.factory;

import br.com.ada.projeto.Modulo2.v2.enums.TipoCliente;
import br.com.ada.projeto.Modulo2.v2.services.cadastroCliente.CadastroPessoaFisica;
import br.com.ada.projeto.Modulo2.v2.services.cadastroCliente.CadastroPessoa;
import br.com.ada.projeto.Modulo2.v2.services.cadastroCliente.CadastroPessoaJuridica;

public class CadastroPessoaFactory {

    public static CadastroPessoa getCadastroPessoa (Integer tpCliente) {

        CadastroPessoa cadastroPessoa;

        if (tpCliente.equals(TipoCliente.PESSOA_FISICA.getTpCliente())) {

            cadastroPessoa = new CadastroPessoaFisica();


        } else if (tpCliente.equals(TipoCliente.PESSOA_JURIDICA.getTpCliente())) {

            cadastroPessoa = new CadastroPessoaJuridica();

        } else {

            throw new RuntimeException("Opção Inválida!");

        } return cadastroPessoa;

    }

}
