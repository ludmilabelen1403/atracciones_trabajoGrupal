import java.util.ArrayList;


public abstract class Producto  {
     public double costo;
     public double tiempo;
     public tipo tipoDeAtraccion;
     
	public ArrayList<Producto>ListaDeProductos = new ArrayList<Producto>();

	public Producto(double costo, double tiempo, tipo tipoDeAtraccion) {
		this.costo = costo;
		this.tiempo = tiempo;
		this.tipoDeAtraccion = tipoDeAtraccion;
		
	}

	public Producto() {
		
	}
	
	public Producto(double costo, tipo tipoDeAtraccion, ArrayList<Producto> listaDeProductos) {
	
		this.costo = costo;
		this.tipoDeAtraccion = tipoDeAtraccion;
		ListaDeProductos = listaDeProductos;
	}



}
