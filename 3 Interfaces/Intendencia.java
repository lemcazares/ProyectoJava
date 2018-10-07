/**

 * Esta clase define objetos con los atributos que tendrán nuestros intendentes

 * @author: Christian Sánchez Olvera

 * @version: 05/10/2018

 */

public class Intendencia extends Empleado implements Actividades
{
	/**

     * Constructor para la clase Intendencia

     * @param nom nombre
     * @param sue sueldo
     * @param fun funciones
     * @param tur turno

     */

	public Intendencia(String nom,int sue, String fun, String hor)
	{
		super(nom, sue, fun, hor);
	}

	@Override
	public void trabajar(){
		System.out.println("Soy "+getNombre()+" y estoy trabajando como el de "+getfunciones());
	}

	@Override
	public void comer(){
		System.out.println("Gano "+getSueldo()+" y estoy comiendo con la comadre");
	}

	@Override
	public void tomardecision(){
		System.out.println("El de " +getfunciones()+" ha decidido");
	}
}