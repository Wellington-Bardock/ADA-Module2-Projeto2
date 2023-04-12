package br.com.ada.projeto.Modulo2.v2.services.sacar;

import br.com.ada.projeto.Modulo2.v2.entity.*;
import br.com.f1rst.projeto.Modulo1.v2.entity.*;

import java.math.BigDecimal;
import java.math.RoundingMode;

public interface Saque {

    BigDecimal TAXA_SAQUE_PJ = BigDecimal.valueOf(1.005);

    default void sacar(Conta conta, BigDecimal valor) {

        Pessoa pessoa = null;

        if (conta instanceof ContaCorrente contaCorrente) {

            pessoa = contaCorrente.getCliente();

        } else if (conta instanceof ContaPoupanca contaPoupanca) {

            pessoa = contaPoupanca.getCliente();

        } else if (conta instanceof ContaInvestimento contaInvestimento) {

            pessoa = contaInvestimento.getCliente();

        }
        if (pessoa instanceof PessoaJuridica) {

            valor = valor.multiply(TAXA_SAQUE_PJ);

        }
        if (valor.compareTo(conta.getSaldo()) > 0) {

            throw new RuntimeException("Valor insuficiente, transação não efetuada!");

        }

        conta.setSaldo(conta.getSaldo().subtract(valor).setScale(4, RoundingMode.HALF_EVEN));

    }

}
