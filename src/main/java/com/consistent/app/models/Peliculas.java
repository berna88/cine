package com.consistent.app.models;

public class Peliculas {
	
	private String nombre;
	private String duracion;
	private String clasificacion;
	private boolean activo = false;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDuracion() {
		return duracion;
	}
	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}
	public String getClasificacion() {
		return clasificacion;
	}
	public void setClasificacion(String clasificacion) {
		this.clasificacion = clasificacion;
	}
	public boolean isActivo() {
		return activo;
	}
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	public Peliculas(String nombre, String duracion, String clasificacion, boolean activo) {
		super();
		this.nombre = nombre;
		this.duracion = duracion;
		this.clasificacion = clasificacion;
		this.activo = activo;
	}
	
	

}
