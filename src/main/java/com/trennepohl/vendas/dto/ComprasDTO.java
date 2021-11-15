package com.trennepohl.vendas.dto;

import java.time.LocalDate;
import com.trennepohl.vendas.entities.Compras;

public class ComprasDTO {
	
	private int idCompra;
	private Double totalCompra;
	private LocalDate dataCompra;
	
	public ComprasDTO (Compras entidade) {
		this.idCompra = entidade.getIdCompra();
		this.totalCompra = entidade.getTotalCompra();
		this.dataCompra = entidade.getDataCompra();
	}		
	
	public ComprasDTO (int idCompra, Double totalCompra, LocalDate dataCompra) {
		this.idCompra = idCompra;
		this.totalCompra = totalCompra;
		this.dataCompra = dataCompra;
	}
	public int getIdCompra() {
		return idCompra;
	}
	public void setIdCompra(int idCompra) {
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

