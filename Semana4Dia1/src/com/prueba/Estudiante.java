package com.prueba;

public class Estudiante {
	private int codigo;
	private String nombre;
	
	//constructor por defecto
	public Estudiante(){
		
	}
	
	public Estudiante(int codigo, String nombre){
		setCodigo(codigo);
		setNombre(nombre);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
}
