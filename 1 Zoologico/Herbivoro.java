/**
Ejemplo: círculos.
*
*@author SomePrebe.
*@version 1.0.
*/
public class Herbivoro implements Animal{
//---------- atributos ---------------
  String comidaFavorita;
  String tipoAnimal;
//---------- metodos ------------------
/**
*Constructor de la clase Herbivoro.
*@param tipoAnimal este parametro es un animal.
*@param comidaFavorita es la comida favorita del animal en cuestion.
*/
  public Herbivoro(String tipoAnimal, String comidaFavorita){
    this.tipoAnimal = tipoAnimal;
    this.comidaFavorita = comidaFavorita;
  }
/**
*Metodo jugar de la clase Herbivoro.
*/
  public void jugar(){
    System.out.println("Estoy bailando ...");
  }
/**
*Metodo comer.
*/
  public void comer(){}
/**
*Metodo comer.
@param a
*/
  public void comer(Animal a){}
}
