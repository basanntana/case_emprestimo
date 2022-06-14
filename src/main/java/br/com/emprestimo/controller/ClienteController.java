package br.com.emprestimo.controller;


import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.emprestimo.model.Cliente;



@RestController
@RequestMapping("/cliente")
public class ClienteController {

	
	@PostMapping("/salvar")
    private ResponseEntity<String> salvar(@RequestBody @Valid Cliente cliente) {
        return ResponseEntity.ok("Cliente é valido" + cliente.toString());
    }
	
	

	
}