import java.util.ArrayList;



//
public abstract class Promocion extends Producto{

	
public Atraccion atraccion1;
public Atraccion atraccion2;
	


	public Promocion(double costo, tipo tipoDeAtraccion, ArrayList<Producto> listaDeProductos) {
		super(costo, tipoDeAtraccion, listaDeProductos);
		// TODO Auto-generated constructor stub
	}
	
	public Promocion() {
		
	}
	
	

	public Promocion(double costo, double tiempo, tipo tipoDeAtraccion, Atraccion atraccion1, Atraccion atraccion2) {
		super(costo, tiempo, tipoDeAtraccion);
		this.atraccion1 = atraccion1;
		this.atraccion2 = atraccion2;
	}

	public double calcularPromocion() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public double calcularTiempo() {
		return 0;
	}
