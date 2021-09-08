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
	
	public ArrayList<Atraccion> getAtracciones(String archivo){
		ArrayList<Atraccion> Atracciones = new ArrayList<Atraccion>();
		try {
			Scanner sc = null;
			sc = new Scanner(new File("atracciones.txt"));
			
			while(sc.hasNext()) {
				//leo cada linea del archivo
				String linea = sc.nextLine();
			    String datos[] = linea.split(",");
			    //creo una atracci�n a partir de la linea que leo
			    //public Atraccion(String nombre, double costo, double tiempo, int cupo,  tipo tipo) {
				
			    String nombreDeAtraccion =datos [0];
			    double costoDeAtraccion = Double.parseDouble(datos[1]);
			    double tiempo = Double.parseDouble(datos[2]);
			    int cupo = 0 ;
			    
			    String tipoAtraccion = datos[4];
			    tipo tipoDeAtraccion = null;
			    
			    try {
			    	 cupo =  Integer.parseInt(datos[3]);
			    
			    }catch(NumberFormatException nfe){
			    	System.out.println("El valor no es un entero");
			    }
			    
			    
			    if (tipoAtraccion.toUpperCase().equals("AVENTURA")) {
	        		tipoDeAtraccion = tipo.AVENTURA;
	        	} 
	        	else if (tipoAtraccion.toUpperCase().equals("PAISAJE")){
	        		tipoDeAtraccion = tipo.PAISAJE;
	        	}
	        	else if (tipoAtraccion.toUpperCase().equals("DEGUSTACION")){
	        		tipoDeAtraccion = tipo.DEGUSTACION;
	        	}
			    
			    Atraccion a = new Atraccion(nombreDeAtraccion,costoDeAtraccion,tiempo,tipoDeAtraccion,cupo);
			    
			    Atracciones.add(a);
			    
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("No se encontr� el archivo");
		}
		return Atracciones;
	}
	
	public static void main(String[] args) {
		 LectorDeAtracciones lectorA = new LectorDeAtracciones();
		 
//		 if(lectorA.getAtracciones(null))
		 System.out.println(lectorA.getAtracciones("atracciones.txt"));
	}
}
