package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import turismoTierraMedia.Atraccion;
import turismoTierraMedia.Promocion;
import turismoTierraMedia.PromocionAbsoluta;
import turismoTierraMedia.PromocionAxB;
import turismoTierraMedia.PromocionPorcentual;
import turismoTierraMedia.TipoAtraccionException;
import turismoTierraMedia.tipo;

public class PromocionTest {
	private Promocion p1;
	Atraccion a1, a2, a3, a4;
	
	@Before
	public void setUp() throws Exception {
		a1 = new Atraccion("Mordor", 25, 3, tipo.AVENTURA, 4);
		a2 = new Atraccion("Bosque Negro",3,4,tipo.AVENTURA,12);
		a3 = new Atraccion("Lothlorien",35,1, tipo.DEGUSTACION, 30);
		a4 = new Atraccion("Moria",10,2,tipo.AVENTURA,6);
		p1 = new PromocionPorcentual("Pack aventura", a2, a1, 0.2);
	}

	@Test
	public void crearPromocionPorcentual() {
		String expected = "Pack aventura : Bosque Negro y Mordor con un descuento del 20.0 % por lo que el costo total es de 22.4 monedas";
		assertEquals(expected, p1.toString());
	}
	
	@Test
	public void crearPromocionAbsoluta() {
		PromocionAbsoluta p3 = new PromocionAbsoluta("Pack aventura", a2, a1, 36);
		String expected = "Pack aventura: Bosque Negro y Mordor a 36.0 monedas totales";
		assertEquals(expected, p3.toString());
	}
	
	@Test
	public void crearPromocionAxB() {
		PromocionAxB p2 = new PromocionAxB("Pack aventura", a2, a1, a4);
		String expected = "Pack aventura: Bosque Negro y Mordor con Moria gratis";
		assertEquals(expected, p2.toString());
	}
	
	@Test (expected = TipoAtraccionException.class)
	public void crearPromocionInvalida() {
		p1 = new PromocionPorcentual("Pack aventura", a2, a3, 0.2);
	}
	
	@Test
	public void calcularTiempoPorcentualYAbsoluta() {
		double expected = 7.0;
		PromocionPorcentual p2 = new PromocionPorcentual("Pack aventura", a2, a1, 0.2);
		assertEquals(expected, p2.calcularTiempo(), 0.1);
		
		PromocionAbsoluta p3 = new PromocionAbsoluta("Pack aventura", a2, a1, 36);
		assertEquals(expected, p2.calcularTiempo(), 0.1);
	}
	
	@Test
	public void calcularTiempoAxB() {
		double expected = 9.0;
		PromocionAxB p2 = new PromocionAxB("Pack aventura", a2, a1, a4);
		assertEquals(expected, p2.calcularTiempo(), 0.1);
		
	}
}
