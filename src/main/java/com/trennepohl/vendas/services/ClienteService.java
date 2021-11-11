package com.trennepohl.vendas.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trennepohl.vendas.dto.ClienteDTO;
import com.trennepohl.vendas.entities.Cliente;
import com.trennepohl.vendas.repositories.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	public List <ClienteDTO> findAll() {
		List <Cliente> res = clienteRepository.findAll();
		return res.stream().map(c -> new ClienteDTO(c)).collect(Collectors.toList());
	}
}
