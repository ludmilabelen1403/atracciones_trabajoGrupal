
public class Promocion {

 
 
 public double PromocionPorcentual(Atraccion[] atracciones) {
     
	 double costoTotal = 0;
	 
	 for ( int i=0; i<atracciones.length;i++) {
		 costoTotal+= atracciones[i].getCosto();
	 }
	 
	 costoTotal-= (costoTotal*0.20);
	 return costoTotal;
}
 

}