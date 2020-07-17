package com.yapo.entities;

public class DatosCrearCuenta {
	String Genero;
	String Region;
	String Comuna;
	String Celu;
	String Mail;
	String Pass;	
	String Nombre;
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getGenero() {
		return Genero;
	}
	public void setGenero(String genero) {
		Genero = genero;
	}
	public String getRegion() {
		return Region;
	}
	public void setRegion(String region) {
		Region = region;
	}
	public String getComuna() {
		return Comuna;
	}
	public void setComuna(String comuna) {
		Comuna = comuna;
	}
	public String getCelu() {
		return Celu;
	}
	public void setCelu(String celu) {
		Celu = celu;
	}
	public String getMail() {
		return Mail;
	}
	public void setMail(String mail) {
		Mail = mail;
	}
	public String getPass() {
		return Pass;
	}
	public void setPass(String pass) {
		Pass = pass;
	}

}
