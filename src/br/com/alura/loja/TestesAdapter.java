package br.com.alura.loja;

import br.com.alura.loja.http.HttpClient;
import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.orcamento.RegistroOrcamento;

import java.math.BigDecimal;

public class TestesAdapter {

    public static void main(String[] args){
        Orcamento orcamento = new Orcamento();
        orcamento.aprovar();
        orcamento.finalizar();

        RegistroOrcamento registroOrcamento = new RegistroOrcamento(new HttpClient());
        registroOrcamento.registrar(orcamento);
    }
}
