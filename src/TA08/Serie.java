package TA08;

public class Serie {
	// Atributos//

	private String titulo = "";

	private int numTemporadas = 3;

	private boolean entregado = false;

	private String genero = "";

	private String creador = "";

	// Constructores ///
	public Serie() {
	}

	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.creador = creador;
	}

	public Serie(String titulo, int numTemporadas, boolean entregado, String genero, String creador) {
		this.titulo = titulo;
		this.numTemporadas = numTemporadas;
		this.entregado = entregado;
		this.genero = genero;
		this.creador = creador;
	}

	@Override
	public String toString() {
		String mensaje = "Titulo: " + this.titulo + "\nNumero de temporadas: " + this.numTemporadas + "\nEntregado: "
				+ this.entregado +"\nGenero: " + this.genero +"\nCreador: " + this.creador;
		return mensaje;
	}


}
