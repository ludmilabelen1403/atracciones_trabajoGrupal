package turismoTierraMedia;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LectorDePromociones {
	public ArrayList<Promocion> getPromociones(String archivo) {
		ArrayList<Promocion> Promociones = new ArrayList<Promocion>();
		FileReader fr = null;
		BufferedReader br = null;
		LectorDeAtracciones lectorAtracciones = new LectorDeAtracciones();
		
		try {
			ArrayList<Atraccion> ListaDeAtracciones = lectorAtracciones.getAtracciones("atracciones.txt");
			fr = new FileReader("promociones.txt");
			br = new BufferedReader(fr);
			String linea;

			while ((linea = br.readLine()) != null) {
				String[] promocion = linea.split(",");
				int index1 = 0, index2 = 0, index3 = 0;
				String promoSubCero = corregirLetras(promocion[0]);
				String promoSubUno = corregirLetras(promocion[1]);
				String promoSubDos = corregirLetras(promocion[2]);
				String promoSubTres = corregirLetras(promocion[3]);
				tipo tipoDeAtraccion = null;

				for (int i = 0; i < ListaDeAtracciones.size(); i++) {
					if (promoSubUno.strip().equalsIgnoreCase(ListaDeAtracciones.get(i).getNombre())) {
						index1 = i;
						tipoDeAtraccion = ListaDeAtracciones.get(i).getTipoDeAtraccion();
					}
					if (promoSubDos.strip().equalsIgnoreCase(ListaDeAtracciones.get(i).getNombre())) {
						index2 = i;
						tipoDeAtraccion = ListaDeAtracciones.get(i).getTipoDeAtraccion();
					}
					if (promoSubTres.strip().equalsIgnoreCase(ListaDeAtracciones.get(i).getNombre())) {
						index3 = i;
						tipoDeAtraccion = ListaDeAtracciones.get(i).getTipoDeAtraccion();
					}
				
				}
				
				Promocion p, d;
				if (promoSubTres.matches(".*\\d.*")) {
	        		double valor = Double.parseDouble(promoSubTres);
	        		if (valor < 1) {
	        			p = new PromocionPorcentual(promoSubCero, ListaDeAtracciones.get(index1), ListaDeAtracciones.get(index2), valor);
	        			d = new PromocionPorcentual(p.getNombre(), p.getAtraccion1(), p.getAtraccion2(), valor, p.calcularPromocion(), p.calcularTiempo(), tipoDeAtraccion, Math.min(p.atraccion1.getCupo(), p.atraccion2.getCupo()));
	        		}
	        		else {
	        			p = new PromocionAbsoluta(promoSubCero, ListaDeAtracciones.get(index1), ListaDeAtracciones.get(index2), Double.parseDouble(promoSubTres));
	        			d = new PromocionAbsoluta(p.getNombre(), p.getAtraccion1(), p.getAtraccion2(), p.calcularPromocion(), p.calcularPromocion(), p.calcularTiempo(), tipoDeAtraccion, Math.min(p.atraccion1.getCupo(), p.atraccion2.getCupo()));
	        		}
	        	}
	        	else {
	        		 p = new PromocionAxB(promoSubCero, ListaDeAtracciones.get(index1), ListaDeAtracciones.get(index2), ListaDeAtracciones.get(index3));
	        		 d = new PromocionAxB(p.getNombre(), p.getAtraccion1(), p.getAtraccion2(), ListaDeAtracciones.get(index3), p.calcularPromocion(), p.calcularTiempo(), tipoDeAtraccion, Math.min(Math.min(p.atraccion1.getCupo(),p.atraccion2.getCupo()),ListaDeAtracciones.get(index3).getCupo()));
	        	}
				
				Promociones.add(d);
			}
		}
		catch (TipoAtraccionException tae){
            System.err.println(tae.getMessage());
        }
		catch (NumberFormatException nfe) {
			System.out.println("Deben ingresarse números");
		}
		catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fr != null) {
					fr.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return Promociones;
}
	
	public String corregirLetras(String palabra) {
		char aux[] = palabra.toCharArray();
		for (int i = 0; i < aux.length; i++) {
			if(i == 0) {
				palabra = String.valueOf(aux[0]).toUpperCase();
			}
			else {
				palabra += String.valueOf(aux[i]).toLowerCase();
			}
		}
		
		return palabra;
	}
		 
	public static void main(String[] args) {
		 
		LectorDePromociones lectorPromo = new LectorDePromociones();
	    ArrayList<Promocion> promociones = lectorPromo.getPromociones("promociones.txt");
	    System.out.println(promociones);
	    
	
	
	}
}
