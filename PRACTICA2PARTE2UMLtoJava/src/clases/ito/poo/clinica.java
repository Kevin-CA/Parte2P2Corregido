/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/
package clases.ito.poo;

import java.time.LocalDate;
import java.time.Period;
import java.util.HashSet;


public class clinica {
	private String nombre = "";
	private String rfc = "";
	private LocalDate fechaN = null;
	private HashSet<LocalDate> fechaC = new HashSet<LocalDate>();
	private sintomas sintomas = null;
	private HashSet<String> diagnostico = new HashSet<String>();
	private HashSet<String> receta = new HashSet<String>();

	public clinica() {
		super();
	}

	public clinica(String nombre, String rfc, LocalDate fechaN, sintomas sintomas) {
		super();
		this.nombre = nombre;
		this.rfc = rfc;
		this.fechaN = fechaN;
		this.sintomas = sintomas;
	}

	public boolean aConsulta(LocalDate fecha) {
		boolean aConsulta = false;
		aConsulta = this.fechaC.add(fecha);
		return aConsulta;
	}
	
	public boolean addDiagnostico(String padecimiento) {
		boolean addDiagnostico = false;
		addDiagnostico = this.diagnostico.add(padecimiento);
		return addDiagnostico;
	}
	
	public boolean addReceta(String medicamento) {
		boolean addReceta = false;
		addReceta = this.receta.add(medicamento);
		return addReceta;
	}

	public int cEdad() {
		int cEdad = 0;
		Period edad = Period.between(this.fechaN, LocalDate.now());
		cEdad = edad.getYears();
		return cEdad;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String newNombre) {
		this.nombre = newNombre;
	}

	public String getRfc() {
		return this.rfc;
	}

	public void setRfc(String newRfc) {
		this.rfc = newRfc;
	}

	public LocalDate getFechaN() {
		return this.fechaN;
	}

	public void setFechaN(LocalDate newFechaN) {
		this.fechaN = newFechaN;
	}

	public HashSet<LocalDate> getFechaC() {
		return this.fechaC;
	}

	public sintomas getSintomas() {
		return this.sintomas;
	}

	public void setSintomas(sintomas newSintomas) {
		this.sintomas = newSintomas;
	}

	public HashSet<String> getDiagnostico() {
		return this.diagnostico;
	}

	public HashSet<String> getReceta() {
		return this.receta;
	}

	@Override
	public String toString() {
		return "Documento de: " + nombre + "\nRFC: " + rfc + "\nFecha de Nacimiento: " + fechaN
				+ "\nUltimas consultas: " + fechaC + sintomas + "\nDiagnostico: " + diagnostico
				+ "\nReceta: " + receta;
	}
	

}
