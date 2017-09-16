package br.com.jokenpo.jokenpo.model;

import java.io.Serializable;

import br.com.jokenpo.jokenpo.domain.Jogada;

public class Jogador implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String nome;
	
	private Jogada jogada;

	public Jogada getJogada() {
		return jogada;
	}

	public void setJogada(Jogada jogada) {
		this.jogada = jogada;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
}
