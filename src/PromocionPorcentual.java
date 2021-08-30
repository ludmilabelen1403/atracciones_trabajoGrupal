import java.util.ArrayList;

public class PromocionPorcentual extends Promocion {

	public double descuento ;
	

	public PromocionPorcentual(double costo, tipo tipoDeAtraccion, ArrayList<Producto> listaDeProductos,
			double descuento) {
		super(costo, tipoDeAtraccion, listaDeProductos);
		this.descuento = descuento;
	}

	public PromocionPorcentual(Atraccion atraccion1,Atraccion atraccion2,double descuento) {
		
	}

	
	@Override
	public double calcularPromocion() {
		return (atraccion1.getCosto() + atraccion2.getCosto()) * (1- this.descuento);
	}
	@Override
	public double calcularTiempo() {
		return atraccion1.getPromedioDeTiempo()+atraccion2.getPromedioDeTiempo();	
		}
	

}
