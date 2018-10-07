/**

 * Esta clase es una clase inservible pues no hereda, y no es posible

 * crear objetos a través de su constructor*

 * @author: Enrique Martinez

 * @author: Hector Cabello

 * @author: Christian Sanchez

 * @version: Octubre 5, 2018

 */


public final class ClaseInservible extends Object{
  /*
    - Si una clase se marca como final, no se podrá extender la clase.
  */

  private ClaseInservible(){
    //Al hacer mi constructor privado lo que logro es que niguna clase de primer nivel pueda hacer uso de ella.
  }
}
