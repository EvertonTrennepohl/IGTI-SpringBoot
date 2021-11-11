package com.trennepohl.vendas.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_vendedor")
public class Vendedor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idVendedor;
	private String nomeVendedor;
	
	public Vendedor(long idVendedor, String nomeVendedor) {
		this.idVendedor = idVendedor;
		this.nomeVendedor = nomeVendedor;
	}
	
	public Vendedor() {
		
	}
	
	public long getIdVendedor() {
		return idVendedor;
	}
	public void setIdVendedor(long idVendedor) {
		this.idVendedor = idVendedor;
	}
	public String getNomeVendedor() {
		return nomeVendedor;
	}
	public void setNomeVendedor(String nomeVendedor) {
		this.nomeVendedor = nomeVendedor;
	}

}
