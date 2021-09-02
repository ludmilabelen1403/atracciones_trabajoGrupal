package turismoTierraMedia;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class LectorDeAtracciones {
   
	public ArrayList<Atraccion> Atracciones = new ArrayList<Atraccion>();
	
	public ArrayList<Atraccion> getAtraccion() {
		return this.Atracciones;
	}
	
	public static ArrayList<Atraccion> getAtracciones(String archivo){
		ArrayList<Atraccion> Atracciones = new ArrayList<Atraccion>();
		try {
			Scanner sc = null;
			sc = new Scanner(new File(archivo));
			
			while(sc.hasNext()) {
				//leo cada linea del archivo
				String linea = sc.nextLine();
			    String datos[] = linea.split(",");
			    //creo una atracción a partir de la linea que leo
			    //public Atraccion(String nombre, double costo, double tiempo, int cupo,  tipo tipo) {
				
			    String nombreDeAtraccion =datos [0];
			    double costoDeAtraccion = Double.parseDouble(datos[1]);
			    double tiempo = Double.parseDouble(datos[2]);
			    int cupo =  Integer.parseInt(datos[3]);
			    String tipoDeAtraccion = datos[4];
			    tipo tipoAtraccion = tipo.valueOf(tipoDeAtraccion) ;
			    
			    Atraccion a = new Atraccion(nombreDeAtraccion,costoDeAtraccion,tiempo,cupo,tipoAtraccion);
			    
			    Atracciones.add(a);
			}
			} catch (FileNotFoundException e) {
		e.printStackTrace();
		System.out.println("no se encontró archivo");
			}
	
		
	
	return Atracciones;
}
	
	public static void main(String[] args) {
		LectorDeAtracciones lector = new LectorDeAtracciones();

		System.out.println(lector.getAtracciones("atracciones.txt"));
	}

	
}
