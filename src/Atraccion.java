
public class Atraccion 
{
       private tipoDeAtraccion tipoDeAtraccion;
	   private String nombreDeLaAtraccion;
	   private double costo;
       private double promedioDeTiempo;
       private int cupoDePersonasDisponibles;
       
       
      
       
       
	public Atraccion(tipoDeAtraccion tipoDeAtraccion, String nombreDeLaAtraccion, double costo, double promedioDeTiempo,
			int cupoDePersonasDisponibles) {
		super();
		this.tipoDeAtraccion = tipoDeAtraccion;
		this.nombreDeLaAtraccion = nombreDeLaAtraccion;
		this.costo = costo;
		this.promedioDeTiempo = promedioDeTiempo;
		this.cupoDePersonasDisponibles = cupoDePersonasDisponibles;
	}



	public tipoDeAtraccion getTipoDeAtraccion() {
		return tipoDeAtraccion;
	}


	public String getNombreDeLaAtraccion() {
		return nombreDeLaAtraccion;
	}



	public double getCosto() {
		return costo;
	}

 
       
        }

