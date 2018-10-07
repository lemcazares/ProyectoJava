/**

 * Esta clase define los movimientos minimos para resolver

 *las torresde Hannoi dados ciertos discos

 * @author: Enrique Martinez Cazares

 * @author: Hector Cabello

 * @author: Christian Sanchez

 * @version: Octubre 5, 2018

 */





import java.util.Scanner;
import java.lang.Math;

public class Hannoi
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		System.out.print("Con cuantos discos quieres jugar: ");
		int discos =  sc.nextInt();
		funcion(discos, 1,2,3);
		int movimientos = (int) (Math.pow(2,discos) -1);
		System.out.println("El numero de movimientos para "+ discos + " discos es "+movimientos+" movimientos.");
	}

	public static void funcion (int discos, int inicio, int auxiliar, int destino)
	{
	if (discos == 1)
		System.out.println("Moviendo de la torre "+ inicio +" a la torre "+destino);
	else
	{
		funcion(discos -1, inicio, destino, auxiliar);
		System.out.println("Moviendo de la torre "+ inicio + " a la torre "+destino);
		funcion(discos -1, auxiliar, inicio, destino);
	}
}
}
