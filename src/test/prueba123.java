package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import turismoTierraMedia.Atraccion;
import turismoTierraMedia.PromocionAbsoluta;
import turismoTierraMedia.PromocionAxB;
import turismoTierraMedia.PromocionPorcentual;
import turismoTierraMedia.tipo;

public class prueba123 {

	/*@Test
	public void restarCupoFunciona() {
	Atraccion at1 = new Atraccion("Moria",10,2,tipo.AVENTURA,6);
	
	
   at1.restarCupo();

	assertEquals(5, at1.getCupo());;
}*/
	@Test
	public void restarEnPromocionPorcentualFunciona() {
	Atraccion at1 = new Atraccion("Moria",10,2,tipo.AVENTURA,6);
	Atraccion at2 = new Atraccion("ejemplo",10,3,tipo.AVENTURA,7);
	
	 PromocionPorcentual promo = new PromocionPorcentual("packPromoPorcentual",at1,at2,02);
   promo.restarCupo();

	assertEquals(6, at2.getCupo());;
	assertEquals(5,at1.getCupo());
}	
	@Test
	public void restarEnPromocionAbsolutaFunciona() {
	Atraccion at1 = new Atraccion("Moria",10,2,tipo.AVENTURA,8);
	Atraccion at2 = new Atraccion("ejemplo",10,3,tipo.AVENTURA,9);
	
	 PromocionAbsoluta promo = new PromocionAbsoluta("packPromoPorcentual",at1,at2,20);
   promo.restarCupo();

	assertEquals(7, at1.getCupo());;
	assertEquals(8,at2.getCupo());
}	
	@Test
	public void restarEnPromocionAxBFunciona() {
		Atraccion at1 = new Atraccion("Moria",10,2,tipo.AVENTURA,8);
		Atraccion at2 = new Atraccion("ejemplo",10,3,tipo.AVENTURA,9);
		Atraccion atGratis = new Atraccion("Gratis",10,3,tipo.AVENTURA,10);
		 PromocionAxB promo = new PromocionAxB("packPromoAxB",at1,at2,atGratis);
	   promo.restarCupo();

		assertEquals(7, at1.getCupo());;
		assertEquals(8,at2.getCupo());
		assertEquals(9,atGratis.getCupo());
	}
	@Test
	public void elGetCupoDePromocionesFunciona() {
		Atraccion at1 = new Atraccion("Moria",10,2,tipo.AVENTURA,8);
		Atraccion at2 = new Atraccion("ejemplo",10,3,tipo.AVENTURA,9);
		Atraccion atGratis = new Atraccion("Gratis",10,3,tipo.AVENTURA,10);
		 PromocionAxB promo = new PromocionAxB("packPromoAxB",at1,at2,atGratis);
	   promo.restarCupo();
      assertEquals(24, promo.getCupo());	
}
}