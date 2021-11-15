package com.trennepohl.vendas.dto;

import com.trennepohl.vendas.entities.Cliente;

public class ClienteDTO {
	private int idCliente;
	private String nomeCliente;
	private String dnCliente;
	
	public ClienteDTO (Cliente entidade) {
		this.idCliente = entidade.getIdCliente();
		this.nomeCliente = entidade.getNomeCliente();
		this.dnCliente = entidade.getDnCliente();
	}
	
	public ClienteDTO (int idCliente, String nomeCliente, String dnCliente) {
		this.idCliente = idCliente;
		this.nomeCliente = nomeCliente;
		this.dnCliente = dnCliente;
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
