package br.com.tacy.ApiRest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tacy.ApiRest.entities.Cliente;
import br.com.tacy.ApiRest.services.ClienteService;

@RestController
@RequestMapping("/api/v1/clientes")
public class CadastroClienteController  {
	
	@Autowired
	private ClienteService service;
	
	
	@GetMapping
	public ResponseEntity<List<Cliente>> buscarTodosClientes(){
		List<Cliente> todos = service.buscarTodos();
		return ResponseEntity.status(HttpStatus.OK).body(todos);		
	}

}
