package br.com.jokenpo.jokenpo.controller.dto;

import java.io.Serializable;

import br.com.jokenpo.jokenpo.model.Jogador;

public class JogadorDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Jogador jogador1;
	
	private Jogador jogador2;

	public Jogador getJogador1() {
		return jogador1;
	}

	public void setJogador1(Jogador jogador1) {
		this.jogador1 = jogador1;
	}
	
	public Jogador getJogador2() {
		return jogador2;
	}
	
	public void setJogador2(Jogador jogador2) {
		this.jogador2 = jogador2;
	}
}

