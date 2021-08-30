public class Atraccion extends Producto {

	private String nombreDeLaAtraccion;
	
	private int cupoDePersonasDisponibles;
  
	public Atraccion(String nombreDeLaAtraccion, tipo tipoDeAtraccion, double costo, double tiempo, int cupoDePersonasDisponibles) {
		super(costo, tiempo, tipoDeAtraccion);
		this.nombreDeLaAtraccion = nombreDeLaAtraccion;
	
		this.cupoDePersonasDisponibles = cupoDePersonasDisponibles;
		
	}
	
	public Atraccion(){
		
	}

	public String getNombreDeLaAtraccion() {
		return nombreDeLaAtraccion;
	}

	public double getCosto() {
		return costo;
	}

	public double getPromedioDeTiempo() {
		return tiempo;
	}

	public int getCupoDePersonasDisponibles() {
		return cupoDePersonasDisponibles;
	}
	
	public tipo getTipoDeAtraccion() {
		return tipoDeAtraccion;
	}

}

