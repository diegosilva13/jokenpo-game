package br.com.jokenpo.jokenpo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.jokenpo.jokenpo.domain.Jogada;
import br.com.jokenpo.jokenpo.exception.EmpateException;
import br.com.jokenpo.jokenpo.model.Jogador;

@Component
public class JokenpoService {
	
	@Autowired
	JogadaService jogadaService;
	
	public Jogador ganhador(Jogador jogador1, Jogador jogador2) {
		this.verificaEmpate(jogador1, jogador2);
		
		Jogada jogadaJogador1 = jogador1.getJogada();
		Jogada jogadaJogador2 = jogador2.getJogada();
		
		if(jogadaService.jogadaQuePerde(jogadaJogador1).equals(jogadaJogador2)) {
			return jogador1;
		}else {
			return jogador2;
		}
	}
	
	public void verificaEmpate(Jogador jogador1, Jogador jogador2) {
		if(jogador1.getJogada().equals(jogador2.getJogada())) {
			throw new EmpateException("Empate de jogadas");
		}
	}
}
