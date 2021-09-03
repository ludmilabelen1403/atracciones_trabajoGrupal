package turismoTierraMedia;

public class Atraccion extends Producto {

	public String nombre;
	private int cupo;
	private double tiempo;
	private double costo;
	

	public Atraccion(String nombre, double costo, double tiempo, int cupo, tipo tipoDeAtraccion) {
		super(nombre, costo, tiempo, tipoDeAtraccion);
		this.cupo = cupo;

	}



	


	public String getNombre() {
		return super.nombre;
	}

	public tipo getTipoDeAtraccion() {
		return super.tipoDeAtraccion;
	}

	public double getCosto() {
		return this.costo;
	}

	public double getTiempo() {
		return this.tiempo;
	}

	public int getCupo() {
		return this.cupo;
	}

	@Override
	public String toString() {
		return super.nombre + "(" + super.costo + " monedas, " + super.tiempo + " horas, " + this.cupo
				+ " lugares, tipo: " + super.tipoDeAtraccion + ")";
	}
}
