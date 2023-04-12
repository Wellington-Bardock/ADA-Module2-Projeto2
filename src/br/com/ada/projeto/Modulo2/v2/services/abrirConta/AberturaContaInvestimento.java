package br.com.ada.projeto.Modulo2.v2.services.abrirConta;

import br.com.ada.projeto.Modulo2.v2.entity.ContaInvestimento;
import br.com.ada.projeto.Modulo2.v2.entity.Pessoa;

import java.math.BigDecimal;
import java.util.Random;

public class AberturaContaInvestimento implements AberturaConta {

    @Override
    public ContaInvestimento abrirConta(Pessoa cliente) {

        ContaInvestimento contaInvestimento = new ContaInvestimento();
        contaInvestimento.setSaldo(BigDecimal.ZERO);
        contaInvestimento.setAgencia(String.valueOf(new Random().nextInt(1, 100)));
        contaInvestimento.setConta(String.valueOf(new Random().nextInt(1, 1000)));
        contaInvestimento.setCliente(cliente);

        return contaInvestimento;
    }

}
