package turismoTierraMedia;

import java.util.Arrays;
import java.util.Objects;

public abstract class Promocion extends Producto {
	protected String nombre;
	protected Atraccion atraccion1;
	protected Atraccion atraccion2;
	protected tipo tipoDeAtraccion;
	Atraccion[] atracciones;
	protected int cupo;
	protected Atraccion atraccionGratis;

	public Promocion(String nombre, double costo, double tiempo, tipo tipoDeAtraccion, int cupo) {
		super(nombre, costo, tiempo, tipoDeAtraccion, cupo);
	}

	public Promocion(String nombre, String nombre2, Atraccion atraccion1, Atraccion atraccion2, tipo tipoDeAtraccion,
			Atraccion[] atracciones, int cupo, Atraccion atraccionGratis) {
		super(nombre);
		nombre = nombre2;
		this.atraccion1 = atraccion1;
		this.atraccion2 = atraccion2;
		this.tipoDeAtraccion = tipoDeAtraccion;
		this.atracciones = atracciones;
		this.cupo = cupo;
		this.atraccionGratis = atraccionGratis;
	}

	protected Promocion(String nombre, Atraccion atraccion1, Atraccion atraccion2) {
		super(nombre);
		validarPromocion(atraccion1, atraccion2);
	}

	protected abstract double calcularPromocion();

	@Override
	public String getNombre() {
		return super.nombre;
	}

	protected Atraccion getAtraccion1() {
		return this.atraccion1;
	}

	protected Atraccion getAtraccion2() {
		return this.atraccion2;
	}

	protected abstract double calcularTiempo();

	private void validarPromocion(Atraccion atraccion1, Atraccion atraccion2) {
		try {
			if (atraccion1.getTipoDeAtraccion() != atraccion2.getTipoDeAtraccion()) {
				throw new TipoDeAtraccionException(
						"La promoción no se puede realizar con dos tipos de atracciones diferentes");
			}

			this.atraccion1 = atraccion1;
			this.atraccion2 = atraccion2;
			this.tipoDeAtraccion = atraccion1.getTipoDeAtraccion();
		} catch (TipoDeAtraccionException tae) {
			System.err.println(tae.getMessage());
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Arrays.hashCode(atracciones);
		result = prime * result + Objects.hash(atraccion1, atraccion2, nombre, tipoDeAtraccion);
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
		Promocion other = (Promocion) obj;
		return Objects.equals(atraccion1, other.atraccion1) && Objects.equals(atraccion2, other.atraccion2)
				&& Arrays.equals(atracciones, other.atracciones) && Objects.equals(nombre, other.nombre)
				&& tipoDeAtraccion == other.tipoDeAtraccion;
	}

	public abstract void restarCupo();

	public int getCupo() {
		return cupo;
	}

	public void setCupo(int cupo) {
		this.cupo = cupo;
	}

}
