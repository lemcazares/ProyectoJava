/**

 * Esta clase define objetos con los atributos que tendrán nuestros empleados

 * @author: Christian Sánchez Olvera

 * @version: 05/10/2018

 */

public class Empleado
{
	private String nombre;
	private int sueldo;
	private String funciones;
	private String turno;

	  /**

     * Constructor para la clase Empleados

     * @param nombre nombre
     * @param sueldo sueldo
     * @param funciones funciones
     * @param turno turno

     */
	public Empleado (String nombre, int sueldo, String funciones, String turno)

	{
		this.nombre = nombre;
		this.sueldo = sueldo;
		this.funciones = funciones;
		this.turno = turno;
	}

	/**

     * Método que devuelve el atributo nombre

     * @return El atributo "nombre"

     */

	public String getNombre(){
	return nombre;
	}


	/**

     * Método que devuelve el atributo sueldo

     * @return El atributo "sueldo"

     */

	public int getSueldo(){
	return sueldo;
	}

	/**

     * Método que devuelve el atributo funciones

     * @return El atributo "funciones"

     */
	public String getfunciones(){
	return funciones;
	}

	/**

     * Método que devuelve el atributo turno

     * @return El atributo "turno"

     */
	public String getTurno(){
	return turno;
	}
}