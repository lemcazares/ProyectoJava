/**

 * Esta clase define objetos con los atributos  y metodos de nuestros animales

 * @author: Christian Sánchez Olvera

 * @version: 05/10/2018

 */


public class Animal //Abstraccion
{
	
	private String alimento;// Encapsulamiento

		/**

     * Constructor para la clase Animal
	 * 
     * @param alimento Tipo del alimento del animal
     */

	public void setAlimento(String alimento){
		this.alimento = alimento;
	}

	 /**

     * Metodo que obitne el atributo alimento del objeto
	 * 
     * @return alimento nombre
     */	

	public String getAlimento()
	{
		return alimento;
	}

    /**

     * Método abstracto creado para definir como cazaran cada uno delos animales de nuestras subclases

     */
	public void cazar(){} // Metodo Abstracto
}


