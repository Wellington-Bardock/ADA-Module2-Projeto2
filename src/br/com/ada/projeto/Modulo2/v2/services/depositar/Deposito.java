package br.com.ada.projeto.Modulo2.v2.services.depositar;

import br.com.ada.projeto.Modulo2.v2.entity.*;
import br.com.ada.projeto.Modulo2.v2.enums.TipoTransacao;
import br.com.f1rst.projeto.Modulo1.v2.entity.*;

import java.math.BigDecimal;
import java.math.RoundingMode;

public interface Deposito {

    BigDecimal JUROS_DEPOSITO = BigDecimal.valueOf(1.01);
    BigDecimal JUROS_DEPOSITO_PJ = JUROS_DEPOSITO.add(BigDecimal.valueOf(0.02));

    default void depositar(Conta conta, BigDecimal valor, TipoTransacao tpTransacao) {

        Pessoa pessoa = null;

        if (conta instanceof ContaCorrente contaCorrente) {

            pessoa = contaCorrente.getCliente();

        } else if (conta instanceof ContaPoupanca contaPoupanca) {

            pessoa = contaPoupanca.getCliente();

        } else if (conta instanceof ContaInvestimento contaInvestimento) {

            pessoa = contaInvestimento.getCliente();
        }

        if (pessoa instanceof PessoaFisica && conta instanceof ContaInvestimento &&
                tpTransacao.equals(TipoTransacao.DEPOSITO)) {

            valor = valor.multiply(JUROS_DEPOSITO);

        } else if (pessoa instanceof PessoaJuridica && conta instanceof ContaInvestimento &&
                tpTransacao.equals(TipoTransacao.DEPOSITO)) {

            valor = valor.multiply(JUROS_DEPOSITO_PJ);

        }
        conta.setSaldo(conta.getSaldo().add(valor).setScale(4, RoundingMode.HALF_EVEN));
    }
}