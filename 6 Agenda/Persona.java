/**

 * Esta clase define objetos con los atributos  y metodos de cada Persona

 * @author: Christian Sánchez Olvera

 * @version: 05/10/2018

 */


public class Persona 
{
	private String nombre;
	private String telefono;
	private String mascota;

	/**

     * Constructor para la clase Persona
	 * 
     * @param nombre Nombre de la persona
     * @param telefono Telfono de la persona
     * @param mascota Nombre de la mascota de la persona
     */

	public Persona(String nombre, String telefono, String mascota)
	{
		this.nombre = nombre;
		this.telefono = telefono;
		this.mascota = mascota;
	}

	 /**

     * Metodo que obitne el atributo telefono del objeto
	 * 
     * @return telefono
     */	

	public String getTelefono()
	{
		return telefono;
	}


	 /**

     * Método que imprime los datos de una Persona a nuestra lista

     */

	public void ImprimirDatos()
	{
		System.out.println("Nombre: "+nombre);
		System.out.println("Telefono: "+telefono);
		System.out.println("Mascota: "+mascota);
	}
}