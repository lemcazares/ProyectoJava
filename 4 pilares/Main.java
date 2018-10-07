/**

 * Esta clase define objetos con los atributos  y metodos de nuestros cocodrilos y animales

 * @author: Christian Sánchez Olvera

 * @version: 05/10/2018

 */



class Cocodrilo extends Animal //Herencia
{
	/**

     * Constructor para la clase Cocodrilo(Animal)
	 * 
     * @param alimento Tipo de alimento del animal
     */

	Cocodrilo (String alimento)
	{
		setAlimento(alimento);
	}
	public void cazar()
	{

		System.out.println("Estoy comiendo "+getAlimento());
	}
}


class Mamut extends Animal //Herencia
{
	/**

     * Constructor para la clase Mamut(Animal)
	 * 
     * @param alimento Tipo de alimento del animal
     */
	Mamut (String alimento)
	{
		setAlimento(alimento);
	}
	public void cazar()
	{

		System.out.println("Estoy comiendo "+getAlimento());
	}
}

public class Main 
{
	public static void main(String[] args) {
			Cocodrilo c = new Cocodrilo("Ciervos");
			Mamut m = new Mamut("Tigres Bengala");


			c.cazar(); //Polimorfismo
			m.cazar(); //Polimorfismo
	}




}