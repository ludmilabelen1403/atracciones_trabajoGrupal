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
ArrayList<Atraccion> ListaDeAtracciones = lectorAtracciones.getAtracciones("atracciones.txt");
		try {
			fr = new FileReader("promociones.txt");
			br = new BufferedReader(fr);
			String linea;

			while ((linea = br.readLine()) != null) {
				String[] promocion = linea.split(",");
				int index1 = 0, index2 = 0, index3 = 0;
			

				for (int i = 0; i < ListaDeAtracciones.size() - 1; i++) {
					if (promocion[1].strip().equals(ListaDeAtracciones.get(i).getNombre())) {
						index1 = i;
					}
					if (promocion[2].strip().equals(ListaDeAtracciones.get(i).getNombre())) {
						index2 = i;
					}
					if (promocion[3].strip().equals(ListaDeAtracciones.get(i).getNombre())) {
						index3 = i;
					}
				
				}
				
				Promocion p;
				if (promocion[3].matches(".*\\d.*")) {
	        		double valor = Double.parseDouble(promocion[3]);
	        		if (valor < 1) {
	        			p = new PromocionPorcentual(promocion[0], ListaDeAtracciones.get(index1), ListaDeAtracciones.get(index2), valor);
	        		
	        		}
	        		else {
	        			 p = new PromocionAbsoluta(promocion[0], ListaDeAtracciones.get(index1), ListaDeAtracciones.get(index2), Double.parseDouble(promocion[3]));
	        		}
	        	}
	        	else {
	        		 p = new PromocionAxB(promocion[0], ListaDeAtracciones.get(index1), ListaDeAtracciones.get(index2), ListaDeAtracciones.get(index3));
	        	}
			
			
					
	        			
						Promociones.add(p);
	        			
						
				}
				

				
			
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
	
		 
public static void main(String[] args) {
	 

	

	   LectorDePromociones lectorPromo = new LectorDePromociones();
	   
	  System.out.println( lectorPromo.getPromociones("Promociones.txt"));
}
}