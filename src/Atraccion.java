public abstract class Atraccion {

	protected String nombreDeLaAtraccion;
	protected double costo;
	protected double promedioDeTiempo;
	protected int cupoDePersonasDisponibles;

	public Atraccion(String nombreDeLaAtraccion, double costo, double promedioDeTiempo, int cupoDePersonasDisponibles) {
		
		this.nombreDeLaAtraccion = nombreDeLaAtraccion;
		this.costo = costo;
		this.promedioDeTiempo = promedioDeTiempo;
		this.cupoDePersonasDisponibles = cupoDePersonasDisponibles;
	}

	protected String getNombreDeLaAtraccion() {
		return nombreDeLaAtraccion;
	}

	protected double getCosto() {
		return costo;
	}

	protected double getPromedioDeTiempo() {
		return promedioDeTiempo;
	}

	protected int getCupoDePersonasDisponibles() {
		return cupoDePersonasDisponibles;
	}

}

