package com.trennepohl.vendas.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_cliente")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idCliente;
	private String nomeCliente;
	private String dnCliente;
	
	@OneToMany(mappedBy = "cliente")
	private List <Compras> compras = new ArrayList<>();
	
	public Cliente (long idCliente, String nomeCliente, String dnCliente) {
		super();
		this.idCliente = idCliente;
		this.nomeCliente = nomeCliente;
		this.dnCliente = dnCliente;
	}
	
	public Cliente() {
		
	}
	
	public long getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getDnCliente() {
		return dnCliente;
	}
	public void setDnCliente(String dnCliente) {
		this.dnCliente = dnCliente;
	}

}
