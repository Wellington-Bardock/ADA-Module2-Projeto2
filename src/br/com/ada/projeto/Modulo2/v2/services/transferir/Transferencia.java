package br.com.ada.projeto.Modulo2.v2.services.transferir;

import br.com.ada.projeto.Modulo2.v2.services.sacar.Saque;
import br.com.ada.projeto.Modulo2.v2.entity.Conta;
import br.com.ada.projeto.Modulo2.v2.enums.TipoTransacao;
import br.com.ada.projeto.Modulo2.v2.factory.TransferenciaDestinoFactory;
import br.com.ada.projeto.Modulo2.v2.factory.TransferenciaRemetenteFactory;
import br.com.ada.projeto.Modulo2.v2.services.depositar.Deposito;

import java.math.BigDecimal;

public interface Transferencia {

    default void transferir(Conta contaRemetente, Conta contaDestino, BigDecimal valor) {

        Saque remetente = TransferenciaRemetenteFactory.getRemetente(contaRemetente);
        remetente.sacar(contaRemetente, valor);

        Deposito destino = TransferenciaDestinoFactory.getDestino(contaDestino);
        destino.depositar(contaDestino, valor, TipoTransacao.TRANSFERENCIA);

    }
}