package turismoTierraMedia;

public abstract class Promocion extends Producto{
	protected String nombre;
	protected Atraccion atraccion1;
	protected Atraccion atraccion2;
	protected tipo tipoDeAtraccion;
	Atraccion [] atracciones;
	
	public Promocion() {
		
	}
	
	protected Promocion(String nombre, Atraccion atraccion1, Atraccion atraccion2) {
		super(nombre);
		validarPromocion(atraccion1, atraccion2);
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
	
	private void validarPromocion(Atraccion atraccion1, Atraccion atraccion2) {
		if (atraccion1.getTipoDeAtraccion() != atraccion2.getTipoDeAtraccion()) {
			throw new Error("La promoción no se puede realizar con dos tipos de atracciones diferentes)");
		}
		this.atraccion1 = atraccion1;
		this.atraccion2 = atraccion2;
		this.tipoDeAtraccion = atraccion1.getTipoDeAtraccion();
	}
}