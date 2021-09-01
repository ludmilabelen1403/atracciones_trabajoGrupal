import static org.junit.Assert.*;

import org.junit.Test;

public class Tests {

	private Atraccion atraccion1;
	private Atraccion atraccion2;

	
	@Test
	public void quePuedeCrear() {
		Atraccion p1= new Atraccion("Minas Tirith",tipo.AVENTURA, 5, 2.5, 25);
		
		assertNotNull(p1);
		
		
		
	}
	
	
	
	
//	@Test
//	public void promocionTest() {
//		 atraccion1 = new Atraccion("Minas Tirith",tipo.AVENTURA, 5, 2.5, 25);
//		 atraccion2 = new Atraccion("Abismo",tipo.AVENTURA, 5, 2, 15);
//		
//		
//		 
//		 PromocionPorcentual promocionPorcentual = new PromocionPorcentual(atraccion1, atraccion2, 0.20);
//		
//		assertEquals(8, promocionPorcentual.calcularPromocion(), 0);
//		
//		
//		
//
//
//		
//
//}
}

