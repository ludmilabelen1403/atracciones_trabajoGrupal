import java.util.ArrayList;


public abstract class Producto {
	ArrayList<Producto> productos = new ArrayList<Producto>();
	protected String nombre;
	private double costo;
	private double tiempo;
	private tipo tipoDeAtraccion;
	
	protected Producto (String nombre) {
		this.nombre = nombre;
	}
}

