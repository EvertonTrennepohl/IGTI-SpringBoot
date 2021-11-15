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
	private int idCliente;
	private String nomeCliente;
	private String dnCliente;
	
	@OneToMany(mappedBy = "cliente")
	private List <Compras> compras = new ArrayList<>();
	
	public Cliente (int idCliente, String nomeCliente, String dnCliente) {
		super();
		this.idCliente = idCliente;
		this.nomeCliente = nomeCliente;
		this.dnCliente = dnCliente;
	}
	
	public Cliente() {
		
	}
	
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
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
