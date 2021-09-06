package turismoTierraMedia;

import java.util.ArrayList;
import java.util.Collections;

public class Usuario {

	private String nombre;
	private double presupuesto;
	private double tiempoDisponible;
	private tipo preferencia;
	ArrayList<Producto> productos;
	
	public Usuario(String nombre, tipo preferencia, double presupuesto, double tiempoDisponible) {
		this.nombre = nombre;
		this.presupuesto = presupuesto;
		this.tiempoDisponible = tiempoDisponible;
		this.preferencia = preferencia;
	}
	
	public String toString() {
		return this.nombre + " prefiere las atracciones del tipo " + this.preferencia + ", tiene " + this.presupuesto + " monedas disponibles y cuenta con " + this.tiempoDisponible + " horas disponibles";
	}
	
	
	
	public String getNombre() {
		return nombre;
	}

	public double getPresupuesto() {
		return presupuesto;
	}

	public double getTiempoDisponible() {
		return tiempoDisponible;
	}

	public tipo getPreferencia() {
		return this.preferencia;
	}
	
	public static ArrayList<Producto> listaDePreferencias(ArrayList<Producto> productos, tipo preferencia) {
		Collections.sort(productos, new Ofertable(preferencia));
		return productos;
	}
}
