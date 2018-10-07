/**
Clase Producto con atributos nombre y precio.
@author SomePrebe.
@version 1.0.
*/
public class Producto{
//---------- atributos -------------------
  String nombreProducto;
  int precio;
//---------- metodos -----------------------
/**
Metodo constructor Producto.
@param nombreProducto: nombre del prducto.
@param precio: precio del producto.
*/
  Producto(String nombreProducto, int precio){
    this.nombreProducto = nombreProducto;
    this.precio = precio;
  }
/**
Sobreescritura del metodo toString.
@return nombreProducto.
*/
  public String toSting(){
    return nombreProducto;
  }
}
