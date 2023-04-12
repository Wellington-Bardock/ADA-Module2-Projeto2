package br.com.ada.projeto.Modulo2.v2.services.exibirSaldo;

import br.com.ada.projeto.Modulo2.v2.entity.Conta;

import java.math.BigDecimal;

public class ExibirSaldo {

    public BigDecimal exibirSaldo (Conta conta) {

        return conta.getSaldo();

    }

}
