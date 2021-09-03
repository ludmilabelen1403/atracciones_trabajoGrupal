package turismoTierraMedia;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class LectorPromo {

	public static ArrayList<Promocion> getPromociones(String archivo) {
		ArrayList<Atraccion> Atracciones = new ArrayList<Atraccion>();

		LectorDeAtracciones lectorAtracciones = new LectorDeAtracciones();
		ArrayList<Atraccion> ListaDeAtracciones = lectorAtracciones.getAtracciones("atracciones.txt");
		ArrayList<Promocion> ListaDePromociones = new ArrayList();
		Scanner sc = new Scanner(new File("promociones.txt"));

		while (sc.hasNext()) {

			// leo cada linea del archivo
			String linea = sc.nextLine();
			String datos[] = linea.split(",");
			{
				// leo los datos para luego comparar con las atracciones

				String nombreDePromocion = datos[0];
				String Atr1 = datos[1];
				String Atr2 = datos[2];
				double precio = Double.parseDouble(datos[3]);

				// comienzo a comparar los datos generados con mi arrayList de Atracciones

				for (Atraccion cadaAtraccion : ListaDeAtracciones) {
					if (cadaAtraccion.getNombre().equals(Atr1)) {
						Atraccion a1 = cadaAtraccion;
					}

				}

			}

		}
	}

	public static void main(String[] args) {
		LectorDeAtracciones lectorAtracciones = new LectorDeAtracciones();
		ArrayList<Atraccion> ListaDeAtracciones = lectorAtracciones.getAtracciones("atracciones.txt");
		ArrayList<Promocion> ListaDePromociones = new ArrayList();
		Scanner sc = new Scanner(new File("promociones.txt"));
		Atraccion a1;
		
		while (sc.hasNext()) {

			// leo cada linea del archivo
			String linea = sc.nextLine();
			String datos[] = linea.split(",");
			{
				// leo los datos para luego comparar con las atracciones

				String nombreDePromocion = datos[0];
				String Atr1 = datos[1];
				String Atr2 = datos[2];
				double precio = Double.parseDouble(datos[3]);

				// comienzo a comparar los datos generados con mi arrayList de Atracciones

				for (Atraccion cadaAtraccion : ListaDeAtracciones) {
					if (cadaAtraccion.getNombre().equals(Atr1)) {
						 a1 = new Atraccion(cadaAtraccion.getNombre(), cadaAtraccion.getCosto(), cadaAtraccion.getTiempo(), cadaAtraccion.getCupo(), cadaAtraccion.getTipoDeAtraccion());
						 System.out.println(a1);
					}
				}
			}
		}
		
	}
}