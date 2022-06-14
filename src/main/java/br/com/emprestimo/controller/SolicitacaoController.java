package br.com.emprestimo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.emprestimo.model.Solicitacao;
import br.com.emprestimo.repository.*;

@RestController
@RequestMapping("/solicitacao")
@CrossOrigin("*")
public class SolicitacaoController {
	
	@Autowired
	private SolicitacaoRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Solicitacao>> GetAll(){
		
		return ResponseEntity.ok(repository.findAll());
		
	}

}
