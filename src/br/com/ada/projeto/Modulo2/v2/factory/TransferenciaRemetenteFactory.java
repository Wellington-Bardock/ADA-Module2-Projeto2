package br.com.ada.projeto.Modulo2.v2.factory;

import br.com.ada.projeto.Modulo2.v2.entity.ContaInvestimento;
import br.com.ada.projeto.Modulo2.v2.entity.ContaPoupanca;
import br.com.ada.projeto.Modulo2.v2.services.sacar.Saque;
import br.com.ada.projeto.Modulo2.v2.services.sacar.SaqueContaInvestimento;
import br.com.ada.projeto.Modulo2.v2.services.sacar.SaqueContaPoupanca;
import br.com.ada.projeto.Modulo2.v2.entity.Conta;
import br.com.ada.projeto.Modulo2.v2.entity.ContaCorrente;
import br.com.ada.projeto.Modulo2.v2.services.sacar.SaqueContaCorrente;

public class TransferenciaRemetenteFactory {

    public static Saque getRemetente(Conta contaRemetente) {

        Saque saque = null;

        if (contaRemetente instanceof ContaCorrente) {

            saque = new SaqueContaCorrente();

        } else if (contaRemetente instanceof ContaInvestimento) {

            saque = new SaqueContaInvestimento();

        } else if (contaRemetente instanceof ContaPoupanca) {

            saque = new SaqueContaPoupanca();

        }
        return saque;

    }

}
