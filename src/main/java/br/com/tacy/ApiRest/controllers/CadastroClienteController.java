package br.com.tacy.ApiRest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	@GetMapping("/{cpf}")
	public ResponseEntity<Cliente> buscarClienteCpf(@PathVariable("cpf") String cpf){
		return ResponseEntity.status(HttpStatus.OK).body(service.findByCpf(cpf));
		
	}
	@PostMapping
	public ResponseEntity<Cliente> criarCliente(@RequestBody Cliente cliente){
		return ResponseEntity.status(HttpStatus.CREATED).body(service.salvar(cliente));
	}
	@PutMapping("/{id}")
	public ResponseEntity<Cliente> atualizarCliente(@PathVariable("id")Integer id, @RequestBody Cliente cliente){
		cliente.setId(id);
		return ResponseEntity.status(HttpStatus.OK).body(service.atualizar(cliente));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String>excluirCliente(@PathVariable("id") Integer id){
		return ResponseEntity.status(HttpStatus.OK).body(service.excluir(id));
	}
}
