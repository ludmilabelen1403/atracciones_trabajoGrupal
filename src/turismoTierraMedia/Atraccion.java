package turismoTierraMedia;


public class Atraccion extends Producto {

	public String nombre;
	private int cupo;
	private double tiempo;
	private double costo;
	private tipo tipoAtraccion;
	
	public Atraccion(String nombre, double costo, double tiempo, int cupo,  tipo tipo) {
		super(nombre);
		this.cupo = cupo;
		this.tiempo = tiempo;
		this.costo = costo;
		this.tipoAtraccion = tipo;
	}

	public Atraccion(String nombre, double costo, double tiempo, int cupo) {
		super(nombre);
		this.cupo = cupo;
		this.tiempo = tiempo;
		this.costo = costo;
	
	}
	public String getNombre() {
		return super.nombre;
	}
	
	public tipo getTipoDeAtraccion() {
		return this.tipoAtraccion;
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
		return super.nombre + "(" + this.costo + " monedas, " + this.tiempo + " horas, " + this.cupo + " lugares, tipo: " + this.tipoAtraccion + ")";
	}

	@Override
	protected boolean esPromo() {
		// TODO Auto-generated method stub
		return false;
	}
}

