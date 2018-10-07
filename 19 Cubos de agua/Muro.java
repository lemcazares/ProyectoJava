
/**

 * Esta clase define al muro que contendra cubos de agua y cubos negros

 *@author: Enrique Martinez

 *@author: Hector Cabello

 *@author: Christian Sanchez

 *@version: Octubre 5, 2018

 */


import java.util.ArrayList;
public class Muro{
//------------------- Atributos -------------------------------
  ArrayList<Columna> columnas = new ArrayList<Columna>();
  ArrayList<Integer> arregloInt = new ArrayList<Integer>();
//-------------------- Métodos --------------------------------
  public Muro(ArrayList<Integer> arreglo){
    this.arregloInt = arreglo;
    int posicion = 0;
    for(int numeroDeCubosNegros : arreglo){
      columnas.add(posicion,new Columna(posicion,numeroDeCubosNegros));
      posicion++;
    }
  }

  public void llenarConAgua(){

  }

  public String toString(){
    return "Hola :D";
  }

}
