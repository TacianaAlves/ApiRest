package br.com.tacy.ApiRest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tacy.ApiRest.entities.Cliente;
import br.com.tacy.ApiRest.repositories.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repository;
	
	public List<Cliente>buscarTodos(){
		return repository.findAll();
	}

	public Cliente findByCpf(String cpf) {
		return repository.findByCpf(cpf);
	}
	
	public Cliente salvar(Cliente cliente) {
		return repository.save(cliente);
	}
	public Cliente atualizar(Cliente cliente) {
		return repository.save(cliente);
	}

	public String excluir(Integer id) {
		repository.deleteById(id);
		return "Cliente excluido da base de dados!";
	}
	
}
