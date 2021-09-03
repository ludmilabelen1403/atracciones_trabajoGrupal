package turismoTierraMedia;


public class PromocionAbsoluta extends Promocion {

	public double monto;
	
	public PromocionAbsoluta(String nombre, Atraccion atraccion1, Atraccion atraccion2) {
		super( nombre, atraccion1, atraccion2);
	}
		
	public PromocionAbsoluta(String nombre,Atraccion atraccion1, Atraccion atraccion2, double monto) {
		super(nombre, atraccion1, atraccion2);
		this.monto = monto;
	}

	public PromocionAbsoluta(String string, double costo, double tiempo, tipo tipoDeAtraccion) {
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public double calcularPromocion() {
		return this.monto;
	}

	@Override
	public double calcularTiempo() {
	return atraccion1.getTiempo()+atraccion2.getTiempo();	
	}
		
	@Override
	public String toString() {
		return super.getNombre() + ": " + super.getAtraccion1().getNombre() + " y " + super.getAtraccion2().getNombre() + " a " + this.monto + " monedas totales";
	}

	@Override
	protected boolean esPromo() {
		// TODO Auto-generated method stub
		return false;
	}
}
	
