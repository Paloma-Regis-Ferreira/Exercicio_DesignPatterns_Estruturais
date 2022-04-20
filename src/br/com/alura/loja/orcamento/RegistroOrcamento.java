package br.com.alura.loja.orcamento;

import br.com.alura.loja.DomainException;
import br.com.alura.loja.http.HttpAdapter;
import br.com.alura.loja.orcamento.situacao.Finalizado;

import java.net.MalformedURLException;
import java.util.Map;

public class RegistroOrcamento {

    private HttpAdapter http;

    public RegistroOrcamento(HttpAdapter http) {
        this.http = http;
    }

    public void registrar(Orcamento orcamento) {
        if(!orcamento.isFinalizado()){
            throw new DomainException("Orcamento nao finalizado");
        }
        String url = "http://api.externa";
        Map<String, Object> dados = Map.of(
                "valor", orcamento.getValor(),
                "quantidadeDeItens", orcamento.getQuantidadeItens()
        );
        try {
            http.post(url, dados);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
