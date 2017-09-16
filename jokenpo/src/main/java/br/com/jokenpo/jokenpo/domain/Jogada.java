package br.com.jokenpo.jokenpo.domain;

public enum Jogada {
	PEDRA("Pedra"),
	PAPEL("Papel"),
	TESOURA("Tesoura");
	
	private String nome;
	
	private Jogada(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
}
