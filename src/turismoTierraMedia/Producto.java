package turismoTierraMedia;
import java.util.ArrayList;


public abstract class Producto {
	ArrayList<Producto> productos = new ArrayList<Producto>();
	protected String nombre;
	protected double costo;
	protected double tiempo;
	tipo tipoDeAtraccion;
	
	protected Producto (String nombre) {
		this.nombre = nombre;
	}
	
	public  Producto() {
		
	}

	protected abstract boolean esPromo();
	
	
}

