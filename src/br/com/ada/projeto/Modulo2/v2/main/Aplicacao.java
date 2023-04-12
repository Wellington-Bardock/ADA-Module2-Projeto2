package br.com.ada.projeto.Modulo2.v2.main;

import br.com.ada.projeto.Modulo2.v2.entity.Conta;
import br.com.ada.projeto.Modulo2.v2.entity.Pessoa;
import br.com.ada.projeto.Modulo2.v2.entity.PessoaFisica;
import br.com.ada.projeto.Modulo2.v2.enums.TipoTransacao;
import br.com.ada.projeto.Modulo2.v2.factory.DepositoFactory;
import br.com.ada.projeto.Modulo2.v2.factory.SaqueFactory;
import br.com.ada.projeto.Modulo2.v2.services.sacar.Saque;
import br.com.ada.projeto.Modulo2.v2.factory.AbrirContaFactory;
import br.com.ada.projeto.Modulo2.v2.services.abrirConta.AberturaConta;
import br.com.ada.projeto.Modulo2.v2.services.depositar.Deposito;
import br.com.ada.projeto.Modulo2.v2.services.exibirSaldo.ExibirSaldo;

import java.math.BigDecimal;
import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {

        Pessoa cliente = new PessoaFisica();
        cliente.setNome("Wellington");

        Scanner scanner = new Scanner(System.in);

        System.out.println("""
        Qual conta você gostaria de abrir?
        1 - Conta Corrente
        2 - Conta Poupança
        3 - Conta Investimento""");

        Integer tpConta = Integer.parseInt(scanner.nextLine());

        AberturaConta aberturaConta = AbrirContaFactory.getAbrirConta(tpConta);

        Conta conta = aberturaConta.abrirConta(cliente);

        System.out.println("""
        Qual operação você gostaria de realizar?
        1 - Depósito
        2 - Saque
        3 - Transferencia""");

        Integer tpTransacao = Integer.parseInt(scanner.nextLine());

        if (tpTransacao.equals(1)) {

            Deposito deposito = DepositoFactory.getDeposito(tpConta);

            deposito.depositar(conta, BigDecimal.valueOf(1000), TipoTransacao.DEPOSITO);

        } else if (tpTransacao.equals(2)) {

            Saque saque = SaqueFactory.getSaque(tpConta);

            saque.sacar(conta, BigDecimal.valueOf(1000));

        }

        ExibirSaldo showSaldo = new ExibirSaldo();

        System.out.println(showSaldo.exibirSaldo(conta));

    }
}