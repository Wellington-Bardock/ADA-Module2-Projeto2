package br.com.ada.projeto.Modulo2.v2.factory;

import br.com.ada.projeto.Modulo2.v2.entity.Conta;
import br.com.ada.projeto.Modulo2.v2.entity.ContaInvestimento;
import br.com.ada.projeto.Modulo2.v2.entity.ContaPoupanca;
import br.com.ada.projeto.Modulo2.v2.services.depositar.DepositoContaInvestimento;
import br.com.ada.projeto.Modulo2.v2.entity.ContaCorrente;
import br.com.ada.projeto.Modulo2.v2.services.depositar.Deposito;
import br.com.ada.projeto.Modulo2.v2.services.depositar.DepositoContaCorrente;
import br.com.ada.projeto.Modulo2.v2.services.depositar.DepositoContaPoupanca;

public class TransferenciaDestinoFactory {

    public static Deposito getDestino(Conta contaDestino) {

        Deposito deposito = null;

        if (contaDestino instanceof ContaCorrente) {

            deposito = new DepositoContaCorrente();

        } else if (contaDestino instanceof ContaInvestimento) {

            deposito = new DepositoContaInvestimento();

        } else if (contaDestino instanceof ContaPoupanca) {

            deposito = new DepositoContaPoupanca();

        }
        return deposito;

    }

}
