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
}
