
import static org.junit.Assert.*;

public class Test {
	private Atraccion p1;
	private Atraccion p2;

	@org.junit.Test
	public void promocionTest() {
		p1 = new Atraccion("Minas Tirith", tipo.AVENTURA, 5, 2.5, 25);
		p2 = new Atraccion("Abismo", tipo.AVENTURA, 5, 2, 15);

		PromocionPorcentual promocionPorcentual = new PromocionPorcentual("Pack Aventura", p1, p2, 0.20);
		
		assertEquals(8, promocionPorcentual.calcularPromocion(), 0.01);
	}

}
