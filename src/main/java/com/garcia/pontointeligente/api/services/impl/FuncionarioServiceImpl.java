package com.garcia.pontointeligente.api.services.impl;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.garcia.pontointeligente.api.domains.Funcionario;
import com.garcia.pontointeligente.api.repositories.FuncionarioRepository;
import com.garcia.pontointeligente.api.services.FuncionarioService;

@Service
public class FuncionarioServiceImpl implements FuncionarioService {
	
	private static final Logger log = LoggerFactory.getLogger(FuncionarioServiceImpl.class);
	
	@Autowired
	private FuncionarioRepository repository;

	public Funcionario persistir(Funcionario funcionario) {
		log.info("Persistindo funcionário: {}", funcionario);
		return repository.save(funcionario);
	}

	public Optional<Funcionario> buscarPorCpf(String cpf) {
		log.info("Buscando Funcionário pelo CPF: {}.", cpf);
		return  Optional.ofNullable(repository.findByCpf(cpf));
	}

	public Optional<Funcionario> buscarPorEmail(String email) {
		log.info("Buscando Funcionário pelo email: {}.", email);	
		return Optional.ofNullable(repository.findByEmail(email));
	}

	public Optional<Funcionario> buscarPorId(Long id) {
		log.info("Buscando Funcionário pelo ID {}.", id);
		return repository.findById(id);
	}

}
