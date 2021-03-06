package es.upm.dit.aled.lab1;

/**
 * Clase que representa una actividad física genérica.
 * @author Jose M. del Alamo
 *
 */
public class Actividad {

	/**
	 * Duración de la actividad, en minutos.
	 */
	private int duracion;
	
	/**
	 * Constructor de la clase. Inicia el estado del objeto fijando la duración de esta actividad.
	 * @param minutos Tiempo que dura esta actividad.
	 * @throws Exception Si minutos incluye un valor negativo.
	 */
	public Actividad(int minutos) throws Exception{
		if(minutos<0)
			throw new Exception("La duración del ejercicio no puede ser negativa.");
		
		duracion = minutos;
	}
	
	/**
	 * Fija la duración de esta actividad.
	 * @param nuevaDuracion La nueva duración de esta actividad, en minutos.
	 * @throws Exception Si nuevaDuracion incluye un valor negativo.
	 */
	public void setDuracion(int nuevaDuracion) throws Exception{
		if(nuevaDuracion<0)
			throw new Exception("La duración del ejercicio no puede ser negativa.");
		
		duracion = nuevaDuracion;	
	}
	
	/**
	 * Recupera la duración de esta actividad.
	 * @return La duración de esta actividad, en minutos.
	 */
	public int getDuracion(){
		return duracion;
	}
}
