/**

 * Esta clase define una columna conformada por numeroDeCubos como parametro

 *@author: Enrique Martinez

 *@author: Hector Cabello

 *@author: Christian Sanchez

 * @version: Octubre 5, 2018

 */


import java.util.ArrayList;
public class Columna{
  ArrayList<Cubo> columna = new ArrayList<Cubo>();
  private int numeroDeCubos;
//------------------ Metedos ----------------
  public Columna(int posicionX,int numeroDeCubos){
    for(int posicionY = 0 ; posicionY < numeroDeCubos ; posicionY++){
      columna.add(new CuboNegro(posicionX,posicionY));
    }
    this.numeroDeCubos = numeroDeCubos;
  }

  public void setCubo(Cubo cubo){
    columna.add(cubo);
    this.numeroDeCubos ++;
  }
  public int numeroDeCubos(){
    return this.numeroDeCubos;
  }
}
