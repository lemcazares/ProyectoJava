/**
Esta es una descripcion muy corta de lo que hace la clase Testeo.
@author SomePrebe.
@version 1.0.
*/
public class ClasePerfecta<T> extends Object{
  public int atributo1;
  public T generico;

//-------- metodos --------------
/**
  Metodo Generico.
  @return una instancia de la clase Object.
*/
  public Object metodoGenerico(){
    return new Object();
  }
/**
Método clone.
Sobrescritura del metodo clone en object.
@return una instancia de la clase object.
*/
  protected Object clone(){
    return new Object();
  }
/**
Método equals.
Sobrescritura del metodo equals en object.
@return un booleano.
*/
  public boolean equals(){
    return true;
  }
/**
Método finalize.
Sobrescritura del metodo finalize en object.
*/
  protected void finalize(){

  }
  //public Class<?> getClass();
/**
Método hashCode.
Sobrescritura del metodo hashCode en object.
@return un int.
*/
  public int hashCode(){
    return 1;
  }
  //public void notify();
  //public void notifyAll();
/**
Método toString.
Sobrescritura del metodo toString en object.
@return un String.
*/
  public String toString(){
    return "Hola";
  }
  /*public void wait(){

  }*/
  /*public void wait(long timeout){

  }*/
  /*public void wait(long timeout, int nanos){

  }*/

}
