/**
Alguna descripcion larga sobre lo que hace esta clase llamada
Carnivoro.
@author SomePrebe.
@version 1.0.
*/

public class Carnivoro implements Animal{
//---------- atributos --------------
  String comidaFavorita;
  String tipoAnimal;
//---------- metodos ---------------
/**
*Constructor de la clase Carnivoro.
*@param tipoAnimal este parametro es un animal.
*@param comidaFavorita es la comida favorita del animal en cuestion.
*/
  public Carnivoro(String tipoAnimal, String comidaFavorita){
    this.tipoAnimal = tipoAnimal;
    this.comidaFavorita = comidaFavorita;
  }
/**
*Metodo jugar de la clase Herbivoro.
*/
  public void jugar(){
    System.out.println("Estoy cantando ");
  }
/**
*Metodo comer.
*/
  public void comer(){}
/**
*Metodo comer.
*@param a
*/
  public void comer(Animal a){
    if (a.getClass() == Carnivoro.class) {
      Carnivoro algunAnimal = (Carnivoro) a;
      System.out.println("Este " + algunAnimal.tipoAnimal + "esta delicioso ... :9");
    }else{
      Herbivoro algunAnimal = (Herbivoro) a;
      System.out.println("Este " + algunAnimal.tipoAnimal + "esta delicioso ... :9");
    }
  }
}
