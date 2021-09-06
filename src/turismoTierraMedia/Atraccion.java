package turismoTierraMedia;

import java.util.Objects;

public class Atraccion extends Producto {

	public String nombre;
	private int cupo;
	private double tiempo;
	private double costo;
	private tipo tipoAtraccion;
	
	public Atraccion(String nombre, double costo, double tiempo,  tipo tipo, int cupo) {
		super(nombre, costo, tiempo, tipo, cupo);
	}
	
	public String getNombre() {
		return super.nombre;
	}
	
	public tipo getTipoDeAtraccion() {
		return super.tipoDeAtraccion;
	}
	
	public double getCosto() {
		return super.costo;
	}
	
	public double getTiempo() {
		return super.tiempo;
	}
	
	public int getCupo() {
		return super.cupo;
	}
	
	@Override
	public String toString() {
		return super.nombre + "(" + super.costo + " monedas, " + super.tiempo + " horas, " + super.cupo + " lugares, tipo: " + super.tipoDeAtraccion+ ")";
	}

	@Override
	protected boolean esPromo() {
		return false;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(costo, cupo, nombre, tiempo, tipoAtraccion);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Atraccion other = (Atraccion) obj;
		return Double.doubleToLongBits(costo) == Double.doubleToLongBits(other.costo) && cupo == other.cupo
				&& Objects.equals(nombre, other.nombre)
				&& Double.doubleToLongBits(tiempo) == Double.doubleToLongBits(other.tiempo)
				&& tipoAtraccion == other.tipoAtraccion;
	}
}

