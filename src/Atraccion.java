

public class Atraccion extends Producto {

	public String nombre;
	private int cupo;
	private double tiempo;
	private double costo;
	private tipo tipoAtraccion;
	
	public Atraccion(String nombre, tipo tipoDeAtraccion, double costo, double tiempo, int cupo) {
		super(nombre);
		this.cupo = cupo;
		this.tiempo = tiempo;
		this.costo = costo;
		this.tipoAtraccion = tipoDeAtraccion;
	}
	
	public String getNombre() {
		return super.nombre;
	}
	
	public tipo getTipoDeAtraccion() {
		return this.tipoAtraccion;
	}
	
	public double getCosto() {
		return this.costo;
	}
	
	public double getTiempo() {
		return this.tiempo;
	}
	
	public double getCupo() {
		return this.cupo;
	}
	
	

}

