package com.garcia.pontointeligente.api.services.impl;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.garcia.pontointeligente.api.domains.Empresa;
import com.garcia.pontointeligente.api.repositories.EmpresaRepository;
import com.garcia.pontointeligente.api.services.EmpresaService;

@Service
public class EmpresaServiceImpl implements EmpresaService{

	private static final Logger log = LoggerFactory.getLogger(EmpresaServiceImpl.class);
	
	@Autowired
	private EmpresaRepository repository;
		
	@Override
	public Optional<Empresa> buscarPorCnpj(String cnpj) {
		log.info("Buscando empresa pelo CNPJ {}", cnpj);	
		return Optional.ofNullable(repository.findByCnpj(cnpj));
	}

	@Override
	public Empresa persistir(Empresa empresa) {
		log.info("Persistindo a empresa: {}.", empresa);
		return repository.save(empresa);
	}

}
