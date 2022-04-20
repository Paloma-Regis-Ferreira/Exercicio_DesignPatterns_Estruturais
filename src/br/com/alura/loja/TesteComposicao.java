package br.com.alura.loja;

import br.com.alura.loja.orcamento.ItemOrcamento;
import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.orcamento.OrcamentoProxy;
import br.com.alura.loja.orcamento.Orcavel;

import java.math.BigDecimal;

public class TesteComposicao {

    public static void main(String[] args){

        Orcamento primeiro = new Orcamento();
        primeiro.adicionarItem(new ItemOrcamento(new BigDecimal("900")));
        primeiro.reprovar();

        Orcamento segundo = new Orcamento();
        segundo.adicionarItem(new ItemOrcamento(new BigDecimal("100")));
        segundo.adicionarItem(primeiro);

        OrcamentoProxy proxy = new OrcamentoProxy(segundo);

        System.out.println("valor:" + proxy.getValor());
        System.out.println("valor:" + proxy.getValor());
        System.out.println("valor:" + proxy.getValor());
    }
}
