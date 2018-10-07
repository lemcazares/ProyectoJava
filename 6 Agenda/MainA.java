import java.util.Scanner;

/**

 * Esta programa es una agenda 

 * @author: Christian Sánchez Olvera

 * @version: 05/10/2018

 */


public class MainA



{
	public static void main(String[] args) 
	{
		boolean bandera = true;
		Scanner sc = new Scanner(System.in);
		int entrada;
		String telefono;
		Agenda nueva = new Agenda();

		do{

		System.out.println("Ingrese que desea hacer: ");
		System.out.println("1. Agregar");
		System.out.println("2. Buscar");
		System.out.println("3. Borrar una persona");
		System.out.println("4. Borrar a todos, alv");
		System.out.println("5. Salir");
		entrada = sc.nextInt();

		switch (entrada) 
			{
			case 1:
				System.out.println("Digite los datos");
				nueva.agregar();
				sc.nextLine();
				break;
			case 2:
				System.out.println("Ingrese el telefono del contacto a buscar");
				sc.nextLine();
				telefono = sc.nextLine();
				nueva.buscar(telefono);
				break;
			case 3:
				System.out.println("Ingrese el telefono de la persona a borrar");
				sc.nextLine();
				telefono = sc.nextLine();
				nueva.borrar(telefono);
				break;
			case 4:
				System.out.println("Ha elegido borrar a todos :'v");
				nueva.mandartalv();
				System.out.println("Se ha borrado exitosamente su agenda");
				break;
			case 5:
				bandera = false;
				break;
			default:
				System.out.println("Ingrese una opcion correcta");
			}


		}
		while (bandera); 
	System.out.println("Hasta luego");	
	}
}