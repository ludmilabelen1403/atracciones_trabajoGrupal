import java.util.ArrayList;

public abstract class Promocion extends Producto{
	protected String nombre;
	protected Atraccion atraccion1;
	protected Atraccion atraccion2;
	protected tipo tipoDeAtraccion;
	Atraccion [] atracciones;
	
	protected Promocion(String nombre, Atraccion atraccion1, Atraccion atraccion2) {
		super(nombre);
		this.atraccion1 = atraccion1;
		this.atraccion2 = atraccion2;
	}
	
	protected abstract double calcularPromocion();
	
	protected String getNombre() {
		return super.nombre;
	}
	
	protected Atraccion getAtraccion1() {
		return this.atraccion1;
	}
	
	protected Atraccion getAtraccion2() {
		return this.atraccion2;
	}
	
	protected abstract double calcularTiempo();
}