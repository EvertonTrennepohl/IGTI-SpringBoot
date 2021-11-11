package com.trennepohl.vendas.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_compras")
public class Compras {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idCompra;
	private Double totalCompra;
	private LocalDate dataCompra;
	
	@ManyToOne
	@JoinColumn(name = "idCliente")
	private Cliente cliente;
	
	public Compras(long idCompra, Double totalCompra, LocalDate dataCompra) {
		this.idCompra = idCompra;
		this.totalCompra = totalCompra;
		this.dataCompra = dataCompra;
	}
	
	public Compras() {
		
	}
	
	public long getIdCompra() {
		return idCompra;
	}
	public void setIdCompra(long idCompra) {
		this.idCompra = idCompra;
	}
	public Double getTotalCompra() {
		return totalCompra;
	}
	public void setTotalCompra(Double totalCompra) {
		this.totalCompra = totalCompra;
	}
	public LocalDate getDataCompra() {
		return dataCompra;
	}
	public void setDataCompra(LocalDate dataCompra) {
		this.dataCompra = dataCompra;
	}
	
}
