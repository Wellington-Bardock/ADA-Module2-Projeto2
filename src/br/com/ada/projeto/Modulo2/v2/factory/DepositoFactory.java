package br.com.ada.projeto.Modulo2.v2.factory;

import br.com.ada.projeto.Modulo2.v2.services.depositar.DepositoContaInvestimento;
import br.com.ada.projeto.Modulo2.v2.enums.TipoConta;
import br.com.ada.projeto.Modulo2.v2.services.depositar.Deposito;
import br.com.ada.projeto.Modulo2.v2.services.depositar.DepositoContaCorrente;
import br.com.ada.projeto.Modulo2.v2.services.depositar.DepositoContaPoupanca;

public class DepositoFactory {

    public static Deposito getDeposito (Integer tpConta) {

        Deposito deposito;

        if (tpConta.equals(TipoConta.CONTA_CORRENTE.getTpConta())) {

            deposito = new DepositoContaCorrente();

        } else if (tpConta.equals(TipoConta.CONTA_POUPANCA.getTpConta())) {

            deposito = new DepositoContaPoupanca();

        } else if (tpConta.equals(TipoConta.CONTA_INVESTIMENTO.getTpConta())) {

            deposito = new DepositoContaInvestimento();

        } else {
            throw new RuntimeException("Opção Inválida!");
        }

        return deposito;

    }
}
