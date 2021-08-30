package turismoTierraMedia;
public class PromocionAxB extends Promocion {
	public Atraccion atraccionGratis;

	public PromocionAxB(String nombre, Atraccion atraccion1, Atraccion atraccion2, Atraccion atraccionGratis) {
		super(nombre, atraccion1, atraccion2);
		this.atraccionGratis = atraccionGratis;
		
	}

	@Override
	public double calcularPromocion() {
		return atraccion1.getCosto() + atraccion2.getCosto();
		
	}
	
	public double calcularTiempo() {
		return atraccion1.getTiempo() + atraccion2.getTiempo()+atraccionGratis.getTiempo();
	}
	
	@Override
	public String toString() {
		return super.getNombre() + ": " + super.getAtraccion1().getNombre() + " y " + super.getAtraccion2().getNombre() + " con " + this.atraccionGratis.getNombre() + " gratis";
	}
}
