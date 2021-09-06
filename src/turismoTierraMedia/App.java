package turismoTierraMedia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class App {
	
	private List<Usuario> usuarios;
	private static ArrayList<Producto> productos = new ArrayList<Producto>();
	static App app;
	
	private static void cargaDatos(App app) {
		ArrayList<Atraccion> atracciones = new ArrayList<Atraccion>();
		ArrayList<Promocion> promociones = new ArrayList<Promocion>();
		
		LectorDeUsuarios lector = new LectorDeUsuarios();
		app.usuarios = lector.getUsuarios("usuarios.txt");
		LectorDeAtracciones lectorAtracciones = new LectorDeAtracciones();
		atracciones = lectorAtracciones.getAtracciones("atracciones.txt");
		LectorDePromociones lectorPromociones = new LectorDePromociones();
		promociones = lectorPromociones.getPromociones("promociones.txt");
		
		for (Atraccion atraccion: atracciones ) {
			app.productos.add(atraccion);
		}
		
		for (Promocion promocion: promociones) {
			app.productos.add(promocion);
		}
	}
	
	public static void main(String[] args) {
		app = new App();
		cargaDatos(app);
		
		ArrayList<Producto> itinerario = new ArrayList<Producto>();
		
		Scanner sc = new Scanner(System.in);
		String respuesta;
		
		for (Usuario usuario: app.usuarios) {
			System.out.println(usuario);
			usuario.listaDePreferencias(productos, usuario.getPreferencia());
			for (Producto producto: productos) {
				if (producto.tieneCupo()) {
					do {
						System.out.println("Desea aceptar el siguiente producto? " + producto + " Y/N");
						respuesta = sc.next();
					}	while((!respuesta.toUpperCase().equals("Y")) && (!respuesta.toUpperCase().equals("N")));
					if (respuesta.toUpperCase().equals("Y")) {			
						itinerario.add(producto);
						producto.setCupo(producto.getCupo()-1);
					}
				}
			}
			System.out.println(usuario);
			System.out.println(itinerario);
			System.out.println(productos);
		}
		System.out.println();
	}
}
	
/*Atraccion [] atracciones;
	Usuario[] usuarios;
	Promocion[] promociones;
	
	public static void main(String[] args) {
		FileReader fr = null;
	    BufferedReader br =null;
		
		// Atracciones
	    Atraccion[] atracciones = new Atraccion[10];
	    int numLineaAtraccion = 0;
	    
	    try {
	    	fr = new FileReader("atracciones.txt");
	        br = new BufferedReader(fr);
	        String linea;
	        
	        
	        while((linea=br.readLine())!=null) {
	        	String [] atraccion = linea.split(",");
	        	tipo tipoDeAtraccion = null;
	        		        	
	        	if (atraccion[4].equals("Aventura")) {
	        		tipoDeAtraccion = tipo.AVENTURA;
	        	} 
	        	else if (atraccion[4].equals("Paisaje")){
	        		tipoDeAtraccion = tipo.PAISAJE;
	        	}
	        	else if (atraccion[4].equals("Degustacion")){
	        		tipoDeAtraccion = tipo.DEGUSTACION;
	        	}
	        	
	        	Atraccion a = new Atraccion(atraccion[0], Double.parseDouble(atraccion[1]), Double.parseDouble(atraccion[2]), Integer.parseInt(atraccion[3]), tipoDeAtraccion);
	        	atracciones[numLineaAtraccion] = a;
	        	numLineaAtraccion++;
	        }
	    }
	    catch(IOException e){
	        e.printStackTrace();
	    }
	    finally{
	        try{                    
	            if( fr != null ){   
	                fr.close();     
	            }                  
	        }catch (Exception e2){ 
	            e2.printStackTrace();
	        }
	    }
	    System.out.println(Arrays.deepToString(atracciones));
	    
	    
	    //Usuarios
	    Usuario[] usuarios = new Usuario[10];
	    int numLineaUsuario = 0;
	    
	    try {
	    	fr = new FileReader("usuarios.txt");
	        br = new BufferedReader(fr);
	        String linea;
	        
	        while((linea=br.readLine())!=null) {
	        	String [] usuario = linea.split(",");
	        	
	        	tipo tipoDeAtraccion = null;
	        	
	        	if (usuario[1].equals("Aventura")) {
	        		tipoDeAtraccion = tipo.AVENTURA;
	        	} 
	        	else if (usuario[1].equals("Paisaje")){
	        		tipoDeAtraccion = tipo.PAISAJE;
	        	}
	        	else if (usuario[1].equals("Degustacion")){
	        		tipoDeAtraccion = tipo.DEGUSTACION;
	        	}
	        	
	        	Usuario u = new Usuario(usuario[0], tipoDeAtraccion, Double.parseDouble(usuario[2]), Double.parseDouble(usuario[3]));
	        	usuarios[numLineaUsuario] = u;
	        	numLineaUsuario++;
	        }
	    }
	    catch(IOException e){
	        e.printStackTrace();
	    }
	    finally{
	        try{                    
	            if( fr != null ){   
	                fr.close();     
	            }                  
	        }catch (Exception e2){ 
	            e2.printStackTrace();
	        }
	    }
	    System.out.println(Arrays.deepToString(usuarios));
	    
	    
	    //Promociones
	    ArrayList<Promocion> Promociones = new ArrayList<Promocion>();
	    
	    
	    try {
	    	fr = new FileReader("promociones.txt");
	        br = new BufferedReader(fr);
	        String linea;
	        
	        while((linea=br.readLine())!=null) {
	        	String [] promocion = linea.split(",");
	        	int index1 = 0, index2 = 0, index3 = 0;
	        	Promocion a;
	        	
	        	for (int i = 0; i < numLineaAtraccion-1; i++) {
	        		if (promocion[1].strip().equals(atracciones[i].getNombre())){
	        			index1=i;
	        		}
	        		if (promocion[2].strip().equals(atracciones[i].getNombre())){
	        			index2=i;
	        		}
	        		if (promocion[3].strip().equals(atracciones[i].getNombre())){
	        			index3=i;
	        		}
	        	}
	        	
	        	if (promocion[3].matches(".*\\d.*")) {
	        		double valor = Double.parseDouble(promocion[3]);
	        		if (valor < 1) {
	        			a = new PromocionPorcentual(promocion[0], atracciones[index1], atracciones[index2], valor);
	        		}
	        		else {
	        			a = new PromocionAbsoluta(promocion[0], atracciones[index1], atracciones[index2], Double.parseDouble(promocion[3]));
	        		}
	        	}
	        	else {
	        		a = new PromocionAxB(promocion[0], atracciones[index1], atracciones[index2], atracciones[index3]);
	        	}
	        	
	        	promociones[numLineaPromocion] = a;
	        	numLineaPromocion++;
	        }
	    }
	    catch(IOException e){
	        e.printStackTrace();
	    }
	    finally{
	        try{                    
	            if( fr != null ){   
	                fr.close();     
	            }                  
	        }catch (Exception e2){ 
	            e2.printStackTrace();
	        }
	    }
	    System.out.println(Arrays.deepToString(promociones));
	
	}
	*/



