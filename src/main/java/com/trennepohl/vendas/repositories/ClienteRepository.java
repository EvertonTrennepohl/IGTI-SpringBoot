package com.trennepohl.vendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.trennepohl.vendas.entities.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository <Cliente, Integer> {
	
}
