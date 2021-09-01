//
public class Paisaje extends Atraccion {

	
	
	public Paisaje(String nombreDeLaAtraccion, double costo, double promedioDeTiempo, int cupoDePersonasDisponibles) {
		super(nombreDeLaAtraccion, costo, promedioDeTiempo, cupoDePersonasDisponibles);
		// TODO Auto-generated constructor stub
	}
	
	public double getCosto() {
		return super.costo;
	}
	
	protected String getNombreDeLaAtraccion() {
		return super.nombreDeLaAtraccion;
	}

	protected double getPromedioDeTiempo() {
		return super.promedioDeTiempo;
	}

	protected int getCupoDePersonasDisponibles() {
		return super.cupoDePersonasDisponibles;
	}
	
	
	// hola
	
}
