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
	
}
