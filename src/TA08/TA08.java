package TA08;

import java.util.Scanner;

public class TA08 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int menu = 0;
		while (true) {

			System.out.println("Elige ejercicio:");
			System.out.println("1. Clase Persona");
			System.out.println("2. Clase Contraseña");
			System.out.println("3. Clase Electrodomestico");
			System.out.println("4. Clase Serie\n");
			menu = scanner.nextInt();
			int menu2 = 0;

			switch (menu) {
			case 1: // Clase Persona
				System.out.println("Has entrado en el ejercicio PERSONA.");
				System.out.println("1. Constructor por defecto (solo DNI)");
				System.out.println("2. Constructor nombre edad y sexo (se incluye DNI tambien)");
				System.out.println("3. Constructor con todos los atributos: ");
				menu2 = scanner.nextInt();
				switch (menu2) {
				case 1: // Constructor por defecto (solo DNI)
					System.out.print("Introduce un DNI: ");
					String dni = scanner.next();
					Persona persona1 = new Persona(dni);
					System.out.println(persona1.toString());
					break;
				case 2: // Constructor nombre edad y sexo (se incluye DNI tambien)
					System.out.print("Introduce un nombre: ");
					String nombre2 = scanner.next();
					System.out.print("Introduce una edad: ");
					int edad2 = scanner.nextInt();
					System.out.print("Introduce un DNI: ");
					String dni2 = scanner.next();
					System.out.print("Introduce un sexo 'H' o 'M': ");
					String sexo2 = scanner.next();
					Persona persona2 = new Persona(nombre2, edad2, dni2, sexo2);
					System.out.println(persona2.toString());
					break;
				case 3:
					System.out.print("Introduce un nombre: ");
					String nombre3 = scanner.next();
					System.out.print("Introduce una edad: ");
					int edad3 = scanner.nextInt();
					System.out.print("Introduce un DNI: ");
					String dni3 = scanner.next();
					System.out.print("Introduce un sexo 'H' o 'M': ");
					String sexo3 = scanner.next();
					System.out.print("Introduce un peso: ");
					double peso3 = scanner.nextDouble();
					System.out.print("Introduce una altura: ");
					int altura3 = scanner.nextInt();
					Persona persona3 = new Persona(nombre3, edad3, dni3, sexo3, peso3, altura3);
					System.out.println(persona3.toString());
					break;
				default:
					break;
				}

				break;
			case 2: // Clase Contraseña
				System.out.println("Has entrado en el ejercicio CONTRASEÑA.");
				System.out.println("1. Constructor por defecto");
				System.out.println("2. Constructor genera contraseña a partir de longitud pasada.");
				menu2 = scanner.nextInt();
				int longitud = 0;
				String contraseña = "";
				switch (menu2) {
				case 1: // Constructor por defecto
					System.out.print("Introduce una contraseña: ");
					contraseña = scanner.next();
					Password password = new Password(contraseña.length(), contraseña);
					System.out.println(password.toString());
					break;
				case 2: // Constructor genera contraseña a partir de longitud pasada.
					System.out.print("Introduce una longitud: ");
					longitud = scanner.nextInt();
					Password password2 = new Password(longitud);
					System.out.println(password2.toString());
					break;

				default:
					break;
				}

				break;

			case 3:
				System.out.println("Has entrado en el ejercicio ELECTRODOMESTICO.");
				System.out.println("1. Constructor por defecto");
				System.out.println("2. Constructor con precio y peso. El resto por defecto");
				System.out.println("3. Constructor con todos los atributos");
				menu2 = scanner.nextInt();
				double precioElectrodomestico, peso;
				String colorElectrodomestico, consumoElectrico;
				switch (menu2) {
				case 1:
					Electrodomestico electrodomestico1 = new Electrodomestico();
					System.out.println(electrodomestico1.toString());
					break;
				case 2:
					System.out.print("Dame Precio: ");
					precioElectrodomestico = scanner.nextDouble();
					System.out.print("Dame Peso: ");
					peso = scanner.nextDouble();
					Electrodomestico electrodomestico2 = new Electrodomestico(precioElectrodomestico, peso);
					System.out.println(electrodomestico2.toString());
					break;
				case 3:
					System.out.print("Dame Precio: ");
					precioElectrodomestico = scanner.nextDouble();
					System.out.print("Dame Peso: ");
					peso = scanner.nextDouble();
					System.out.print("Dame Color: ");
					colorElectrodomestico = scanner.next();
					System.out.print("Dame Consumo electrico: ");
					consumoElectrico = scanner.next();
					Electrodomestico electrodomestico3 = new Electrodomestico(precioElectrodomestico,
							colorElectrodomestico, consumoElectrico, peso);
					System.out.println(electrodomestico3.toString());
					break;
				default:
					break;
				}
				break;

			case 4: // Clase serie
				System.out.println("Has entrado en el ejercicio SERIE.");
				System.out.println("1. Constructor por defecto");
				System.out.println("2. Constructor con titulo y creador. El resto por defecto");
				System.out.println("3. Constructor con todos los atributos");
				menu2 = scanner.nextInt();
				int numTemporada;
				String tituloSerie, creadorSerie, generoSerie, booleanoEntregado;
				switch (menu2) {
				case 1:
					Serie serie1 = new Serie();
					System.out.println(serie1.toString());
					break;
				case 2:
					System.out.print("Dame titulo serie: ");
					tituloSerie = scanner.next();
					System.out.print("Dame creador de la serie: ");
					creadorSerie = scanner.next();
					Serie serie2 = new Serie(tituloSerie, creadorSerie);
					System.out.println(serie2.toString());
					break;
				case 3:
					System.out.print("Dame titulo serie: ");
					tituloSerie = scanner.next();
					System.out.print("Dame numero temporada: ");
					numTemporada = scanner.nextInt();
					System.out.print("Dame genero serie: ");
					generoSerie = scanner.next();
					System.out.print("Dame creador de la serie: ");
					creadorSerie = scanner.next();
					Serie serie3 = new Serie(tituloSerie, numTemporada, false, generoSerie, creadorSerie);
					System.out.println(serie3.toString());
					break;
				default:
					break;
				}

			default:
				break;
			}
		}
	}

}
