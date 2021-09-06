package turismoTierraMedia;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class LectorDeUsuarios {

	public ArrayList<Usuario> getUsuarios(String archivo){
			
			ArrayList<Usuario> Usuarios = new ArrayList<Usuario>();
			
			
			try {
				Scanner sc = null;
				sc = new Scanner(new File("usuarios.txt"));
				
				while(sc.hasNext()) {
					//leo cada linea del archivo
					String linea = sc.nextLine();
				    String datos[] = linea.split(",");
				    //public Usuario(String nombre, tipo preferencia, double presupuesto, double tiempoDisponible
					
				    String nombreDeUsuario =datos [0];
				   
				    String tipoDePreferencia = datos[1];
				    tipo preferencia = tipo.valueOf(tipoDePreferencia);
				    
				    double presupuesto = Double.parseDouble(datos[2]);
				    double tiempoDisponible = Double.parseDouble(datos[3]);
				    
				 
				    
				   Usuario UsuarioNuevo = new Usuario(nombreDeUsuario, preferencia, presupuesto, tiempoDisponible);
				    
				    Usuarios.add(UsuarioNuevo);
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
				System.out.println("no se encontró archivo");
			}
		return Usuarios;
	}
}
