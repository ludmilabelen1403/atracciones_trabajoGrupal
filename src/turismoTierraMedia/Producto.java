package turismoTierraMedia;
import java.util.ArrayList;


public abstract class Producto {
	
	protected String nombre;
	public double costo;
	public double tiempo;
	public tipo tipoDeAtraccion;
	
	public Producto(String nombre, double costo, double tiempo, tipo tipoDeAtraccion) {
		super();
		this.nombre = nombre;
		this.costo = costo;
		this.tiempo = tiempo;
		this.tipoDeAtraccion = tipoDeAtraccion;
	}
	
	
	
	
	
}

