public class PromocionAxB extends Promocion {
	public Atraccion atraccionGratis;

	public PromocionAxB(Atraccion atraccion1, Atraccion atraccion2, Atraccion atraccionGratis) {
		super();
		this.atraccionGratis = atraccionGratis;
		
	}

	@Override
	public double calcularPromocion() {
		return atraccion1.getCosto() + atraccion2.getCosto();
		
	}
	
	public double calcularTiempo() {
		return atraccion1.getPromedioDeTiempo() + atraccion2.getPromedioDeTiempo()+atraccionGratis.getPromedioDeTiempo();
	}
	
}
