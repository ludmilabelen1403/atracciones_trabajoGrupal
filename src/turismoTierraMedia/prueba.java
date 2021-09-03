package turismoTierraMedia;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class prueba {

	private static Object ATR1 = null;

	public static void main(String[] args) {
		
		LectorDeAtracciones lectorAtracciones = new LectorDeAtracciones();
		ArrayList<Atraccion> ListaDeAtracciones = lectorAtracciones.getAtracciones("atracciones.txt");
		ArrayList<Promocion> ListaDePromociones = new ArrayList();
		Scanner sc = null;
		try {
			sc = new Scanner(new File("promociones.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Atraccion a1;
		
		while (sc.hasNext()) {

			// leo cada linea del archivo
			String linea = sc.nextLine();
			String datos[] = linea.split(",");
			{
				// leo los datos 
				String nombreDePromocion = datos[0];
				String Atr1 = datos[1];
				String Atr2 = datos[2];
				
				
				for (Atraccion cadaAtraccion : ListaDeAtracciones) {
					if (cadaAtraccion.getNombre().equals(Atr1)) {
						 ATR1 = new Atraccion(cadaAtraccion.getNombre(), cadaAtraccion.getCosto(), cadaAtraccion.getTiempo(), cadaAtraccion.getCupo(), cadaAtraccion.getTipoDeAtraccion());
							System.out.println("este es"+ ((Atraccion) ATR1).getNombre());
					}
					 
   }
				System.out.println("este es"+ ((Atraccion) ATR1).getNombre());
   }
	}
	}
}
