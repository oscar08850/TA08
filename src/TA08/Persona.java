package TA08;

public class Persona {

	// Atributos//


	private String nombre;

	private int edad;

	private String DNI;

	private String sexo = "H";

	private double peso;

	private int altura;

	
	// Constructores //
	public Persona(String DNI) {
		this.nombre = "";
		this.edad = 0;
		this.DNI = DNI;
		//this.sexo; // Se pide que se use una variable para definir por defecto el sexo.
		this.peso = 0;
		this.altura = 0;
	}

	public Persona(String nombre, int edad, String DNI, String sexo) { // Pongo el DNI porque se especifica que es la
																		// única variable que no debe inicializarse
																		// vacia.
		this.nombre = nombre;
		this.edad = edad;
		this.DNI = DNI;
		this.sexo = sexo; 
		this.peso = 0;
		this.altura = 0;
	}

	public Persona(String nombre, int edad, String DNI, String sexo, double peso, int altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.DNI = DNI;
		this.sexo = sexo; 
		this.peso = peso;
		this.altura = altura;
	}
	
	
	// Metodos //
	@Override
	public String toString() {
		String mensaje = "Nombre: "+this.nombre+"\nEdad: "+this.edad+"\nDNI: "+this.DNI+"\nSexo: "+this.sexo+"\nPeso: "+this.peso+"\nAltura: "+this.altura+"\n";
		return mensaje;
	}
	

	/*
	 * public Persona() { this.nombre = ""; this.edad = 0; }
	 * 
	 * public Persona(int edad, String nombre) { this.nombre = ""; this.edad = 0; }
	 */

}
