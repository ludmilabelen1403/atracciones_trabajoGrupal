package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import turismoTierraMedia.Atraccion;
import turismoTierraMedia.tipo;
import turismoTierraMedia.Usuario;

public class UsuarioTest {
	private Usuario u1;
	
	@Before
	public void setUp() throws Exception {
		u1 = new Usuario("Eowyn", tipo.AVENTURA, 10, 8);
	}

	@Test
	public void crearUsuario() {
		String expected = "Eowyn prefiere las atracciones del tipo AVENTURA, tiene 10.0 monedas disponibles y cuenta con 8.0 horas disponibles";
		assertEquals(expected, u1.toString());
	}

}
