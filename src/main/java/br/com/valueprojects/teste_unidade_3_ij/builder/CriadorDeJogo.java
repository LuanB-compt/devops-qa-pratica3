package br.com.valueprojects.teste_unidade_3_ij.builder;

import br.com.valueprojects.teste_unidade_3_ij.dominio.Jogo;
import br.com.valueprojects.teste_unidade_3_ij.dominio.Participante;
import br.com.valueprojects.teste_unidade_3_ij.dominio.Resultado;

public class CriadorDeJogo {
	
	private Jogo jogo;

    public CriadorDeJogo() { }

    public CriadorDeJogo para(String descricao) {
        this.jogo = new Jogo(descricao);
        return this;
    }

    public CriadorDeJogo resultado(Participante participante, double metrica) {
        jogo.anota(new Resultado(participante, metrica));
        return this;
    }

    public Jogo constroi() { 
        return jogo;
    }


}
