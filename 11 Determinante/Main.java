import java.util.Scanner;
/**
*Clase Principal del programa
*@author: Some prebe .
*@version: 1.0.
*/
public class Main{
	/** Metodo Principal
	*/
	public static void main(String[] args){
		int opcion, elemento, tamanio;
		Scanner sc = new Scanner(System.in);
		Matriz matriz;
		double determinante;
		Boolean booleano = true;
		do{
			System.out.println("\t##### Bienvenido #####");
			System.out.println("\n1)Calcular determinantes");
			System.out.println("2)Salir");
			System.out.println("Elige una opcion: ");
			opcion = sc.nextInt();
			switch(opcion){
				case 1:
					System.out.println("Ingresa el tamanio de la matriz: ");
					tamanio = sc.nextInt();
					matriz = new Matriz(tamanio);
					matriz.llenarMatriz();
					determinante = matriz.calcularDeterminante(matriz.getMatriz());
					System.out.println("El determinante de la matriz es: " + determinante);
					break;

				case 2:
					booleano = false;
					break;

				default:
					System.out.println("Opcion incorrecta");
				break;
			}
		}while(booleano);
	}
}
