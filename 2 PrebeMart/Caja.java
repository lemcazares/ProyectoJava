import java.util.Scanner;
import java.util.ArrayList;
/**
Clase que abstrae la caja que cobra en las tiendas.
@author SomePrebe.
@version 1.0.
*/
public class Caja{
  ArrayList<Producto> productos = new ArrayList <Producto>();
  private int total = 0;
/**
Metodo constructor Caja.
*/
  Caja(){}
/**
Método constructor Caja.
@param productos: es una lista de productos.
*/
  Caja(ArrayList<Producto> productos){
    this.productos = productos;
  }
/**
Método que devulve el valor del atributo total.
@return total.
*/
  int getTotal(){
    return total;
  }
/**
Metodo que simula la accion de pagar.
*/
  void pagar(){
    System.out.println(productos);
    System.out.println("\tSu total es de :" + getTotal());
  }
/**
Método que ingresa los productos a la lista.
*/
  public void ingresarProducto(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingresa nombre del producto: ");
    String nombre = sc.nextLine();
    System.out.print("Ingresa el precio del producto: ");
    int precio = sc.nextInt();
    this.total += precio;
    productos.add(new Producto(nombre,precio));
  }
}
