package br.com.alura.loja.imposto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public abstract class Imposto {

	protected Imposto outro;

	public Imposto(Imposto outro) {
		this.outro = outro;
	}

	protected abstract BigDecimal calcular(Orcamento orcamento);

	public BigDecimal calcularTotalImposto(Orcamento orcamento){
		BigDecimal valorImposto = calcular(orcamento);
		BigDecimal outroImposto = calcular(orcamento);

		if (outro != null){
			valorImposto = outro.calcular(orcamento);
		}

		return valorImposto.add(outroImposto);
	}

}
