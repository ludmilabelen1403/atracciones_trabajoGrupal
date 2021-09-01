package turismoTierraMedia;



public abstract class Producto {

	protected String nombre;
	public double costo;
	public double tiempo;
	public tipo tipoDeAtraccion;

	public Producto(String nombre, double costo, double tiempo, tipo tipoDeAtraccion) {

		this.nombre = nombre;
		this.costo = costo;
		this.tiempo = tiempo;
		this.tipoDeAtraccion = tipoDeAtraccion;
	}

	public Producto(String nombre) {
		this.nombre = nombre;
	}
	
	

}
