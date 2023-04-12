package br.com.ada.projeto.Modulo2.v2.services.abrirConta;

import br.com.ada.projeto.Modulo2.v2.entity.ContaCorrente;
import br.com.ada.projeto.Modulo2.v2.entity.Pessoa;

import java.math.BigDecimal;
import java.util.Random;

public class AberturaContaCorrente implements AberturaConta {

    @Override
    public ContaCorrente abrirConta(Pessoa cliente) {

        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.setSaldo(BigDecimal.ZERO);
        contaCorrente.setAgencia(String.valueOf(new Random().nextInt(1, 100)));
        contaCorrente.setConta(String.valueOf(new Random().nextInt(1, 1000)));
        contaCorrente.setCliente(cliente);

        return contaCorrente;
    }
}
