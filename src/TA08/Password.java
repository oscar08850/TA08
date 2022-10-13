package TA08;

import java.util.Random;

public class Password {

	// Atributos//

	private int longitud;

	private String contraseña;

	public Password(int longitud, String contraseña) {
		this.longitud = longitud;
		this.contraseña = contraseña;
	}

	// Constructores
	public Password(int longitud) {
		this.longitud = longitud;
		this.contraseña = creaContraseña(longitud);
	}

	private String creaContraseña(int longitud) {
		int min = 33, max = 126; // valores de ascii que nos dan un buen rango de caracteres que el usuario puede
		// estar familiarizado
		String intToAscii = "";
		String contra = "";
		Random random = new Random();
		int numero = 0;
		for (int i = 0; i < longitud; i++) {
			numero = random.nextInt(max - min + 1) + min; // Parece ser que no hay un range como en phyton.
			intToAscii = Character.toString((char) numero);
			contra = contra + intToAscii;
		}

		return contra;
	}
	
	//Metodos
	
	@Override
	public String toString() {
		String mensaje = "Contraseña: "+this.contraseña+"\nLongitud: "+this.longitud+"\n";
		return mensaje;
	}
	



}
