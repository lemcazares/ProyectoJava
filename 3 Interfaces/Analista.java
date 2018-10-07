/**

 * Esta clase define objetos con los atributos que tendrán nuestros analistas	
 * @author: Christian Sánchez Olvera

 * @version: 05/10/2018

 */


public class Analista extends Empleado implements Actividades
{
	
	  /**

     * Constructor para la clase Analista

     * @param nom nombre
     * @param sue sueldo
     * @param fun funciones
     * @param tur turno

     */
	public Analista(String nom,int sue, String fun, String hor)
	{
		super(nom, sue, fun, hor);
	}

	@Override
	public void trabajar(){
		System.out.println("Soy "+getNombre()+" y estoy trabajando como "+getfunciones());
	}

	@Override
	public void comer(){
		System.out.println("Gano "+getSueldo()+" y estoy comiendo con la plebe");
	}

	@Override
	public void tomardecision(){
		System.out.println("El " +getfunciones()+" ha decidido");
	}
}