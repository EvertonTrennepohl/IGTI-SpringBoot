package com.trennepohl.vendas.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trennepohl.vendas.dto.ComprasDTO;
import com.trennepohl.vendas.services.ComprasService;

@RestController
@RequestMapping("/compras")
public class ComprasController {

	@Autowired
	private ComprasService comprasService;

	@GetMapping
	public ResponseEntity<List<ComprasDTO>> findAll() {
		List<ComprasDTO> lista = comprasService.findAll();
		return ResponseEntity.ok(lista);
	}
}
