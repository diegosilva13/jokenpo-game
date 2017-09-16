package br.com.jokenpo.jokenpo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.jokenpo.jokenpo.controller.dto.JogadorDTO;
import br.com.jokenpo.jokenpo.exception.EmpateException;
import br.com.jokenpo.jokenpo.service.JokenpoService;

@RestController
public class JogadaController {

	@Autowired
	JokenpoService jokenpoService;
	
	@RequestMapping(value = "/jogar", method = RequestMethod.POST, 
			consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?>  campeao(@RequestBody JogadorDTO jogadorDTO) {
		try {
			return ResponseEntity.ok(jokenpoService.ganhador(jogadorDTO.getJogador1(), jogadorDTO.getJogador2()));
		} catch (EmpateException e) {
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}
}
