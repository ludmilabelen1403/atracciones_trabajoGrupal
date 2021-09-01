
import static org.junit.Assert.*;

public class Test {
	private Paisaje p1;
	private Paisaje p2;

	@org.junit.Test
	public void promocionTest() {
		Paisaje p1 = new Paisaje("Minas Tirith", 5, 2.5, 25);
		Paisaje p2 = new Paisaje("Abismo", 5, 2, 15);
		Paisaje[] atraccionesP = new Paisaje[2];
		atraccionesP[0] = p1;
		atraccionesP[1] = p2;
//
//	     PromocionPorcentual(atraccionesP[] atracciones)
		assertNotNull(p1.getCosto());
	}

}
