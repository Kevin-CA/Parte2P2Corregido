package app.ito.poo;

import java.time.LocalDate;

import clases.ito.poo.clinica;
import clases.ito.poo.sintomas;

public class Myapp {
	
	static void run() {
		sintomas s1 = new sintomas(40F, 169F, 65F);
		s1.aSintomas("Calentura");
		s1.aSintomas("Dolor de garganta");
		s1.aSintomas("Sin sabor");
		clinica e1 = new clinica("Oliver Bautista", "JNADIFBWIF8U27HJBA", LocalDate.of(2002, 5, 27), s1);
		System.out.println(e1);
		e1.aConsulta(LocalDate.of(2019, 8, 7));
		e1.aConsulta(LocalDate.of(2021, 5, 4));
		e1.addDiagnostico("Coronavicho");
		e1.addReceta("Paracetamol");
		System.out.println();
		System.out.println(e1);
	}

	public static void main(String[] args) {
		run();
	}

}
