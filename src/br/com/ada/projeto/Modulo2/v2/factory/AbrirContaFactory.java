package br.com.ada.projeto.Modulo2.v2.factory;

import br.com.ada.projeto.Modulo2.v2.services.abrirConta.AberturaConta;
import br.com.ada.projeto.Modulo2.v2.enums.TipoConta;
import br.com.ada.projeto.Modulo2.v2.services.abrirConta.AberturaContaCorrente;
import br.com.ada.projeto.Modulo2.v2.services.abrirConta.AberturaContaInvestimento;
import br.com.ada.projeto.Modulo2.v2.services.abrirConta.AberturaContaPoupanca;

public class AbrirContaFactory {

    public static AberturaConta getAbrirConta(Integer tpConta) {

        AberturaConta aberturaConta;

        if (tpConta.equals(TipoConta.CONTA_CORRENTE.getTpConta())) {

            aberturaConta = new AberturaContaCorrente();

        } else if (tpConta.equals(TipoConta.CONTA_POUPANCA.getTpConta())) {

            aberturaConta = new AberturaContaPoupanca();

        } else if (tpConta.equals(TipoConta.CONTA_INVESTIMENTO.getTpConta())) {

            aberturaConta = new AberturaContaInvestimento();

        } else {
            throw new RuntimeException("Opção Inválida!");
        }

        return aberturaConta;

    }
}
