

public class PromocionAbsoluta extends Promocion {

	public double monto;
	
	public PromocionAbsoluta() {
		
	}
		
		public PromocionAbsoluta(Atraccion atraccion1, Atraccion atraccion2, double monto) {
			this.monto = monto;
		}

	@Override
		public double calcularPromocion() {
			return this.monto;
		}

		@Override
		public double calcularTiempo() {
		return atraccion1.getPromedioDeTiempo()+atraccion2.getPromedioDeTiempo();	
		}
	

	}
	
