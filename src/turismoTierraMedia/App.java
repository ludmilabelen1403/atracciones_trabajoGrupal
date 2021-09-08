package turismoTierraMedia;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;




public class App {
	
	
	private static HashMap<String, ArrayList<Producto>>dicUsuarios = new HashMap();
	
	
	
	
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
	
	public static void main(String[] args) throws Exception {
		app = new App();
		cargaDatos(app);
		
		
		
		Scanner sc = new Scanner(System.in);
		String respuesta;
		
		for (Usuario usuario: app.usuarios) {
			
			System.out.println(usuario);
			usuario.crearItinerario();
			usuario.listaDePreferencias(productos, usuario.getPreferencia());
			for (Producto producto: productos) {
				if (producto.tieneCupo()) {
					if (usuario.getTiempoDisponible()>1 && usuario.getPresupuesto()>3) {
					do {
						System.out.println("Desea aceptar el siguiente producto? " + producto + " Y/N");
						respuesta = sc.next();
					}	while((!respuesta.toUpperCase().equals("Y")) && (!respuesta.toUpperCase().equals("N")));
					if (respuesta.toUpperCase().equals("Y")) {
						 if (usuario.getPresupuesto()< producto.getCosto()) {
				            	System.out.println("Usted no posee el dinero suficiente para comprar este producto");
						 }else if(usuario.getTiempoDisponible()<producto.getTiempo()) { 
							 System.out.println(" usted no dispone del tiempo suficiente para adquirir este producto");
						 }
					else {
						
						usuario.agregarProducto(producto);
				
						producto.restarCupo();
						
						
			            System.out.println("ha comprado el producto "+producto.getNombre()+" , "+  producto.getNombre() +" contiene ahora "+producto.getCupo()+ " lugares disponibles");		
				            	}
                            }
					}
				}
				
				
				
				}
			dicUsuarios.put(usuario.getNombre(), usuario.getItinerario() );
			
			ArrayList <String> ItinerarioFinalNombres= new ArrayList<String>();
			
			for (int i = 0; i<usuario.getItinerario().size();i++) {
				String nombre = usuario.getItinerario().get(i).getNombre();
				ItinerarioFinalNombres.add(nombre);
			}
			
			
			double GastoTotalDelUsuario = 0;
			
			for (int i = 0; i<usuario.getItinerario().size();i++) {
				
				double gasto = 0;
				gasto+= usuario.getItinerario().get(i).getCosto();
				GastoTotalDelUsuario+=gasto;
				gasto = 0;
			}
			
          double TiempoGastadoDelUsuario = 0;
			
			for (int i = 0; i<usuario.getItinerario().size();i++) {
				
				double gasto = 0;
				gasto+= usuario.getItinerario().get(i).getTiempo();
				TiempoGastadoDelUsuario+=gasto;
				gasto = 0;
			}
			System.out.println("el itinerario de "+ usuario.getNombre() +" es " + ItinerarioFinalNombres+ " gast� en total: "+ GastoTotalDelUsuario+ " monedas, y gast� "+ TiempoGastadoDelUsuario+" horas.");
			
			
		}
		System.out.println();
		System.out.println("Itinerario== " +  dicUsuarios);
	}
	
	
	}


	




