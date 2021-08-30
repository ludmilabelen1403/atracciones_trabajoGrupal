package test;

import static org.junit.Assert.*;

import turismoTierraMedia.Atraccion;
import turismoTierraMedia.PromocionPorcentual;
import turismoTierraMedia.tipo;

public class Test {
	private Atraccion p1;
	private Atraccion p2;

	@org.junit.Test
	public void promocionTest() {
		p1 = new Atraccion("Minas Tirith", 5, 2.5, 25, tipo.AVENTURA);
		p2 = new Atraccion("Abismo", 5, 2, 15, tipo.AVENTURA);

		PromocionPorcentual promocionPorcentual = new PromocionPorcentual("Pack Aventura", p1, p2, 0.20);
		
		assertEquals(8, promocionPorcentual.calcularPromocion(), 0.01);
	}

}
