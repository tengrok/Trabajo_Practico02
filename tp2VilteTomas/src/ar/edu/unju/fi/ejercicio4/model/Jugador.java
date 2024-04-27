package ar.edu.unju.fi.ejercicio4.model;

import java.time.LocalDate;

import ar.edu.unju.fi.ejercicio4.constantes.Posicion;

public class Jugador {
	private String nombre;
	private String apellido;
	private LocalDate fechaNacimiento;
	private String nacionalidad;
	private double estatura;
	private double peso;
	private Posicion posicion;
	
	public Jugador(String nombre, String apellido, LocalDate fechaNacimiento, String nacionalidad, double estatura,
			double peso, Posicion posicion) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.nacionalidad = nacionalidad;
		this.estatura = estatura;
		this.peso = peso;
		this.posicion = posicion;
	}

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}


	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}


	public String getNacionalidad() {
		return nacionalidad;
	}


	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}


	public double getEstatura() {
		return estatura;
	}


	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}


	public Posicion getPosicion() {
		return posicion;
	}


	public void setPosicion(Posicion posicion) {
		this.posicion = posicion;
	}


	public int calcularEdad() {
		return LocalDate.now().getYear() - getFechaNacimiento().getYear();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\nNombre: ").append(getNombre());
		sb.append("\nApellido: ").append(getApellido());
		sb.append("\nFecha de Nacimiento: ").append(getFechaNacimiento());
		sb.append("\nNacionalidad: ").append(getNacionalidad());
		sb.append("\nEstatura: ").append(getEstatura());
		sb.append("\nPeso: ").append(getPeso());
		sb.append("\nPosicion: ").append(getPosicion());
		sb.append("\nEdad: ").append(calcularEdad());
		return sb.toString();
	}
	
	
	
}