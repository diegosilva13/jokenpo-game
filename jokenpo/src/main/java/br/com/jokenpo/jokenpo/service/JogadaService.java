package br.com.jokenpo.jokenpo.service;

import org.springframework.stereotype.Component;

import br.com.jokenpo.jokenpo.domain.Jogada;

@Component
public class JogadaService {
	
	public Jogada jogadaQuePerde(Jogada jogada) {
		switch (jogada) {
		case PAPEL:
			return Jogada.PEDRA;
		case TESOURA:
			return Jogada.PAPEL;
		case PEDRA:
			return Jogada.TESOURA;
		default:
			return null;
		}
	}
}
