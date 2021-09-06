package turismoTierraMedia;
public class PromocionAxB extends Promocion {
	public Atraccion atraccionGratis;

	public PromocionAxB(String nombre, Atraccion atraccion1, Atraccion atraccion2, Atraccion atraccionGratis) {
		super(nombre, atraccion1, atraccion2);
		validarPromocionAxB(atraccion1,atraccionGratis);
	}
	
	public PromocionAxB(String nombre, Atraccion atraccion1, Atraccion atraccion2, Atraccion atraccionGratis, double costo, double tiempo, tipo tipoDeAtraccion, int cupo) {
		super(nombre, costo, tiempo, tipoDeAtraccion, cupo);
		this.atraccion1 = atraccion1;
		this.atraccion2 = atraccion2;
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
	
	private void validarPromocionAxB(Atraccion atraccion1, Atraccion atraccionGratis) {
		if (atraccion1.getTipoDeAtraccion() != atraccionGratis.getTipoDeAtraccion()) {
			throw new Error("La atracción gratis debe ser del mismo tipo de las otras atracciones");
		}
		this.atraccionGratis = atraccionGratis;
	}

	@Override
	protected boolean esPromo() {
		return false;
	}
}
