package turismoTierraMedia;

public class PromocionPorcentual extends Promocion {

protected double descuento;
	
	public PromocionPorcentual(String nombre, Atraccion atraccion1, Atraccion atraccion2, double descuento) {
		super(nombre, atraccion1, atraccion2);
		this.descuento = descuento;
	}
	
	public PromocionPorcentual(String nombre,Atraccion atraccion1, Atraccion atraccion2, double descuento, double costo, double tiempo, tipo tipoDeAtraccion, int cupo) {
		super(nombre, costo, tiempo, tipoDeAtraccion, cupo);
		this.atraccion1 = atraccion1;
		this.atraccion2 = atraccion2;
		this.descuento = descuento;
	}
	

	@Override
	public double calcularPromocion() {
		return Math.round((atraccion1.getCosto() + atraccion2.getCosto()) * (1- this.descuento)*1000d)/1000d;
	}

	@Override
	public double calcularTiempo() {
		return atraccion1.getTiempo() + atraccion2.getTiempo();
	}
	
	@Override
	public String toString() {
		return super.getNombre() + " : " + super.getAtraccion1().getNombre() + " y " + super.getAtraccion2().getNombre() + " con un descuento del " + this.descuento * 100 + " %"+" por lo que el costo total es de "+ this.calcularPromocion() + " monedas";
	}

	@Override
	protected boolean esPromo() {
		return false;
	}
}
