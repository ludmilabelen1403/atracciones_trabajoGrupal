package turismoTierraMedia;
public class PromocionAxB extends Promocion {
	

	
	
	

	public PromocionAxB(String nombre, Atraccion atraccion1, Atraccion atraccion2, Atraccion atraccionGratis) {
		super(nombre, atraccion1, atraccion2);
		this.atraccionGratis=atraccionGratis;
		validarPromocionAxB(atraccion1,atraccion2 ,atraccionGratis);
	}

	
	public PromocionAxB(String nombre, Atraccion atraccion1, Atraccion atraccion2, Atraccion atraccionGratis, double costo, double tiempo, tipo tipoDeAtraccion, int cupo) {
		super(nombre, costo, tiempo, tipoDeAtraccion, cupo);
		super.atraccion1 = atraccion1;
		super.atraccion2 = atraccion2;
		super.atraccionGratis = atraccionGratis;
	}

	@Override
		public void  restarCupo() {
			super.atraccion1.restarCupo();
			super.atraccion2.restarCupo();
			super.atraccionGratis.restarCupo();
	   }
		
	public void setCupo(int cupo) {
		this.cupo-=cupo;
	}
	@Override
	public int getCupo() {
		return super.atraccion1.getCupo()+super.atraccion2.getCupo()+super.atraccionGratis.getCupo();
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
	
	private void validarPromocionAxB(Atraccion atraccion1, Atraccion atraccion2, Atraccion atraccionGratis) {
		try {
			if (atraccion1.getTipoDeAtraccion() != atraccion2.getTipoDeAtraccion() && atraccionGratis.getTipoDeAtraccion() != atraccion1.getTipoDeAtraccion()) {
				throw new TipoDeAtraccionException ("La atracción gratis debe ser del mismo tipo que las otras atracciones");
			}
			this.atraccionGratis = atraccionGratis;
		}
		catch (TipoDeAtraccionException tae){
            System.err.println(tae.getMessage());
        }
	}

	@Override
	protected boolean esPromo() {
		return false;
	}


	@Override
	public double getCosto() {
		
		return super.atraccion1.getCosto()+super.atraccion2.getCosto();
	}
	@Override
	public double getTiempo() {
		return super.atraccion1.getTiempo()+super.atraccion2.getTiempo()+ super.atraccionGratis.getTiempo();
	}
}
