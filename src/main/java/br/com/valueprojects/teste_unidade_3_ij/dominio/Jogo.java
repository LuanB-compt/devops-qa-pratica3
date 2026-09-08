package br.com.valueprojects.teste_unidade_3_ij.dominio;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Jogo {
	private String descricao;
	private List<Resultado> resultados;
	
	public Jogo(String descricao) {
		this.descricao = descricao;
		this.resultados = new ArrayList<Resultado>();
	}
	
	public void anota(Resultado resultado) {
		if(resultados.isEmpty() || 
                !resultados.get(ultimoResultadoVisto()).getParticipante().equals(resultado.getParticipante())) {
            resultados.add(resultado);
        }
		
	}

	private int ultimoResultadoVisto() {
		return resultados.size()-1;
	}

	public String getDescricao() {
		return descricao;
	}

	public List<Resultado> getResultados() {
		return Collections.unmodifiableList(resultados);
	}


	// variável auxiliar de contagem removida
	// usa resultados.size() diretamente
	public double calculaMedia() {
		if (resultados.isEmpty()) return 0.0;
		double soma = 0.0;
		for (Resultado r : resultados) {
			soma += r.getMetrica();
		}
		return soma / resultados.size();
	}
}
