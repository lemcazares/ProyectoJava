import java.util.ArrayList;
import java.util.Scanner;

/**

 * Esta clase define objetos con los atributos  y metodos de la Agenda

 * @author: Christian Sánchez Olvera

 * @version: 05/10/2018

 */

public class Agenda{

ArrayList<Persona> contactos = new ArrayList<Persona>();
Scanner sc = new Scanner(System.in);

public Agenda(){}
    /**

     * Método que agrega una Persona a nuestra lista

     */


public void agregar ()
{
	System.out.println("Nombre: ");
	String nombre = sc.nextLine();
	System.out.println("Telefono: ");
	String telefono = sc.nextLine();
	System.out.println("Mascota: ");
	String mascota = sc.nextLine();
	

	Persona nueva = 
	new Persona(nombre,telefono,mascota);
	contactos.add(nueva);
}

    /**

     * Método que busca una Persona a nuestra lista

     */

public void buscar (String telefono)
{
	boolean bandera = false;
	int n = contactos.size();
	for (int i = 0; i<n ; i++) {
		
		if(telefono.equals(contactos.get(i).getTelefono()))
		{
			contactos.get(i).ImprimirDatos();
			bandera = true;
		}

	}
	if(bandera == false)
	System.out.println("No existe el telefono "+telefono);
}
    /**

     * Método que borra una Persona de nuestra lista

     */
public void borrar(String telefono)
{
	boolean bandera = false;
	int n = contactos.size();
	for (int i = 0; i<n ; i++) {
		
		if(telefono.equals(contactos.get(i).getTelefono()))
		{
			contactos.remove(i);
			bandera = true;	
		}	
		
	}
	if(bandera == false)	
	System.out.println("No existe el telefono alv"+telefono);
}

    /**

     * Método que manda todo alv

     */

public void mandartalv()
{
	contactos.clear();
}

}