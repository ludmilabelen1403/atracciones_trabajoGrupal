package turismoTierraMedia;






public class App {
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
}


