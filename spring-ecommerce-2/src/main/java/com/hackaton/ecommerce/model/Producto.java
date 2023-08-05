package com.hackaton.ecommerce.model;

import java.io.Serializable;
import javax.persistence.*;

@Entity 
@Table(name="productos")
public class Producto  implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer productoId;
	
	@Column(unique=true, nullable=false)
	private String nombre;
	
	@Column
	private String imagen;
	
	@Column
	private Float precio;
	 
	public Producto() {
	}

	public Producto(Integer productoId, String nombre, String imagen, Float precio) {
		super();
		this.productoId = productoId;
		this.nombre = nombre;
		this.imagen = imagen;
		this.precio = precio;
	}

	public Integer getProductoId() {
		return productoId;
	}

	public void setProductoId(Integer productoId) {
		this.productoId = productoId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public Float getPrecio() {
		return precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}

	
	
	
	
	
}
