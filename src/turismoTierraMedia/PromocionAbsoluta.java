package turismoTierraMedia;


public class PromocionAbsoluta extends Promocion {

	public double monto;
	
		
	public PromocionAbsoluta(String nombre,Atraccion atraccion1, Atraccion atraccion2, double monto) {
		super(nombre, atraccion1, atraccion2);
		this.monto = monto;
		
	}
	
	public PromocionAbsoluta(String nombre, Atraccion atraccion1, Atraccion atraccion2, double monto, double costo, double tiempo, tipo tipoDeAtraccion, int cupo) {
		super(nombre, costo, tiempo, tipoDeAtraccion, cupo);
		this.validarPromocionAbsoluta(atraccion1, atraccion2);
		
		
		this.monto = monto;
	}
	@Override
	public int getCupo() {
		return super.atraccion1.getCupo()+super.atraccion2.getCupo();
	}
	
	public void setCupo(int cupo) {
		this.cupo-=cupo;
	}
	@Override
	public void restarCupo() {
		super.atraccion1.restarCupo();
		super.atraccion2.restarCupo();
	
	}


	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
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
		return false;
	}

	@Override
	public double getCosto() {
		return this.monto;
	}
	
	@Override
	public double getTiempo() {
		return super.atraccion1.getTiempo()+super.atraccion2.getTiempo();
	}
	
	
	private void validarPromocionAbsoluta(Atraccion atraccion1, Atraccion atraccion2) {
		try {
			if (atraccion1.getTipoDeAtraccion() != atraccion2.getTipoDeAtraccion()) {
				throw new TipoDeAtraccionException ("La atracción gratis debe ser del mismo tipo que las otras atracciones");
			}
			this.atraccion1 = atraccion1;
			this.atraccion2 = atraccion2;
			this.tipoDeAtraccion = atraccion1.getTipoDeAtraccion();
		}
		catch (TipoDeAtraccionException tae){
            System.err.println(tae.getMessage());
        }
	}

	
}
	
