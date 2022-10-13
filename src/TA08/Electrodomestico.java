package TA08;

import TA08.Color;
import TA08.ConsumoElectrico;

public class Electrodomestico {
	// Atributos//

	private double precioBase = 100;

	private String color = "Blanco";

	private String consumoEnergetico = "F";

	private double peso = 5;

	// Constructores ///
	public Electrodomestico() {
	}

	public Electrodomestico(double precioBase, double peso) {
		this.precioBase = precioBase;
		this.peso = peso;
	}

	public Electrodomestico(double precioBase, String color, String consumoEnergetico, double peso) {
		this.precioBase = precioBase;
		this.color = validaColor(color);
		this.consumoEnergetico = validaConsumo(consumoEnergetico);
		this.peso = peso;
	}

	private String validaConsumo(String consumoEnergetico) {
		if (consumoEnergetico.equals(ConsumoElectrico.A.toString())) {
			return ConsumoElectrico.A.toString();
		}

		else if (consumoEnergetico.equals(ConsumoElectrico.B.toString())) {
			return consumoEnergetico;
		} else if (consumoEnergetico.equals(ConsumoElectrico.C.toString())) {
			return consumoEnergetico;
		} else if (consumoEnergetico.equals(ConsumoElectrico.D.toString())) {
			return consumoEnergetico;
		} else if (consumoEnergetico.equals(ConsumoElectrico.E.toString())) {
			return consumoEnergetico;
		} else if (consumoEnergetico.equals(ConsumoElectrico.F.toString())) {
			return consumoEnergetico;
		} else
			return "F";
	}

	private String validaColor(String color) {
		if (color.equals(Color.Azul.toString())) {

			return color;
		} else if (color.equals(Color.Blanco.toString())) {
			return color;
		} else if (color.equals(Color.Gris.toString())) {
			return color;
		} else if (color.equals(Color.Negro.toString())) {
			return color;
		} else if (color.equals(Color.Rojo.toString())) {
			return color;
		} else {
			return "Blanco";
		}

	}
	
	@Override
	public String toString() {
		String mensaje = "Precio base: "+this.precioBase+"\nColor: "+this.color+"\nConsumo Electrico: "+this.consumoEnergetico+"\nPeso: "+this.peso+"\n";
		return mensaje;
	}

	// Constructores

}
