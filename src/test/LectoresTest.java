package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import turismoTierraMedia.Atraccion;
import turismoTierraMedia.LectorDeAtracciones;
import turismoTierraMedia.LectorDePromociones;
import turismoTierraMedia.LectorDeUsuarios;
import turismoTierraMedia.Promocion;
import turismoTierraMedia.PromocionPorcentual;
import turismoTierraMedia.Usuario;
import turismoTierraMedia.tipo;

public class LectoresTest {

	@Test
	public void elLectorDeAtraccionesFunciona() {
		LectorDeAtracciones lector = new LectorDeAtracciones();
		Atraccion at1 = new Atraccion("Moria",10,2,tipo.AVENTURA,8);
		ArrayList atraccionesLista = new ArrayList();
		atraccionesLista=	lector.getAtracciones("atracciones.txt");
		assertEquals(at1, atraccionesLista.get(0));
	}

	@Test
	public void LectorDePromociones() {
		String expected = "Pack aventura : Bosque Negro y Mordor con un descuento del 20.0 % por lo que el costo total es de 22.4 monedas";
		
		LectorDePromociones lectorPromo = new LectorDePromociones();
	    ArrayList<Promocion> promociones = lectorPromo.getPromociones("promociones.txt");
	    assertEquals(expected, promociones.get(0).toString());
	}
	
	@Test
	public void LectorDeUsuarios() {
		String expected = "Eowyn prefiere las atracciones del tipo AVENTURA, tiene 10.0 monedas disponibles y cuenta con 8.0 horas disponibles";
		
		LectorDeUsuarios lector  =  new LectorDeUsuarios();
		ArrayList<Usuario> usuarios = lector.getUsuarios("usuarios.txt");
		assertEquals(expected, usuarios.get(0).toString());
	}
}
