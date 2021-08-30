package turismoTierraMedia;

public class PromocionPorcentual extends Promocion {

protected double descuento;
	
	public PromocionPorcentual(String nombre, Atraccion atraccion1, Atraccion atraccion2, double descuento) {
		super(nombre, atraccion1, atraccion2);
		this.descuento = descuento;
	}
	
	@Override
	public double calcularPromocion() {
		return (atraccion1.getCosto() + atraccion2.getCosto()) * (1- this.descuento);
	}

	@Override
	public double calcularTiempo() {
		return atraccion1.getTiempo() + atraccion2.getTiempo();
	}
	
	@Override
	public String toString() {
		return super.getNombre() + " : " + super.getAtraccion1().getNombre() + " y " + super.getAtraccion2().getNombre() + " con un descuento del " + this.descuento + " %";
	}
}
