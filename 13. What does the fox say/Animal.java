/**

 * Esta clase define objetos con los atributos  y metodos de nuestros animales

 * @author: Christian Sánchez Olvera

 * @version: 05/10/2018

 */


public class Animal 
{
	private String tipo;
	 /**
     * Constructor para la clase Animal
	 * 
     * @param tipo Tipo de animal
     */

	public Animal(String tipo){
		this.tipo = tipo;
	}

	 /**

     * Método que imprime los sonidos dependiendo del animal
	 * @param sonido Sonido que emite nuestro animal
     */

	public void Sonido (String sonido) {
				System.out.println(this.tipo + " goes " +sonido);
	}
}