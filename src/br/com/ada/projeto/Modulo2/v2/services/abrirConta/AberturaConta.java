package br.com.ada.projeto.Modulo2.v2.services.abrirConta;

import br.com.ada.projeto.Modulo2.v2.entity.Conta;
import br.com.ada.projeto.Modulo2.v2.entity.Pessoa;

public interface AberturaConta {
    Conta abrirConta(Pessoa pessoa);
}
