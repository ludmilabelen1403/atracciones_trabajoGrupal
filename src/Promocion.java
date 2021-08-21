
public class Promocion {

 
 
 public double PromocionPorcentual(Atraccion[] atracciones) {
     
	 double costoTotal = 0;
	 
	 for ( int i=0; i<atracciones.length;i++) {
		 costoTotal+= atracciones[i].getCosto();
	 }
	 
	 costoTotal-= (costoTotal*0.20);
	 return costoTotal;
}
 public double CalculaPromocionAbsoluta(Atraccion[] atracciones){
	 double costoTotal = 0;
	 for ( int i=0; i<atracciones.length;i++) {
		 costoTotal+= atracciones[i].getCosto();
	 }
	 
	 return costoTotal*0.75;
	 /*le hace un 25% de descuento al paquete total)*/
	 }


}