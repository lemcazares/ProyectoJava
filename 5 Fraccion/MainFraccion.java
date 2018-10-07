/**

 * Esta clase hereda de la clase fraccion, aqui se encuentra el main

 *recibe datos de consola

 * @author: Enrique Martinez Cazares

 * @author: Hector Cabello

 * @author: Christian Sanchez
 
 * @version: Octubre 5, 2018

 */

import java.util.Scanner;

public class MainFraccion extends Fraccion{

  public static void main(String[] args) {

    Scanner reader = new Scanner(System.in);
    Fraccion f1 = new Fraccion();
    int a, b, c, d;


    System.out.print("Ingresa un numero para el numerador:  ");
    a = reader.nextInt();
    c = a;
    System.out.print("Ingresa un numero para el denominador: ");
    b = reader.nextInt();
    d = b;
    f1.setNumerador(a);
    f1.setDenominador(b);

    f1.Reducir(f1);

    System.out.println(c+"/"+d+" = "+f1.getNumerador()+"/"+f1.getDenominador());




  }
}
