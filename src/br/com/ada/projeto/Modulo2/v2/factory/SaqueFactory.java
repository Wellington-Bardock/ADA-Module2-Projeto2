package br.com.ada.projeto.Modulo2.v2.factory;

import br.com.ada.projeto.Modulo2.v2.services.sacar.Saque;
import br.com.ada.projeto.Modulo2.v2.services.sacar.SaqueContaInvestimento;
import br.com.ada.projeto.Modulo2.v2.services.sacar.SaqueContaPoupanca;
import br.com.ada.projeto.Modulo2.v2.enums.TipoConta;
import br.com.ada.projeto.Modulo2.v2.services.sacar.SaqueContaCorrente;

public class SaqueFactory {

    public static Saque getSaque(Integer tpConta) {

        Saque saque;

        if (tpConta.equals(TipoConta.CONTA_CORRENTE.getTpConta())) {

            saque = new SaqueContaCorrente();

        } else if (tpConta.equals(TipoConta.CONTA_POUPANCA.getTpConta())) {

            saque = new SaqueContaPoupanca();

        } else if (tpConta.equals(TipoConta.CONTA_INVESTIMENTO.getTpConta())) {

            saque = new SaqueContaInvestimento();

        } else {
            throw new RuntimeException("Opção Inválida!");
        }

        return saque;

    }
}
