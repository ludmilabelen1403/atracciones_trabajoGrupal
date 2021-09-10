package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import turismoTierraMedia.Atraccion;
import turismoTierraMedia.LectorDeAtracciones;

import turismoTierraMedia.tipo;

public class lectoresTest {

	@Test
	public void elLectorDeAtraccionesFunciona() {
		LectorDeAtracciones lector = new LectorDeAtracciones();
		Atraccion at1 = new Atraccion("Moria",10,2,tipo.AVENTURA,8);
		ArrayList atraccionesLista = new ArrayList();
	atraccionesLista=	lector.getAtracciones("atracciones.txt");
		assertEquals(at1, atraccionesLista.get(0));
	}

	}

	
	
