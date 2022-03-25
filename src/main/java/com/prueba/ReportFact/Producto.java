package com.prueba.ReportFact;

public class Producto {
	// {1,"zz", "Prueba 1","12.00","12.00", "12.00"},
	private Integer cantidad;
	private String descripcion;
	private Double valorVenta;
	
	public Producto(Integer cantidad, String descripcion,
			Double valorVenta) {
		super();
		this.cantidad = cantidad;
		this.descripcion = descripcion;
		this.valorVenta = valorVenta;
	}
	
	public Producto() {
		super();
	}

	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Double getValorVenta() {
		return valorVenta;
	}
	public void setValorVenta(Double valorVenta) {
		this.valorVenta = valorVenta;
	}
	
	
}
