
public class PromocionPorcentual extends Promocion {

protected double descuento;
	
	public PromocionPorcentual(String nombre, Atraccion atraccion1, Atraccion atraccion2, double descuento) {
		super(nombre, atraccion1, atraccion2);
		this.descuento = descuento;
	}
	
	@Override
	protected double calcularPromocion() {
		return (atraccion1.getCosto() + atraccion2.getCosto()) * (1- this.descuento);
	}
}
