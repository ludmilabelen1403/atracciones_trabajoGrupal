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
			sc = new Scanner(new File("atracciones.txt"));
			
			while(sc.hasNext()) {
				//leo cada linea del archivo
				String linea = sc.nextLine();
			    String datos[] = linea.split(",");
			    //creo una atracci�n a partir de la linea que leo
			    //public Atraccion(String nombre, double costo, double tiempo, int cupo,  tipo tipo) {
				//
			    String nombreDeAtraccion =datos [0];
			    double costoDeAtraccion;
			    double tiempo ;
			    int cupo;
			    String tipoAtraccion = datos[4];
			    tipo tipoDeAtraccion = null;  
			    	
			    	try {
			    		cupo = Integer.parseInt(datos[3]);
			    		costoDeAtraccion =  Double.parseDouble(datos[1]);
			    		tiempo = Double.parseDouble(datos[2]);
			    		
			    	
			    			
			    			if (tipoAtraccion.toUpperCase().equals("AVENTURA")) {
			    				tipoDeAtraccion = tipo.AVENTURA;
			    			} 
			    			else if (tipoAtraccion.toUpperCase().equals("PAISAJE")){
			    				tipoDeAtraccion = tipo.PAISAJE;
			    			}
			    			else if (tipoAtraccion.toUpperCase().equals("DEGUSTACION")){
			    				tipoDeAtraccion = tipo.DEGUSTACION;
			    			} 
			    			
			    			Atraccion a = new Atraccion(nombreDeAtraccion,costoDeAtraccion,tiempo,cupo,tipoDeAtraccion);
			    			Atracciones.add(a);
			    		
				    	
			    		
			    		
			    	} catch (NumberFormatException nfe)   {
			    		System.out.println("Error, en una de las entradas ingresadas no est� especificado un int o un double");
			    	} 
			    
			    	
					    
			 
			    
			    
			    
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("no se encontr� archivo");
		}
		return Atracciones;
	}
	
	public static void main(String[] args) {
		 LectorDeAtracciones lectorA = new LectorDeAtracciones();
		 System.out.println(lectorA.getAtracciones("atracciones.txt"));
	}
}
