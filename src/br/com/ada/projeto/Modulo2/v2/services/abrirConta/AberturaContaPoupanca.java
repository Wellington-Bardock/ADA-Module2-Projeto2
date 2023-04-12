package br.com.ada.projeto.Modulo2.v2.services.abrirConta;

import br.com.ada.projeto.Modulo2.v2.entity.ContaPoupanca;
import br.com.ada.projeto.Modulo2.v2.entity.Pessoa;
import br.com.ada.projeto.Modulo2.v2.entity.PessoaFisica;
import br.com.ada.projeto.Modulo2.v2.entity.PessoaJuridica;
import br.com.f1rst.projeto.Modulo1.v2.entity.*;

import java.math.BigDecimal;
import java.util.Random;

public class AberturaContaPoupanca implements AberturaConta {

    @Override
    public ContaPoupanca abrirConta(Pessoa cliente) {

        if (cliente instanceof PessoaJuridica) {
            throw new RuntimeException("Tipo de pessoa não permitido");
        }

        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.setSaldo(BigDecimal.ZERO);
        contaPoupanca.setAgencia(String.valueOf(new Random().nextInt(1, 100)));
        contaPoupanca.setConta(String.valueOf(new Random().nextInt(1, 1000)));
        contaPoupanca.setCliente((PessoaFisica) cliente);

        return contaPoupanca;
    }


}
