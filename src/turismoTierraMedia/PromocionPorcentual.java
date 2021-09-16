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
	public void restarCupo() {
		super.atraccion1.restarCupo();
		super.atraccion2.restarCupo();
	
	}
	
	public void verificarCupos() throws Exception {
		if(this.atraccion1.tieneCupo()&& this.atraccion2.tieneCupo()) {
			cupo = this.atraccion1.cupo+this.atraccion2.cupo;
		}
		else {
			throw new Exception ("una de las atracciones no cuenta con el cupo suficiente");
		}
	}
	
	@Override
	public int getCupo() {
		return super.atraccion1.getCupo()+super.atraccion2.getCupo();
	}
	
	public void setCupo(int cupo) {
		this.cupo-=cupo;
	}

	@Override
	public double getCosto() {
		return Math.round((atraccion1.getCosto() + atraccion2.getCosto()) * (1- this.descuento)*1000d)/1000d;
	}
	
	@Override
	public double getTiempo() {
		return super.atraccion1.getTiempo()+super.atraccion2.getTiempo();
	}
}
