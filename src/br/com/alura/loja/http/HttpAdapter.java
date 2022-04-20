package br.com.alura.loja.http;

import java.net.MalformedURLException;
import java.util.Map;

public interface HttpAdapter {

    public void post(String url, Map<String, Object> dados) throws MalformedURLException;
}
