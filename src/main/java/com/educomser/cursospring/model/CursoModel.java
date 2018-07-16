package com.educomser.cursospring.model;

public class CursoModel {

	private String nombre;
	private String descripcion;
	private float precio;
	private float horas;
	
	public CursoModel() {
	}
	
	public CursoModel(String nombre, String descripcion, float precio, float horas) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.horas = horas;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return the precio
	 */
	public float getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(float precio) {
		this.precio = precio;
	}

	/**
	 * @return the horas
	 */
	public float getHoras() {
		return horas;
	}

	/**
	 * @param horas the horas to set
	 */
	public void setHoras(float horas) {
		this.horas = horas;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CursoModel [nombre=" + nombre + ", descripcion=" + descripcion + ", precio=" + precio + ", horas="
				+ horas + "]";
	}
}
